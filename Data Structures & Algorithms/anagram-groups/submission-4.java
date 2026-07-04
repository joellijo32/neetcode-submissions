class Solution {

    boolean isAnagram(String str1, String str2){
            if(str1.length() != str2.length()) return false;

            HashMap<Character, Integer> firstString = new HashMap<>();
            for(int i = 0; i < str1.length(); i++){
                char currentChar = str1.charAt(i);
                if(firstString.containsKey(currentChar)){
                    int count = firstString.get(currentChar);
                    count++;
                    firstString.put(currentChar, count);
                } else firstString.put(currentChar, 1);
            }

            for(int i = 0; i < str2.length(); i++){
                char currentChar = str2.charAt(i);
                if(firstString.containsKey(currentChar)){
                    int count = firstString.get(currentChar);
                    count--;
                    if(count == 0){
                        firstString.remove(currentChar);
                        continue;
                    }
                    firstString.put(currentChar, count);
                }
                else return false;
            }

            return firstString.size() == 0;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashSet<Integer> visitedPosition = new HashSet<>();
        for(int i = 0; i < strs.length; i++){
            if(visitedPosition.contains(i)) continue;
            List<String> innerRow = new ArrayList<>();
            innerRow.add(strs[i]);
            for(int j = i+1; j < strs.length; j++){
                if(visitedPosition.contains(j)) continue;
                if(isAnagram(strs[i], strs[j])){
                    innerRow.add(strs[j]);
                    visitedPosition.add(j);
                }
            }
            visitedPosition.add(i);
            result.add(innerRow);
        }

        

       
        return result;
    }
}
