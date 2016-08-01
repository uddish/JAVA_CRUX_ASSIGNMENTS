package java_assignment2;

import java.util.Scanner;

public class loweruppercase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a character");
		
		char value = s.next().charAt(0);
		if(value >= 65 && value <= 90)	{
			System.out.println("Upper Case");
		}
		else if(value >= 97 && value <= 122)	{
			System.out.println("Lower Case");
		}
		else if(value >= 33 && value <= 47)	{
			System.out.println("Special Character");
		}
		else
			System.out.println("Invalid Character");

	}

}
