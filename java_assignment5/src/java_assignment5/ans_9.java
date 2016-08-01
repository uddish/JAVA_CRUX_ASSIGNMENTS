package java_assignment5;

import java.util.Scanner;

public class ans_9 {
	
	public static boolean reverse(String s1, String s2, int index, int last)	{
		if(s1.length() != s2.length())	{
			return false;
		}
		if(index > s1.length() || last <= 0)	{
			return true;
		}
		if(s1.charAt(index) != s2.charAt(last))	{
			return false;
		}
		if(s1.charAt(index) == s2.charAt(last))	{
			return reverse(s1,s2,index+1,last-1);
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter strings");
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		System.out.println(reverse(s1, s2, 0, s2.length()-1));
	}

}
