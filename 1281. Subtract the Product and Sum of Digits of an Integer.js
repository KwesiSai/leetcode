/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let num = n.toString();
    let product =1;
    let sum= 0;
    for(let i =0; i<num.length;i++){
        sum+=parseInt(num[i]);
        product*=parseInt(num[i]);
    }
    return product - sum;
};
