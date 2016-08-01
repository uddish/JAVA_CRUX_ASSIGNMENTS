package java_assignment5;

import java.util.Scanner;

public class ans_4 {

	public static boolean pallindrome(String s1, int index, int last)	{
		if(index >= last)	{
			return true;
		}
		if(s1.charAt(index) != s1.charAt(last))	{
			return false;
		}
		if(s1.charAt(index) == s1.charAt(last))	{
			return pallindrome(s1,index+1, last-1);			// index++ and last-- won't work
		}
			return true;

	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");	
		String s1 = s.nextLine();
		System.out.println(pallindrome(s1,0,s1.length()-1));
	}

}
