/**
 * @param {string} sequence
 * @param {string} word
 * @return {number}
 */
var maxRepeating = function(sequence, word) {
     let maxRepeats = 0;
    let currentRepeats = 0;

    for (let i = 0; i <= sequence.length - word.length;) {
        if (sequence.slice(i, i + word.length) === word) {
            currentRepeats++;
            i += word.length;
        } else {
            maxRepeats = Math.max(maxRepeats, currentRepeats);
            currentRepeats = 0;
            i++;
        }
    }

    maxRepeats = Math.max(maxRepeats, currentRepeats);

    return maxRepeats;
};
