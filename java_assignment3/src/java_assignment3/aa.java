package java_assignment3;

import java.util.Scanner;
import java.lang.Math;
public class aa {

	public static void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of array1");
		int size1 = s.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Elements of array 1:");
		for (int i = 0; i < size1; i++) 
		{
			arr1[i] = s.nextInt();
		}
		
		System.out.println("Enter the size of array2");
		int size2 = s.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Elements of array 1:");
		for (int i = 0; i < size2; i++) 
		{
			arr2[i] = s.nextInt();
		}
		add(arr1,arr2);
	}
	
	
	public static void add(int arr1[],int arr2[])
	{
		int a=0,b=0;
		for(int i=0;i<arr1.length;i++)
		{
			a+=(arr1[i])*(Math.pow(10,arr1.length-i-1));
		}	
		System.out.println("a="+a);
		
		for(int i=0;i<arr2.length;i++)
		{
			b+=(arr2[i])*(Math.pow(10,arr2.length-i-1));
		}	
		System.out.println("b="+b);
		System.out.println("a+b="+(a+b)+" storing in array...");
		
		int c=a+b;
		int bigs=0;    
		
		if(arr1.length>arr2.length)              
			 bigs=arr1.length; 
		else
			bigs=arr2.length;
		
		int arr3[]=new int[bigs+1];				//arr3 should be one greater than biggest
		int r;
		while(c>0)
		{ 
			r=c%10;
            arr3[bigs-1]=r;
            bigs--;
            c=c/10;
		}
		for(int i=0;i<arr3.length;i++)
			System.out.println(arr3[i]);
				
	}
	
	
	public static void main(String[] args)
	{
		input();
	}

}
