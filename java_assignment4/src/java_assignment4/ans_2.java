package java_assignment4;

import java.util.Scanner;

public class ans_2 {
	
	public static void CheckSum(int a[]){
		Scanner s = new Scanner(System.in);
		int flag = 0;
		System.out.println("Enter the number to be checked ");
		int item = s.nextInt();
		for(int i = 0;i < a.length-2;i++)	{				//for 1st number till n-2
			for(int j = i+1;j < a.length-1;j++)	{			//for 2nd number till n-1	
				for(int k = i+2;k < a.length;k++)	{		//for 3rd number till n
					if(a[i]+a[j]+a[k] == item)	{
						flag = 1;
						System.out.println("triplet present: ");
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
		if (flag == 0)
		System.out.println("no triplets found");
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		CheckSum(a);
	}

}
