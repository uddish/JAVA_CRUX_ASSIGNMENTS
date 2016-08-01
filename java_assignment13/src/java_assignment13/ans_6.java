package java_assignment13;

import java.util.ArrayList;

public class ans_6 {
	
	public static int[] mergeKSortedArrays(int a[], int b[], int c[],int n, int k)	{
		PriorityQueue pq = new PriorityQueue();			// Complexity ---> (knlogn + knlogn)
		
		int sorted[] = new int[n*k];
		for(int i = 0;i < n;i++)	{
			pq.insert(a[i]);
			pq.insert(b[i]);
			pq.insert(c[i]);
		}
		int j = 0;
		while(!pq.isEmpty())	{
			sorted[j] = pq.removeMin();
			j++;
		}
		return sorted;
	}

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int c[] = {9,10,11,12};
		int ans[] = mergeKSortedArrays(a, b, c, 4, 3);
		for(int i = 0;i < ans.length;i++)	{
			System.out.print(ans[i] + " ");
		}
	}

}
