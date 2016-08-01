package java_assignment4;

import java.util.Scanner;

public class ans_4 {

	public static void highestOccurring(String s1)	{
		int big = -1,index = 0;
		int array[] = new int[256];
		//		array[(int)s1.charAt(i)] = 1;
		for(int i = 0;i < s1.length();i++)	{
			array[(int)s1.charAt(i)]++;
		}
		
		for(int i = 0;i < array.length;i++)	{
			if(array[i] > big)	{
				big = array[i];
				index = i;
			}
		}
		char value = (char)(index);
		System.out.println(value + " is: " + array[index] + " times");

	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		highestOccurring(s1);
	}

}
