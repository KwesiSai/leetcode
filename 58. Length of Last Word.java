class Solution {
    public int lengthOfLastWord(String s) {
        String lastword = "";
        s = s.trim();
        
        if(s.indexOf(' ') == -1)
        return s.length();

        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                lastword = s.substring(i+1);
    
            }
        }
        return lastword.length();
    }
}
