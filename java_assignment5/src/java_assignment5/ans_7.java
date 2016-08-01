package java_assignment5;

import java.util.Scanner;

public class ans_7 
{
	public static int str_to_int(String s1)
	{
		if(s1.length()<=1)
		{
			return (int)s1.charAt(0)-48;
		}
		
		int out=str_to_int(s1.substring(1));
	    int number=out+ ((int)s1.charAt(0)-48)*((int)Math.pow(10,s1.length()-1));
	    return number;
		
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the String:");
		String s1=s.next();
		
		
		
	   int out=str_to_int(s1);
         System.out.println( "the integer value returned:"+out);
	}
	
}

