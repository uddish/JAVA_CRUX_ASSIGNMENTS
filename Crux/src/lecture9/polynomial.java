package lecture9;

import java.util.Scanner;

public class polynomial {
	
	public static void value(int a[], int x)	{
		int sum = 0;
		int save = 1;
		for(int i = 0;i < a.length;i++)	{
			sum = sum + a[i]*save;
			save = save*x;
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = {1,2,3,4};
		int x = 2;
		value(a,x);
	}

}