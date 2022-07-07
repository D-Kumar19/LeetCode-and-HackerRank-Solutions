#include <iostream>
#include <vector>
#include <numeric>
#include <unordered_map>

using namespace std;

// Method # 01: (Using GCD)
// Because if (gcd(x, k) * gcd(y, k) % k) returs 0 then we have found the correct Index.
// Or, gcd(x * y) % k will also return the same result. Slow but good for larger vector<int>.
int countPairs(vector<int>& nums, int k) {
    int count = 0;
    unordered_map<int, vector<int>> indexes;
    for(int i = 0; i < nums.size(); i++){
        indexes[nums[i]].push_back(i);
    }

    for(auto& [n, vectorOfIndex]: indexes){
        unordered_map<int, int> gcds;

        for(auto& index: vectorOfIndex){
            auto gcd_i = gcd(index, k);

            for(auto& [gcd_iCopy, gcdsCount]: gcds){
                if(gcd_i * gcd_iCopy % k == 0){
                    count += gcdsCount;
                }
            }
            gcds[gcd_i]++;
        }

    }
}

// Method # 02: 
int countPairs(vector<int>& nums, int k) {
    unordered_map<int, vector<int>> indexes;
    for(int i = 0; i < nums.size(); i++){
            indexes[nums[i]].push_back(i);
    }

    int count = 0;
    for(auto [number, vectorOfIndexes] : indexes){
        for(int i = 0; i < vectorOfIndexes.size(); i++){
            for(int j = 0; j < i; j++){
                if((vectorOfIndexes[i] * vectorOfIndexes[j]) % k == 0){
                    count++;
                }
            }
        }
    }
    return count;
}