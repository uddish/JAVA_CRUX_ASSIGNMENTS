package java_assignment2a;

import java.util.Scanner;

public class ans_4_reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int reverse = 0;
		int last;
		while(num > 0)	{
			last = num  % 10;
			num = num/10;
			reverse = reverse*10 + last;
		}
		System.out.println(reverse);

	}

}
