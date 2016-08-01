import java.util.Scanner;								//scanner library

public class temperature {

	public static void main(String[] args) {
		//Convert Fahrenheit to Celsius by user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting value");
		int startingFahrenheitValue = s.nextInt();
		System.out.println("Enter ending value");
		int endingFahrenheitValue = s.nextInt();
		
		int fahrenheit = startingFahrenheitValue;
		while(fahrenheit <= endingFahrenheitValue)	{
		int celsius = (int) ((5.0/9.0)*(fahrenheit - 32)); 		/*if we will use int here,
		 													we will get error
		 													Here we are forcing double into int*/
		 												
		System.out.print(fahrenheit);
		System.out.print("\t");
		System.out.println(celsius); //System.out.println(fahrenheit + "\t" + celcius);
		fahrenheit = fahrenheit + 20;
		}
		
	}

}
