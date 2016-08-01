package java_assignment2a;

import java.util.Scanner;

public class ans_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = s.nextInt();
		System.out.println("1 for addition , 2 for product");
		int x = s.nextInt();
		int sum = 0;
		int i;
		int product = 1;
		
		for(i=0; i<n; i++)	{
			sum = sum + i;
		}
		
		for(i=1; i<=n; i++)	{
			product = product*i;
			
		}
		if(x == 1)
			System.out.println(sum);
		else if(x == 2)
			System.out.println(product);
		else
			System.out.println("wrong input");
	}

}
