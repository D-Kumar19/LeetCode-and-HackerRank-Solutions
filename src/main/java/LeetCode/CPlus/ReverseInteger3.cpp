#include <iostream>

using namespace std;

int reverse(int x) {
    // If number has the lowest value and if we multiply it with -1 to make it positive it will throw an Exception as number will be out of Range!
    if (x == -pow(2, 31)) return 0;
    
    long revNum = 0;
    int signCheck = 1;

    if (x < 0) signCheck = -1;
    x = x * signCheck;

    while (x) {
        revNum = revNum*10 + x%10;
        x = x / 10;
    }

    if (signCheck == -1 && revNum <= pow(2, 31)) {
        revNum = -revNum;
        return revNum;
    }
    else if (signCheck == 1 && revNum <= pow(2, 31) - 1) return revNum;
    return 0;
}