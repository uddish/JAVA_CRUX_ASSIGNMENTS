package java_assignment2;

public class pattern_2 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while( row <= n)	{
			
				System.out.print(1);								//one line code for the above para

			int spaces = 5;
			while(spaces <= 2*row+1)	{

				if(row >= 2)	{								//to eliminate 0 in 2nd line

					if(spaces %2 == 0)	{							//to print 0(s)
						System.out.print(0);
						}
					
				}
				spaces++;
				

			}
			if(row >= 2)
				System.out.print(1);
			
			row++;
			System.out.println();
		}


	}

}
