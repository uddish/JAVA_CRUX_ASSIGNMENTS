package java_assignment4;

import java.util.Scanner;

public class ans_3 {

	public static void checkString(String s1)	{
		Scanner s = new Scanner(System.in);
		int i;
		for(i = 0;i < s1.length()-2;i++)	{
				if(s1.charAt(i) == s1.charAt(i+1))	{
					i++;
					System.out.print(s1.charAt(i));
				}

				else	{
					System.out.print(s1.charAt(i));
				}
				
		}
		System.out.print(s1.charAt(i));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		checkString(s1);

	}

}
