package HackerRank.Java;

import java.util.Scanner;

public class Loops7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for(int i = 0; i < t; i++){
			int a = input.nextInt();
			int b = input.nextInt();
			int n = input.nextInt();

			int result = 0;
			result = result + a;
			for (int j = 0; j < n; j++){
				result = result + (b*(int)Math.pow(2, j));
				System.out.print(result + " ");
			}
			System.out.println();
			result = 0;
		}
		input.close();
	}
}