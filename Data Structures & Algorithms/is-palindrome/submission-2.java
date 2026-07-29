class Solution {

    boolean isNotAlphaNum(char b){
        return !( Character.isLetter(b) || Character.isDigit(b) );
    }

    public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        int start = 0, end = s.length() - 1;
        while(start <= end){
            char firstChar = s.charAt(start);
            char lastChar = s.charAt(end);
            while(isNotAlphaNum(firstChar) && start < end){
                start++;
                firstChar = s.charAt(start);
            }
            while(isNotAlphaNum(lastChar) && end > start){
                end--;
                lastChar = s.charAt(end);
            }
            if(firstChar != lastChar) return false;
            start++;
            end--;
        }
        return true;
    }
}
