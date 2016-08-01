import java.util.Scanner;

public class Primenumbersbetween_2toN {

	public static void main(String[] args) {
		System.out.println("Enter the value of N");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int num = 2;
		while(num <= n) {
			int divisor = 2;
			int flag = 0;
			while(num > divisor)	{
				if(num % divisor == 0) {
					flag = 1;
					break;
				}
				divisor++;
			}
			if(flag == 0) {
				System.out.println(num);
			}
			num++;
		}


	}
}

