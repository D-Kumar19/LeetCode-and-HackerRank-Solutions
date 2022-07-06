#include <iostream>

using namespace std;

// Method # 01: 
/*
bool isSameAfterReversals(int num) {
    return !(num != 0 && num % 10 == 0);
}
*/

bool isSameAfterReversals(int num) {
	return reverse(reverse(num)) == num;
}

int reverse(int x) {
	int signCheck = 1, revNum = 0;
	if (x < 0) signCheck = -1;
	x *= signCheck;

	while (x > 0) {
		if (revNum*signCheck > INT_MAX/10 || revNum*signCheck < INT_MIN/10) return 0;
		revNum = revNum*10 + x%10;
		x /= 10;
    }
	return revNum*signCheck;
}