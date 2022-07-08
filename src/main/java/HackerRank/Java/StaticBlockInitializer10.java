package HackerRank.Java;

import java.util.Scanner;

public class StaticBlockInitializer10 {
	static Scanner Input = new Scanner(System.in);
	static int B = Input.nextInt();
	static int H = Input.nextInt();
	static Boolean flag  = true;
	static{
		try{
			if(B <= 0 || H <= 0){
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}
}