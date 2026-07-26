class Solution {

    int shortestNumber(HashSet<Integer> numbers){
        int shortest = Integer.MAX_VALUE;
        for(Integer i : numbers){
            if(i <= shortest){
                shortest = i;
            }
        }
        return shortest;
    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            numbers.add(nums[i]);
        }
        int shortest = shortestNumber(numbers);
        int k = 0,  longestSeq = k;
        while(longestSeq != nums.length && numbers.contains(shortest)){
            int nextNumber = shortest + 1;
            if(k == 0) k = 1;
            while(numbers.contains(nextNumber)){
                if(k == 0) k = 2;
                else k++;
                numbers.remove(nextNumber);
                nextNumber++;
            }
            numbers.remove(shortest);
            if(k > longestSeq) longestSeq = k;
            shortest = shortestNumber(numbers);
            k=0;

        }

        return longestSeq;
    }
}