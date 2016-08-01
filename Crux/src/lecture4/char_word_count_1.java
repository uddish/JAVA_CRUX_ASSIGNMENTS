package lecture4;

import java.util.Scanner;

public class char_word_count_1 {

	public static void check()	{
		int i = 0;
		int character = 0;
		int spaces = 0;
		int lines = 0;
		//int words = spaces + 1;
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		while(!s1.contains("$"))	{

			for(i = 0; i < s1.length();i++)	{
				if(s1.charAt(i) != '$')	{
					character++;
				}
				if(s1.charAt(i) == ' ')	{
					spaces++;
				}
				
			}
//			int words = spaces+1;
			lines++;
			s1 = s.nextLine();
//			System.out.println("characters are: " + character);
//			System.out.println("spaces are: " + spaces);
//			System.out.println("words are: " + words);
//			System.out.println("lines are: " + lines);
		}
		int words = spaces+1;
		
		System.out.println("characters are: " + character);
		System.out.println("spaces are: " + spaces);
		System.out.println("words are: " + words);
		System.out.println("lines are: " + lines);
	}




	public static void main(String[] args) {

		System.out.println("enter the string");
		check();

	}

}
