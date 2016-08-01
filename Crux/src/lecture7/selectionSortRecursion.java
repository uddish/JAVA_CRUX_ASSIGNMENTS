package lecture7;

import javax.swing.text.Position;

public class selectionSortRecursion {

	public static void selectionSort(int a[], int startIndex)	{
		if(startIndex >= a.length)	{					//base case
			return;
		}
		int smallest = Integer.MAX_VALUE;
		int position = 0;
		for(int i = startIndex;i < a.length;i++)	{
			
			if(a[i] < smallest)	{						//find smallest in one pass
				smallest = a[i];
				position = i;
			}
		}
		int temp = a[startIndex];						//swapping smallest with startIndex
		a[startIndex] = smallest;
		a[position] = temp;
		selectionSort(a, startIndex+1);						// calling after
	}
	
	public static void main(String[] args) {
		int a[] = {4,6,8,2,7,9};
		selectionSort(a,0);
		for(int i = 0;i < a.length;i++)
			System.out.println(a[i]);
		
	}

}
