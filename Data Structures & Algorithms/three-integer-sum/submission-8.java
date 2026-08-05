class Solution {
    void sort(int[] nums){
        for(int  i = 0; i < nums.length-1; i++){
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
    public List<List<Integer>> threeSum(int[] nums) {
        sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int startIdx = i+1;
            int endIdx = nums.length-1;
            int target = 0-nums[i];
            while(startIdx < endIdx){
                int sum = nums[startIdx] + nums[endIdx];
                if(sum < target) startIdx++;
                else if(sum > target) endIdx--;
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[startIdx]); list.add(nums[endIdx]);
                    result.add(list);
                    while(startIdx < endIdx && nums[startIdx] == nums[startIdx+1]) startIdx++;
                    while(startIdx < endIdx && nums[endIdx] == nums[endIdx-1]) endIdx--;
                    startIdx++;
                    endIdx--;
                }
            }
        }
        return result;
    }
}
