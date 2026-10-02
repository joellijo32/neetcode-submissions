class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> unique = new HashSet<>();
        int subLength = 0, result = 0;
        if (s.length() == 0 || s.length() == 1) return s.length();
        for (int i = 0; i < s.length()-1; i++) {
            char b = s.charAt(i);
            unique.add(b);
            subLength = 1;
            for (int j = i+1; j < s.length(); j++) {
                char nextChar = s.charAt(j);
                if (unique.contains(nextChar)) break;
                unique.add(nextChar); subLength++;
            }
            result = Math.max(result, subLength);
            unique.clear();
        }
        return result;
    }
}
