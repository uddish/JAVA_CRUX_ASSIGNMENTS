package lecture3;

import java.util.Scanner;

public class linearSearch {

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

	public static void big(int a[])	{
		Scanner s = new Scanner(System.in);
		int flag = 0;
		System.out.println("enter the element to be searched");
		int value = s.nextInt();
		for(int i = 0;i < a.length;i++)	{
			if(value == a[i])	{
				System.out.println("found");
				flag = 1;
			}
					}
		if(flag == 0)
			System.out.println("not found");

	}


	public static void main(String[] args) {
		int input[] = takeInput();
		big(input);



	}

}
