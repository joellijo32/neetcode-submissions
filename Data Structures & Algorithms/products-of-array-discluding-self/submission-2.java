class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int product = 1, numberOfZeros = 0;
        for(Integer number : nums){
            if(number == 0){
                numberOfZeros++;
                continue;
            }
            product *= number;
        }
        for(int i = 0; i < nums.length; i++){
            if(numberOfZeros > 1) result[i] = 0;
            else if(numberOfZeros == 1){
                if(nums[i] == 0){
                    result[i] = product;
                } else result[i] = 0;
            } else {
                result[i] = product / nums[i];
            }
        }
        return result;
    }
}  
