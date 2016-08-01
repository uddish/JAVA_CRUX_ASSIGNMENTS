package java_assignment13;

import java.util.ArrayList;

public class PriorityQueue_Max 
{
	ArrayList<Integer> heap;

	public PriorityQueue_Max()
	{
		heap = new ArrayList<Integer>();
		heap.add(null);
	}


	public int getSize() {
		return heap.size() - 1;
	}

	public boolean isEmpty() {
		return (getSize() == 0);
	}


	public int max() {
		if(isEmpty()) {
			// PQ empty Exception
		}
		return heap.get(1);
	}


	public void insert(int priority) {
		heap.add(priority);
		int childIndex = heap.size() - 1;
		int parentIndex = childIndex / 2;
		while(childIndex > 1) {
			int child = heap.get(childIndex);
			int parent = heap.get(parentIndex);
			if(child < parent) {
				return;
			}
			int temp = child;
			heap.set(childIndex, parent);
			heap.set(parentIndex, temp);

			childIndex = parentIndex;
			parentIndex = childIndex / 2;
		}
	}

	public int removeMax() 
	{
		if(isEmpty()) 
		{
			// PQ empty Exception
		}
		int max = heap.get(1);
		int lastIndex = heap.size()-1;
		heap.set(1, heap.get(lastIndex));
		heap.remove(lastIndex);

		int parentIndex = 1;
		int leftChildIndex = 2*parentIndex;
		int rightChildIndex = leftChildIndex + 1;
		while(parentIndex <= heap.size()-1) 
		{
			int maxIndex = parentIndex;
			int maxValue = heap.get(maxIndex);

			if(leftChildIndex <= heap.size()-1) 
			{
				int leftChild = heap.get(leftChildIndex);
				if(leftChild > maxValue) 
				{
					maxIndex = leftChildIndex;
					maxValue = heap.get(maxIndex);
				}
			}

			if(rightChildIndex <= heap.size()-1) 
			{
				int rightChild = heap.get(rightChildIndex);
				if(rightChild > maxValue) 
				{
					maxIndex = rightChildIndex;
					maxValue = heap.get(maxIndex);
				}
			}


			if(parentIndex == maxIndex) 
			{
				break;
			}
			else {
				heap.set(maxIndex, heap.get(parentIndex));
				heap.set(parentIndex, maxValue);
			}
			parentIndex = maxIndex;
			leftChildIndex = 2*parentIndex;
			rightChildIndex = leftChildIndex + 1;
		}
		return max;
	}
}

