class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int endIdx = numbers.length-1;
        int startIdx = 0;
        while(startIdx < endIdx){
            int sum = numbers[startIdx] + numbers[endIdx];
            if(sum > target) endIdx--;
            else if(sum < target) startIdx++;
            else {
                result[0] = startIdx+1;
                result[1] = endIdx + 1;
                return result;
            }
        }
        return result;
    }
}
