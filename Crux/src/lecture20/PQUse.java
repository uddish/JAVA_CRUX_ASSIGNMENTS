package lecture20;


public class PQUse {

	public static void inplaceHeapSort(int a[]) {

		// Build Heap - similar to insert method
		for(int i = 2; i < a.length; i++) {
			int childIndex = i;
			int parentIndex = childIndex / 2;

			while(childIndex > 1) {
				if(a[childIndex] > a[parentIndex]) {
					break;
				}
				int temp = a[childIndex];
				a[childIndex] = a[parentIndex];
				a[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = childIndex / 2;
			}
		}
		
		// Remove min
		for(int i = a.length-1; i >=1; i--) {
			int min = a[1];
			a[1] = a[i];
			a[i] = min;
			
			int parentIndex = 1;
			int leftChildIndex = 2*parentIndex;
			int rightChildIndex = leftChildIndex + 1;
			while(parentIndex < i) {
				int minIndex = parentIndex;
				int minValue = a[minIndex];

				if(leftChildIndex < i) {
					int leftChild = a[leftChildIndex];
					if(leftChild < minValue) {
						minIndex = leftChildIndex;
						minValue = a[minIndex];
					}
				}
				if(rightChildIndex < i) {
					int rightChild = a[rightChildIndex];
					if(rightChild < minValue) {
						minIndex = rightChildIndex;
						minValue = a[minIndex];
					}
				}
				if(parentIndex == minIndex) {
					break;
				}
				else {
					a[minIndex] = a[parentIndex];
					a[parentIndex] = minValue;
				}
				parentIndex = minIndex;
				leftChildIndex = 2*parentIndex;
				rightChildIndex = leftChildIndex + 1;
			}
		}
	}

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		for(int i = 0; i < 5; i++) {
			pq.insert(10 - i);
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.removeMin());
		}
		
//		int a[] = {Integer.MIN_VALUE, 3,7,1,15,45,23,4};
//		inplaceHeapSort(a);
//		for(int i : a) {
//			System.out.println(i);
//		}
	}
}
