package java_assignment13;

public class ans_9 {

	public static void KSmallestElements(int a[], int k)	{
		PriorityQueue_Max pq = new PriorityQueue_Max();
		for(int i = 0;i < k;i++)	{
			pq.insert(a[i]);
		}
		for(int i = k;i < a.length;i++)	{
			if(a[k] < pq.heap.get(1))	{
				pq.removeMax();
				pq.insert(a[k]);
				k++;
			}
			else
				k++;
		}
		System.out.print(pq.removeMax() + " ");
		System.out.print(pq.removeMax() + " ");
		System.out.print(pq.removeMax() + " ");
	}

	public static void main(String[] args) {

		int a[] = {2,6,5,3,9,8,1,4,7};
		KSmallestElements(a, 3);

	}

}
