/**
 * @param {string[]} operations
 * @return {number}
 */
var calPoints = function(operations) {
      let score = [];
    for(let i = 0; i < operations.length; i++){
        if(operations[i] === '+'){
                score.push(parseInt(score[score.length - 1]) + parseInt(score[score.length - 2]));
        }
        else if(operations[i] === 'C'){
            score.pop();
        }
        else if(operations[i] === 'D'){
                score.push(parseInt(score[score.length - 1]) * 2);
        }
        else{
            score.push(parseInt(operations[i]));
        } 
    }
    let sum = score.reduce((total, value) => total + value,0);
    return sum;
};
