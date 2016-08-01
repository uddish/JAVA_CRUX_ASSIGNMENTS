package lecture3;

import java.util.Scanner;

public class ans_3 {

	public static int[] takeInput()	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = s.nextInt();
		int array[] = new int[size];
		for(int i = 0;i < size;i++)	{
			System.out.println("enter the values");
			array[i] = s.nextInt();
		}
		return array;
	}
	
	public static int add(int a[])	{
		int sum = 0;
		for(int i = 0; i < a.length; i++ )	{
			sum = sum + a[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int input[] = takeInput();
		System.out.println("the sum is");
		int s = add(input);
		System.out.println(s);
				
		
	}

}
