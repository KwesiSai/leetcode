class Solution {
    public int strStr(String haystack, String needle) {
        String match = "";
        int firstindex = 0;
        if(haystack.indexOf(needle.charAt(0)) == -1){
            return -1;
        }
        for(int i=0; i < haystack.length() ; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                match = "";
                firstindex = i;
                int j = 0;

                while(j < needle.length() && i+j < haystack.length()){
                    match += haystack.charAt(i+j);
                    j++;
                }
                
                if(match.equals(needle)){
                    return firstindex;
                }
            }
        }
           
        return -1;
    }
}
