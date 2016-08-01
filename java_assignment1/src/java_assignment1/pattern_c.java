package java_assignment1;

public class pattern_c {

	public static void main(String[] args) {
		int n = 4;
		int row = 1;
		while(row <= n)	{
			int spaces = 1;
			while(spaces <= n-row)	{
				System.out.print(" ");
				spaces++;
			}
			int value = row;
			while(value <= 2*row-1 )	{
				System.out.print("*");
				value++;
			}
			value = 2*row - 2;
			while(value >= row)	{
				System.out.print("*");
				value--;
			}
			//if(row == 4)
				//break;
			row++;
			System.out.println();
			
		}
		row = 5;
		n = 7;
		while(row <= n)	{
			int spaces = 5;
			while(spaces <= row)	{
				System.out.print(" ");
				spaces++;
			}
			
			
			
			int value = 2*row - 7;
			while(value <= row)	{
				System.out.print("*");
				value++;
			}  
			value = row;
			while(value >= 2*row - 6)	{
				System.out.print("*");
				value--;
			}
			
			row++;
			System.out.println();
			
		}


	}

}
