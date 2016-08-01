
public class pattern_2 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while(row <= n)	{
			int spaces = 1;
			while(spaces <= n-row)	{
				System.out.print(" ");
				spaces++;
			}
			int value = row;
			while(value <= 2*row-1)	{
				System.out.print(value);
				value++;
			}

			value = 2*row-2;
			while(value >= row ) {					//decrement
				System.out.print(value);
				value--;
			}
			row++;
			System.out.println();

		}
		

	}

}
