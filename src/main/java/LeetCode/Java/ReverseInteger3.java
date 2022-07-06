package LeetCode.Java;

public class ReverseInteger3 {
	public int reverse(int x) {
		// Method # 01:
		/*
		int signCheck = 1, revNum = 0;
		if(x < 0) signCheck = -1;
		x *= signCheck;

		while(x != 0){
			if (revNum*signCheck > Integer.MAX_VALUE/10 || revNum*signCheck < Integer.MIN_VALUE/10) return 0;
			revNum = revNum * 10 + x % 10;
			x /= 10;
		}
		return revNum * signCheck;
		 */

		// Method # 02:
		int revNum = 0;
		while(x != 0){
			int remainder = x % 10;
			int rev = revNum * 10 + remainder;
			if((rev - remainder)/10 != revNum) return 0;
			revNum = rev;
			x /= 10;
		}
		return revNum;
	}
}