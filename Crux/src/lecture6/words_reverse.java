package lecture6;

import java.util.Scanner;

public class words_reverse {				//print - hello world to world hello

	public static void reverse(String s1)	{
		String s2;
		int start;
		int end = s1.length();
		for(start = 0;start < s1.length();start+=end)
		for(int i = 0;i < ' ';i++)	{
			s2 = s1.substring(0,' ');
		}
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		reverse(s1);
	}

}
