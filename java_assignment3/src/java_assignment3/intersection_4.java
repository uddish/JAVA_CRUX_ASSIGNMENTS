package java_assignment3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class intersection_4 {

	public static int[] takeInput()	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int size1 = s.nextInt();
		int array1[] = new int[size1];

		System.out.println("Enter the elements");
		for(int i = 0;i < size1;i++)	{
			array1[i] = s.nextInt();
		}
		System.out.println("Enter the size of array 2");
		int size2 = s.nextInt();
		int array2[] = new int[size2];
		System.out.println("Enter the elements");
		for(int j = 0;j < size2;j++)	{
			array2[j] = s.nextInt();
		}
		int a[] = intersection(array1,array2);		//putting array[] in a[] and returning
		return a;
	}

	public static int[] intersection(int a[],int b[])	{
		int array[] = new int[a.length];			//size of new array?????????
		
		int index = 0;
		for(int i = 0;i < a.length;i++)	{
			for(int j = 0;j < b.length;j++)	{
				if(a[i] == b[j])	{
					array[index] = b[j];
					index++;
					//System.out.println("no. is: " + array[index]);
				}
			}

		}
		array[array.length - 1]	 = index;				//putting index in the end of array
		return array;
	}
	public static void main(String[] args) {
		int a[] = takeInput();
		int temp = a[a.length-1];
		for(int i = 0;i < temp;i++)	{
			System.out.println("intersection: " + a[i]);
		}
	}

}
