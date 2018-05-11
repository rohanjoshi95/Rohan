package study.palindrome;

import java.util.Scanner;

public class UserPal {

	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		int num;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		p.isPalindrome(num);

	}

}
