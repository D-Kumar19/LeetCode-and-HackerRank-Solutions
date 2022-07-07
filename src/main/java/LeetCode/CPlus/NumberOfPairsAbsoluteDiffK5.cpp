#include <iostream>
#include <vector>

using namespace std;

int countKDifference(vector<int>& nums, int k) {
    ios_base::sync_with_stdio(false);
	cout.tie(NULL);
	cin.tie(NULL);
    
    int count = 0;
    int n = nums.size();
    int arr[101] = {};

    for (int num : nums) {
        arr[num]++;
    }

    for (int i = k + 1; i < 101; i++) {
        count += arr[i] * arr[i - k];
    }
    return count;
}