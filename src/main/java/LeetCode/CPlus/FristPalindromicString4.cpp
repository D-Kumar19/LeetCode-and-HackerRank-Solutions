#include <iostream>
#include <vector>

using namespace std;

// Method # 01:
string firstPalindrome(vector<string>& words) {
	ios_base::sync_with_stdio(false);
	cout.tie(NULL);
	cin.tie(NULL);
	for (string word: words) {
		string s = word;

		bool isPalindrome = true;

		for (int i = 0; i < s.length() / 2; i++) {
			if (s[i] != s[s.length() - i - 1]) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) return s;
	}
	return "";
}

// Method # 02:
/*
string firstPalindrome(vector<string>& words) {
    for (auto &word : words){
        if (word == string(rbegin(word), rend(word))){
            return word;
		}
	}
    return "";
}
*/