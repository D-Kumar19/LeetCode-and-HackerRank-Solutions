package HackerRank.Java;

import java.util.Scanner;

public class StdinStdout4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int integerInput = input.nextInt();
		double doubleInput = input.nextDouble();
		input.nextLine();
		String stringInput = input.nextLine();

		System.out.println("String: " + stringInput);
		System.out.println("Double: " + doubleInput);
		System.out.println("Int: " + integerInput);

		input.close();
	}
}