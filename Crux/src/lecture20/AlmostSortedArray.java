package lecture20;

public class AlmostSortedArray {

	public static void AlmostSort(int a[], int k)	{
		PriorityQueue PQ = new PriorityQueue();

		for(int i = 0;i < k;i++)	{
			PQ.insert(a[i]);	
		}

		int j = 0;
		for(int i = k;i < a.length;i++)	{
			int min = PQ.removeMin();
			a[j] = min;
			PQ.insert(a[i]);
			j++;
		}
		while(!PQ.isEmpty())	{
			a[j] = PQ.removeMin();
			j++;
		}

	}

	public static void main(String[] args) {
		int a[] = {2,1,3,5,6,4};
		AlmostSort(a, 3);
		for(int i : a)	{
			System.out.println(i);
		}
	}

}
