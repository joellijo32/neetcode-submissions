class Solution {
    public boolean hasDuplicate(int[] nums) {
        int length = nums.length; 
        boolean IsDouble = false; 
        for(int i = 0; i < length; i++){
            int element = nums[i]; 
            for(int j = i+1; j < length; j++){
                if(element == nums[j]){
                    IsDouble = true; 
                    break;
                }
            }
            if(IsDouble) break;
        }
        if(IsDouble){
            return IsDouble;  
        } 
        return false;         
    }
}