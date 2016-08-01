package lecture5;

public class spiral_2 {							//4 start variables and 4 end variables

	public static void spiralPrint(int a[][])	{
		
		int start = 0,end = 4;
		int i,j;
		int value = 1;
		while(value <= 2)	{
		for(i = start;i <= start;i++)	{						// first row
			for(j = start;j < end;j++){
				System.out.print(a[i][j] + " ");
			}
		}
		
		for(i = start+1;i < end;i++)	{					// 4th column
			for(j = end;j > end-1;j--)	{
				
			}
			System.out.print(a[i][j] + " ");
		}
		
		for(i = end-1;i >= end-1;i--)	{					// 4th row
			for(j = end-2;j >= start;j--)	{
				System.out.print(a[i][j] + " ");
			}
		}
		
		for(i = end-2;i > start;i--)	{					//1st column
			for(j = 0;j < start;j++)	{
			}
			System.out.print(a[i][j] + " ");
		}
		start++;
		end--;
		}
	}
	public static void main(String[] args) {

		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		spiralPrint(a);
	}
}
