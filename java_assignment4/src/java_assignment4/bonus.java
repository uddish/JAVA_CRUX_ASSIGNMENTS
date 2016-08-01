package java_assignment4;

import java.util.Scanner;

public class bonus {

	public static void check()	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
//		int count = 1;
		for(int i = 0;i < s1.length();i++)	{
			int count = 1;
			for(int j = i+1;j < s1.length();j++)	{
				if(s1.charAt(i) == s1.charAt(j))	{
					count++;
				}

			}
			i = i + count-1;
			System.out.print(s1.charAt(i));
			if(count > 1)	{
			System.out.print(count);
			}
		}
		
	}
	
	public static void main(String[] args) {
		check();
	}

}
