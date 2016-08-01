package lecture15;

public class queue_array {
	
	private int data[];
	private int firstIndex;						//deleting pointer
	private int nextIndex;						//for dequeue
	private int size;			//size was not in linklist but it is here because of circular condition
	
	public queue_array(int size)	{
		data = new int[size];
		firstIndex = -1;
		nextIndex = 0;
		this.size = 0;					//this size is initialised from 0
	}
	
	public int size()	{
		return size;
	} 
	
	public Boolean isEmpty()	{
		return (size == 0);
	}
	
	public void enqueue(int element) throws queueFullException	{
		if(firstIndex == nextIndex)	{
			queueFullException e = new queueFullException();
			throw e;
		}
		if(firstIndex == -1)	{
			firstIndex = 0;
		}
		data[nextIndex] = element;
		nextIndex = (nextIndex+1) % data.length;				// * for pointer to move circularly
		size++;
	}
	
	public int dequeue() throws queueEmptyException	{
		if(size == 0)	{
			queueEmptyException e = new queueEmptyException();
			throw e;
		}
		int temp = data[firstIndex];
		firstIndex = (firstIndex+1) % data.length;
		size--;
		return temp;
	}
	
	public int front() throws queueEmptyException	{
		if(size == 0)	{
			queueEmptyException e = new queueEmptyException();
			throw e;		}
		return data[firstIndex];
	}
	
}
