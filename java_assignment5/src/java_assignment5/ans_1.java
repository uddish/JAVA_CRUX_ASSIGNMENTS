package java_assignment5;

public class ans_1 {

	public static int product(int m, int n)	{
		if(n == 0 || m ==0)	{
			return 0;
		}
		if(n > 0)	{
			return m+product(m,n-1);
			}
		return product(m,n);
	}

	public static void main(String[] args) {
		System.out.println(product(4,5));
	}
}
