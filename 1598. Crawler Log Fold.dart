class Solution {
  int minOperations(List<String> logs) {
    var deepcount = 0;
    for(int i = 0; i < logs.length; i++ ){
        if(logs[i] == "../"){
            if(deepcount != 0){
                deepcount --; 
            }
        }
        else if(logs[i] != "./"){
            deepcount ++;
        }
    }
    return deepcount;
    
  }
}
