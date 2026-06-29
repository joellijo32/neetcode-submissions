class Solution {
    public boolean isAnagram(String s, String t) {
        int lens = s.length(); 
        int lent = t.length(); 
        if(lens != lent) return false; 
        char arrs[] = new char[lens]; 
        char arrt[] = new char[lens]; 
        for(int i = 0; i < lens; i++){
            arrs[i] = s.charAt(i); 
        }
        for(int i = 0; i < lens; i++){
            arrt[i] = t.charAt(i); 
        }
        for(int i = 0; i < lent; i++){
            char element = arrs[i]; 
            for(int j = 0; j < lens; j++){
                if(element == arrt[j]){
                    arrs[i] = 't'; 
                    arrt[j] = ' '; 
                    break;
                }
            }
        }

        for(int i = 0; i < lens; i++){
            if(arrs[i] != 't') return false; 
        }
        return true; 
    }
}
