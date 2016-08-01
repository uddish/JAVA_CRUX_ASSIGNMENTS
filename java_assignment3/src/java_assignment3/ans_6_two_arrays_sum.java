package java_assignment3;

public class ans_6_two_arrays_sum {

	public static void ArraySum(int a[],int b[])	{
		double sum = 0, sum1 = 0;

		for(int i = 0;i < a.length;i++)	{
			int n = 2;
			sum = sum + a[i]*(Math.pow(10,n));
			n--;
		}
		for(int j = 0;j < b.length;j++)	{
			int p = 2;
			sum1 = sum1 + b[j]*(Math.pow(10,p));
			p--;	
		}
		int value = (int)(sum + sum1);
		System.out.println(value);

	}

	public static void main(String[] args) {
		int a[] = {1,2,4};
		int b[] = {4,5,6};
		ArraySum(a,b);
	}

}
