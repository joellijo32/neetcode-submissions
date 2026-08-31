class Solution {
    public int trap(int[] height) {
        int maxLeft[] = new int[height.length];
        int maxRight[] = new int[height.length];
        int min[] = new int[height.length];
        int pivot = 0;
        for(int i = 0; i < height.length; i++){
            maxLeft[i] = pivot;
            if(pivot < height[i]) pivot = height[i];
        }
        pivot = 0;
        for(int i = height.length -1; i > -1; i--){
            maxRight[i] = pivot;
            if(pivot < height[i]) pivot = height[i];
        }
        
        for(int i = 0; i < height.length; i++){
            if(maxRight[i] < maxLeft[i]) min[i] = maxRight[i];
            else min[i] = maxLeft[i];
        }

        int result = 0;
        for(int i = 0; i < height.length; i++){
            int sum = min[i] - height[i];
            if(sum >= 0) result+= sum;
        }
        return result;
    }
}
