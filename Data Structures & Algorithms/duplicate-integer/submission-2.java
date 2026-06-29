class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueNumber = new HashSet<>();
        for(int i = 0; i < nums.length ;i++){
            if(!(uniqueNumber.contains(nums[i]))) uniqueNumber.add(nums[i]);
            else return true;
        }
        return (uniqueNumber.size() != nums.length) ;
    }
}