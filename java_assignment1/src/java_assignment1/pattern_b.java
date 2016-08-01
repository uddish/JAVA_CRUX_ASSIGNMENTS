package java_assignment1;

public class pattern_b {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int value = 5;
		while(row <= n)	{
			int spaces = 1;
			while(spaces <= n-row)	{
				System.out.print(" ");
				spaces++;
			}

			System.out.print(value);				//to print 5 to 1 in left side
			

			spaces = 4;
			while(spaces <= 2*row+1)	{

				if(row >= 2)	{
					if(spaces %2 == 1)	{
						System.out.print(value);
					}
					else	{
						System.out.print(" ");
					}
				}
				spaces++;
			}
			value--;


			row++;
			System.out.println();
		} 

	}

}
