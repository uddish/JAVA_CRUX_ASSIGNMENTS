package java_assignment4;

import java.util.Scanner;

public class ans_6_improved {

	public static void main(String[] args) {

		int small = 100,startIndex = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		int length = 0;
		
		for(int i = 0;i < s1.length();i++)	{
			if(s1.charAt(i) != ' ')	{
				length++;

			}
			else	{
				if(length < small)	{
					small = length;
					startIndex = i-length;
					
				}
				length = 0;
				
			}
			
		}
			System.out.print(s1.substring(startIndex,startIndex+small));

	}

}