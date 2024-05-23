/**
 * @param {number} num
 * @return {string}
 */
var convertToBase7 = function(num) {
    // return num.toString(7)
    
    negativeNum = num < 0;
    num = Math.abs(num)
    if (num == 0)
    return '0'
   let toBase7 = "";
    while(num>0){
        toBase7 = `${num % 7}${toBase7}`;
        num = Math.floor(num/7);
    }
    return negativeNum ? `-${toBase7}` : toBase7;

};
