package lecture4;

import java.util.Scanner;

public class subString {
	
	public static void subString()	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = s.nextLine();
		for(int i = 0;i < s1.length();i++)	{
			for(int j = i;j < s1.length();j++)	{
				System.out.println(s1.substring(i,j+1));
			}
		}
		
	}

	public static void main(String[] args) {
		subString();
	}

}
