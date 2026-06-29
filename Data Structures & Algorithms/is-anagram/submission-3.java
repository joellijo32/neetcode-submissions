class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> isCharPresent = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char b = s.charAt(i);
            if(isCharPresent.containsKey(b)){
                int count = isCharPresent.get(b);
                isCharPresent.put(b, count+1);
            } else isCharPresent.put(b, 1);
        }
        
        for(int i = 0; i < t.length(); i++){
            char b = t.charAt(i);
            if(isCharPresent.containsKey(b)){
                int count = isCharPresent.get(b);
                count--;
                if(count == 0){
                    isCharPresent.remove(b);
                    
                }else 
                isCharPresent.put(b, count);
                if(i == t.length()-1) return true;
            } else return false;

        }
        return t.length() == 0;
    }

}
