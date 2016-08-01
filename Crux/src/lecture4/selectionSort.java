package lecture4;

public class selectionSort {

	public static void selectionSort(int a[])	{
		int position = -1;
		for(int j = 0;j < a.length;j++)	{
			int smallest = Integer.MAX_VALUE;		//smallest should be inside the loop
		//because it is repeated after (i) loop,a[j] must be compared to max value
			for(int i = j;i < a.length;i++)	{

				if(a[i] < smallest)	{
					smallest = a[i];
					position = i;
				}

			}
			int temp = a[j];							//value at ith position
			a[j] = smallest;
			a[position] = temp;
		}
	}


	public static void main(String[] args) {
		int a[] = {3,6,4,7,2};
		selectionSort(a);
		for(int i = 0;i < a.length;i++)	{
			System.out.println(a[i]);
		}
	}

}
