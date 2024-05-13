/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let notIncluded = [];
    let unique = new Set(nums)
    for(let i=1; i <= nums.length; i++){
        if(unique.has(i)!==true){
            notIncluded.push(i)
        }
    }
    return notIncluded;
};
