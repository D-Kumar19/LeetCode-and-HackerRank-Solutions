package LeetCode.Java;

public class NumberAfterDoubleReversal2 {
	public boolean isSameAfterReversals(int num) {
		return reverse(reverse(num)) == num;
	}
	public int reverse(int x) {
		int signCheck = 1, revNum = 0;
		if(x < 0) signCheck = -1;
		x *= signCheck;

		while(x > 0){
			if (revNum*signCheck > Integer.MAX_VALUE/10 || revNum*signCheck < Integer.MIN_VALUE/10) return 0;
			revNum = revNum * 10 + x % 10;
			x /= 10;
		}
		return revNum * signCheck;
	}
}