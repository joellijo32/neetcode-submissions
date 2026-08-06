class Solution {

    void sort(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            int small = nums[i], pos = i;
            for(int j = i+1; j < nums.length; j++){
                if(small > nums[j]){
                    small = nums[j];
                    pos = j;
                }
            }
            nums[pos] = nums[i];
            nums[i] = small;
        }
    }
    public int maxProductDifference(int[] nums) {
        sort(nums); 
        return ((nums[nums.length-2]*nums[nums.length-1]) - (nums[0]*nums[1]));
    }
}