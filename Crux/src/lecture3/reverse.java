package lecture3;

import java.util.Scanner;

public class reverse {
	
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
	
	public static void reverse(int a[])	{				//no return type for array because
		int temp;										//value is stored in same array
		int i,j;
		for(i=0,j=a.length-1;i < a.length/2;i++,j--)	{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		for(i = 0;i < a.length;i++)
			System.out.println(a[i]);
		
	}
													
	

	public static void main(String[] args) {
		int input[] = takeInput();
		reverse(input);
	}

}
