package java_assignment3;

import java.util.Scanner;

public class ans_3 {
	
	public static int[] takeInput()	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int array[] = new int[size];
		for(int i = 0;i < size;i++)	{
		array[i] = s.nextInt();
		}
		return array;
	}
	
	public static void sum(int a[])	{
		int psum = 0, nsum = 0;
		for(int i = 0;i < a.length;i++)	{
			if(a[i] > 0)	{
				psum = psum + a[i];
			}
			else
				nsum = nsum + a[i];
		}
		System.out.println("positive sum: " + psum);
		System.out.println("negative sum: " + nsum);
	}
	

	public static void main(String[] args) {
		int input[] = takeInput();
		sum(input);
		
	}

}
