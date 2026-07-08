class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List[] count = new ArrayList[nums.length+1];
        for(int i = 0; i < nums.length+1; i++){
            count[i] = new ArrayList<>();
        }
        HashMap<Integer, Integer> numberCount = new HashMap<>();
        for(int i =0; i < nums.length; i++){
            if(numberCount.containsKey(nums[i])){
               int cnt = numberCount.get(nums[i]);
               cnt++;
               numberCount.put(nums[i], cnt); 
            } else {
                numberCount.put(nums[i], 1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(!numberCount.containsKey(nums[i])) continue;
            count[numberCount.get(nums[i])].add(nums[i]);
            numberCount.remove(nums[i]);
        }
        int[] result = new int[k]; int pos = 0;
        for(int i = nums.length; i >= 0; i--){
            if(pos == k) break;
            if(count[i].size() != 0){
                for(Object item : count[i]){
                    if(pos == k) break;
                    result[pos] = (Integer) item;
                    pos++;
                }
            }
        }
        return result;
    }
}
