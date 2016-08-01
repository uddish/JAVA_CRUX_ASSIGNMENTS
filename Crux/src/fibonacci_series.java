import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int c = a+b;
		while(c < n)	{
			
			System.out.println(c);
			a = b;
			b = c;
			c = a+b;
			
		}
			
			
	}

}
