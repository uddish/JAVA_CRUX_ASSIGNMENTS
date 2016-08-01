package lecture10;

public class QuickSort {

	public static void quickSort(int a[], int startIndex, int endIndex)	{
		if(startIndex >= endIndex)	{
			return;
		}
		int pivotIndex = partitionArray(a,startIndex,endIndex);
		quickSort(a, startIndex, pivotIndex-1);
		quickSort(a, pivotIndex+1, endIndex);
	}

	public static int partitionArray(int a[],int startIndex, int endIndex)	{
		int count = 0;
		for(int i = startIndex;i <= endIndex;i++)	{
			if(a[startIndex] > a[i])	{								//finding nos. smaller than pivot
				count++;
			}

		}
		count = count + startIndex;

		int temp = a[startIndex];									//swapping of pivot
		a[startIndex] = a[count];
		a[count] = temp;
		for(int k = startIndex,j = endIndex; k < j;)	{			//rearranging
			if(a[k] >= a[count])	{
				if(a[j] >= a[count])	{
					j--;
				}
				else	{
					temp = a[k];
					a[k] = a[j];
					a[j] = temp;
					j--;
					k++;
				}
			}

			else
				k++;
		}
		return count;
	}

	public static void main(String[] args) {
		int a[] = {7,4,3,5,2,9,6,8};
		quickSort(a, 0, a.length-1);
		for(int i = 0;i < a.length;i++)
			System.out.print(a[i] + " ");
	}

}
