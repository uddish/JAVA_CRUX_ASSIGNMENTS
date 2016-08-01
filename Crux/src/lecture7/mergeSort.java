package lecture7;


public class mergeSort {

	public static void mergeSort(int a[], int b[], int c[])	{
		
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
		}
	

	public static void main(String[] args) {
		int a[] = {4,7,9};
		int b[] = {3,5,6,12};
		int c[] = new int[a.length + b.length];
		mergeSort(a, b, c);
		for(int i = 0;i < c.length;i++)
			System.out.println(c[i]);
	}

}
