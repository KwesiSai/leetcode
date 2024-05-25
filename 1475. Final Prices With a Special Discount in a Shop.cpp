#include <vector>
using namespace std;

class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {
        vector<int> newprices;

        for (int i = 0; i < prices.size(); ++i) {
            int finalPrice = prices[i];

            for (int j = i + 1; j < prices.size(); ++j) {
                if (prices[j] <= prices[i]) {
                    finalPrice = prices[i] - prices[j];
                    break;
                }
            
            }

            newprices.push_back(finalPrice);
        }

        return newprices;
    }
};
