package HackerRank.Java;

import java.util.Scanner;

public class OutputFormatter5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("================================");
		for(int i = 0; i < 3; i++){
			String stringInput = input.next();
			int integerInput = input.nextInt();
			System.out.printf("%-15s%03d%n", stringInput, integerInput);
		}
		System.out.println("================================");
		input.close();
	}
}