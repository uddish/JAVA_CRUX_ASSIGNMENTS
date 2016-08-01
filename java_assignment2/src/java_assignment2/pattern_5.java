package java_assignment2;

public class pattern_5 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while( row <= n)	{
			
				System.out.print(1);								//one line code for the above para

			int value = 5;
			while(value <= 2*row+1)	{

				if(row >= 2)	{								//to eliminate 0 in 2nd line

					if(value %2 == 0)	{							//to print 0(s)
						System.out.print(2);
						}
					
				}
				value++;
				

			}
			if(row >= 2)
				System.out.print(1);
			
			row++;
			System.out.println();
		}


	}

}
