class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        int currentIndex = 0;
        while(true){
            for (String str : strs) {
                if (currentIndex >= str.length()) {
                    return output; 
                }
            }
            char currentChar = strs[0].charAt(currentIndex);
            for(String str: strs){
                if(str.charAt(currentIndex) != currentChar){
                    return output;
                }
            }
            output += currentChar;
            currentIndex ++;
        }
    }
}
