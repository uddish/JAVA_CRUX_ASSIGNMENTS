package lecture5;

public class wavePrint {

	public static void wavePrint(int a[][])	{

		for(int i = 0;i < 4;i++)	{
			if(i%2 == 0)	{
			for(int j = 0;j < 4;j++)	{
				
					System.out.print(a[j][i] + " ");
				}
			}
				else	{

					for(int k = 3;k >= 0;k--)	{
						System.out.print(a[k][i] + " ");
					}
//					System.out.println();
				}
			}
		}
		//for(int i = 1;i < 4;i+=2) {
		//for(int j = 4;j > 0;j--)	{
		//		System.out.print(a[j][i]);
		//		}
		//		System.out.println();
		//	}

	

	public static void main(String[] args) {

		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		wavePrint(a);
	}

}
