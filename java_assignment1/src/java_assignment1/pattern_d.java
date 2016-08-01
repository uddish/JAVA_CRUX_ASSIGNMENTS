package java_assignment1;

public class pattern_d {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while(row <= n)	{
			int stars = 0;										// *'s in left upper side
			while(stars <= n-row)	{
				System.out.print("*");
				stars++;
			}
			/*
			int spaces = row;						
			while(spaces <= 2*row-1 )	{
				System.out.print(" ");
				spaces++;
			}
			spaces = 2*row - 2;
			while(spaces >= row)	{
				System.out.print(" ");
				spaces--;
			}*/
			int spaces = 0;										//spaces in 1st triangle
			while(spaces <= 2*row-3)	{
				System.out.print(" ");
				spaces++;
			}
			stars = 0;											// *'s in right upper side	
			while(stars <= n-row)	{
				System.out.print("*");
				stars++;
			}

			row++;
			System.out.println();

		}
		row = 5;
		n = 9;
		while(row <= n-1)	{										// *'s in left lower side
			int stars = 4;
			while(stars <= row)	{
				System.out.print("*");
				stars++;
			}

			/*int spaces = 2*row - 7;
			while(spaces <= row)	{
				System.out.print(" ");
				spaces++;
			}  
			spaces = row;
			while(spaces >= 2*row - 6)	{
				System.out.print(" ");
				spaces--;
			}*/

			int spaces = 6;								//spaces below 1st triangle
			while(spaces >= 2*row-9)	{
				System.out.print(" ");
				spaces--;
			}
			stars = 4;									// *'s in right lower side
			while(stars <= row)	{
				System.out.print("*");
				stars++;
			}
			
			row++;
			System.out.println();

		}





	}

}
