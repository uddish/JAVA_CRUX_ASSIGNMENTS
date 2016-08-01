package lecture3;							//CHECK PRIME FROM 2 TO N

import java.util.Scanner;

public class ans_1 {	
	public static void prime(int n){			//prime function, n = argument
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
	

	public static void main(String[] args) {
		System.out.println("Enter the value of N");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		prime(n);					// function call
		


	}

}
