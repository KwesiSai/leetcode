class Solution {
public:
    int hardestWorker(int n, vector<vector<int>>& logs) {
        int maxDuration = 0; 
        int maxWorker = logs[0][0];
        int previousLeaveTime = 0;
        for(int i = 0; i < logs.size(); i++){
            int workerID = logs[i][0];
            int leaveTime = logs[i][1];
            int duration = leaveTime - previousLeaveTime;
            if(duration > maxDuration){
                maxWorker = workerID;
                maxDuration = duration;
            }
            else if(duration == maxDuration && workerID < maxWorker){
                maxWorker = workerID;
            }
            previousLeaveTime = leaveTime;
        }
        return maxWorker;
    };
    
};
