package HackerRank.Java;

import java.util.Scanner;

public class IntToString11 {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();

			// Method # 01:
			String s = String.valueOf(n);

			// Method # 02:
			// String s = Integer.toString(n);

			// Method # 03:
			// String s = "" + n;

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}