class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(Integer i : nums){
            numbers.add(i);
        }
        int longestSeq = 0;
        for(int i : nums){
            if(!numbers.contains(i-1)){
                int k = 1, nextNumber = i+1;
                while(numbers.contains(nextNumber)){
                    k++;
                    nextNumber++;
                } 
                if(k > longestSeq) longestSeq = k;
            }

        }

        return longestSeq;
    }
}
