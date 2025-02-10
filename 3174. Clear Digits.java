class Solution {
    public String clearDigits(String s) {
        while(s.matches(".*\\d.*")){
            int indexOfDigit = -1;
            for(int i=0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    indexOfDigit = i;
                    break;
                }
            }
            if(indexOfDigit == -1) break;

            s = s.substring(0, indexOfDigit) + s.substring(indexOfDigit + 1);
            
            int indexOfNonDigit = -1;
            for(int i = indexOfDigit - 1; i >= 0; i--){
                if(!Character.isDigit(s.charAt(i))){
                    indexOfNonDigit = i;
                    break;
                }
            }
            if(indexOfNonDigit != -1){
                s= s.substring(0, indexOfNonDigit) + s.substring(indexOfNonDigit + 1);
            }
        
        }
        return s;
    }
}
