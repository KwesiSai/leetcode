/**
 * @param {number} n
 * @return {number}
 */
var hammingWeight = function(n) {
    let binaryDigit  = n.toString(2);
    let count = 0;
    for(let i = 0; i < binaryDigit.length; i++){
        if(binaryDigit[i] === '1'){
            count++
        }
    }
    return count;
};
