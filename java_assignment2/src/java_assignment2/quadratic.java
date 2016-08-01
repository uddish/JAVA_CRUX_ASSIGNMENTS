package java_assignment2;

import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the values of a,b,c");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double d = (b*b - 4*a*c);
		if (d >= 0)	{
			double y = 0.5;
			double z = Math.pow(d, y);
			double x = (-b + z)/2*a;
			
			System.out.println(x);
		}
		
		

	}

	



}
