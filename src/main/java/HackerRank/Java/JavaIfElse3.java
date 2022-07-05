package HackerRank.Java;

import java.util.Scanner;

public class JavaIfElse3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if(N % 2 == 1) System.out.println("Weird");
		else if(N >= 2 && N <= 5) System.out.println("Not Weird");
		else if(N >= 6 && N <= 20) System.out.println("Weird");
		else System.out.println("Not Weird");
		input.close();
	}
}