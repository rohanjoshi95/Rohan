package study.reversestring;

import java.util.Scanner;

public class UserReverse {

	public static void main(String[] args) {
		
		String input;
		ReverseString r=new ReverseString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input as string");
		input=sc.next();
		r.revstring(input);

	}

}
