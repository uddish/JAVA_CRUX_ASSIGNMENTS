package java_assignment2a;

import java.util.Scanner;

public class decimaltobinary {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int value[] = new int[25];
		int index = 0;
		while(number > 0)	{
			value[index++] = number%2;
			number = number/2;
			}
		for(int i=index-1;i>=0;i--)	{
			System.out.println(value[i]);
		}
			System.out.println();
	}

}
