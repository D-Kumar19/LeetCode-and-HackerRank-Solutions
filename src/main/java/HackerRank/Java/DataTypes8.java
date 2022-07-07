package HackerRank.Java;

import java.util.Scanner;

public class DataTypes8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for(int i = 0; i < t; i++){
			try{
				long x = input.nextLong();
				System.out.println(x + " can be fitted in:");
				if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)System.out.println("* byte");
				if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
				if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
				System.out.println("* long");
			}
			catch(Exception e){
				System.out.println(input.next() + " can't be fitted anywhere.");
			}
		}
	}
}