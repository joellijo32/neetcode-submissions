class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for(String string : strs ){
            result = result + string.length() + "#" + string;
        }
        return result;
    }

    public List<String> decode(String str) {
        String number = "";
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < str.length();){
            char b = str.charAt(i);
            if(b != '#'){
                number = number + "" + b; 
                i++;  
                continue;
            }
            int numberLength = Integer.parseInt(number);
            number = "";
            result.add(str.substring(i+1,numberLength+i+1));
            i = numberLength+i+1;
        }
        return result;
    }
}
