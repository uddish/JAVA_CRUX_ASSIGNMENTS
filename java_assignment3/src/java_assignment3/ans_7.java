package java_assignment3;

import java.util.Scanner;

public class ans_7 {
	
	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = s.nextInt();
		System.out.println("Enter the numbers");
		int array[] = new int[n];
		for(int i = 0;i < n;i++)	{
			array[i] = s.nextInt();
		}
		return array;
	}
	
	public static void checkDuplicate(int a[])	{
		for(int i = 0;i < a.length;i++)	{
			for(int j = i+1;j < a.length;j++)	{
				if(a[i] == a[j])	{
					System.out.println("the duplicate number is: " + a[i]);
				}
			}
		}
	}

	public static void main(String[] args) {

		int input[] = takeInput();
		checkDuplicate(input);
	}

}
