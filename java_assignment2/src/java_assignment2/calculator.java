package java_assignment2;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("enter the character");
		char c = s.next().charAt(0);
		//String c = s.nextLine();
		if(c == '+')	{
			System.out.println(a+b);
		}
		else if(c == '-')
			System.out.println(a-b);
		else if(c == '*')
			System.out.println(a*b);
		else if(c == '/')
			System.out.println(a/b);
		else if(c == '%')
			System.out.println(a%b);
		else
			System.out.println("error");

	}

}
