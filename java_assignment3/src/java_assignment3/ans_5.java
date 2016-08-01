package java_assignment3;

import java.util.Scanner;

public class ans_5 {

	public static void sumOfElements(int a[])	{
		Scanner s = new Scanner(System.in);
		int flag = 0;
		System.out.println("Enter the number ");
		int number = s.nextInt();
		for(int i = 0;i < a.length;i++)	{
			for(int j = i+1;j < a.length;j++){
				if(a[i] + a[j] == number)	{
					flag = 1;
					System.out.println("Pair of the elements which sum to the input number: ");
					System.out.println(a[i] + "," + a[j]);
				}

			}
		}
		if(flag == 0)
			System.out.println("No such pair of elements is found");
	}

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8,9};
		sumOfElements(a);
	}

}
