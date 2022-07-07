package HackerRank.Java;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		Scanner file = new Scanner(System.in);

		int i = 0;
		while(file.hasNext()){
			i = i + 1;
			String line = file.nextLine();
			System.out.println(i + " " + line);
		}
		file.close();
	}
}