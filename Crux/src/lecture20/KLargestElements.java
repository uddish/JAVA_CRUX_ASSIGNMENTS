package lecture20;

public class KLargestElements {

	public static void largest(int a[], int k)	{

		PriorityQueue PQ = new PriorityQueue();
		for(int i = 0;i < k;i++)	{
			PQ.insert(a[i]);	
		}
			for(int i = k; i < a.length;i++)	{
			if(a[k] > PQ.heap.get(1))	{
				PQ.removeMin();
				PQ.insert(a[k]);
				k++;
			}
			else
				k++;
		}
			System.out.println(PQ.removeMin());
			System.out.println(PQ.removeMin());
			System.out.println(PQ.removeMin());
			System.out.println(PQ.removeMin());

	}

	public static void main(String[] args) {
		int a[] = {10,4,3,15,7,9,2,20};
		largest(a, 4);
	}

}
