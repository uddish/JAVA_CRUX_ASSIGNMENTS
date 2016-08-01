package lecture3;

import java.util.Scanner;

public class biggestInArray {

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

	public static int biggest(int a[])	{
		int temp = Integer.MIN_VALUE;					//to allote very low value
		for(int i = 0;i < a.length; i++)	{
			if(a[i] > temp)	{
				temp = a[i];
			}
		}
		return temp;

	}

	public static void main(String[] args) {
		int input[] = takeInput();
		int b = biggest(input);
		System.out.println("the biggest is : ");
		System.out.println(b);

	}

}
