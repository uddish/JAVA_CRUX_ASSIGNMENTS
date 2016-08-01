package java_assignment2a;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int sum = 0;
		int last;							//for last number
		//n = calculate no. of digits

		while(num > 0){
			int n = num / 10;
			n++;


			for(int power=0;power<n-1;power++){
				last = num % 10;
				num = num/10;
				sum = (sum + (last*((int)Math.pow(2,power))));	//how to use power via int
				
			}
			System.out.println(sum);

		}
	}

}
