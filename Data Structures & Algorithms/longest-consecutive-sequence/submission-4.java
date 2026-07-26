class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(Integer i : nums){
            numbers.add(i);
        }
        int longestSeq = 0;
        for(int i = 0; i < nums.length; i++){
            if(!numbers.contains(nums[i]-1)){
                int k = 1, nextNumber = nums[i]+1;
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
