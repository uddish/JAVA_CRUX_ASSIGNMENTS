package lecture3;										//pattern_1

import java.util.Scanner;

public class ans_2 {
	public static void pattern(int n)	{
		
		int currentRow = 1;
		int value = 1;
		while(currentRow <= n) {
			int currentCol = 1;
			while(currentCol <= currentRow) {
				System.out.print(value);
				value = value + 1;
				currentCol = currentCol + 1;
			}
			currentRow = currentRow + 1;
			System.out.println();
		}
		;
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int totalRows = s.nextInt();
		pattern(totalRows);
	}

}
