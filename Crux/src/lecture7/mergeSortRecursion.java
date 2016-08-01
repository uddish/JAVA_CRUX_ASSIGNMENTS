package lecture7;


public class mergeSortRecursion {

	public static int[] mergeSortDivide(int a[])	{
		if(a.length <= 1)	{
			return a;
		}
		int h1[] = new int[a.length/2];
		int h2[] = new int[a.length - a.length/2];

		int k = 0;
		for(int j = 0;j < h1.length;j++){
			h1[k] = a[j];
			k++;
		}
		k = 0;
		for(int j = h1.length;j < a.length;j++)		{
			h2[k] = a[j];
			k++;
		}
		int s1[] = mergeSortDivide(h1);
		int s2[] = mergeSortDivide(h2);
		
		int output[] = mergeSort(s1,s2);
		
		return output;
	}

	public static int[] mergeSort(int a[], int b[])	{
		int c[] = new int[a.length + b.length];
		int k = 0, j = 0,i = 0;
		while(k < a.length && j < b.length)	{
			if(a[k] < b[j])	{
				c[i] = a[k];
				k++;
				i++;
			}
			else	{
				c[i] = b[j];
				j++;
				i++;
			}
		}	
		while(k < a.length)	{		// if b[] finishes first and elements are there in a[]
			c[i] = a[k];
			k++;
			i++;
		}
		while(j < b.length)	{		// if a[] finishes first and elements are there in b[]
			c[i] = b[j];
			j++;
			i++;
		}
		return c;
	}

	public static void main(String[] args) {

		int a[] = {4,6,9,2,5,8,7,1};
		int array[] = mergeSortDivide(a);
		for(int i = 0;i < array.length;i++)
			System.out.println(array[i]);
	}

}
