class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder();
        int partLength = part.length();
        if(s.length() == partLength){
            if(s.equals(part)){
                s = "";
                return s;
            }
        }
        for(int i = 0; i < s.length(); i++){
            str.append(s.charAt(i));

            if(str.length() >= part.length()){
                int j= str.length() - partLength;
                if(j + partLength <= str.length() && str.substring(j, j+partLength).equals(part)){
                    str.delete(j, str.length());
                }
                
            }
        }
        return str.toString();
    }
}
