/**
 * @param {number} n
 * @param {number[][]} logs
 * @return {number}
 */
var hardestWorker = function(n, logs) {
    let previousLeaveTime = 0;
    let maxDuration = 0;
    let maxWorker = logs[0][0];

    logs.forEach((task) => {
        let id = task[0];
        let leaveTime = task[1];
        let duration = leaveTime - previousLeaveTime;

        if (duration > maxDuration) {
            maxDuration = duration;
            maxWorker = id;
        } else if (duration === maxDuration && id < maxWorker) {
            maxWorker = id;
        }

        previousLeaveTime = leaveTime;
    });

    return maxWorker;
};
