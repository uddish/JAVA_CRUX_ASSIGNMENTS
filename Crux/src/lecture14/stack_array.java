package lecture14;

public class stack_array {
	
	private int data[];
	private int nextIndex;
	
	public stack_array(int size)	{								//calling constructor
		data = new int[size];
		nextIndex = 0;
	}
	
	public  Boolean isEmpty()	{
		return (nextIndex == 0);
	}
	
	public int size()	{
		return nextIndex;
	}
	
	public void push(int element) throws stackFullException	{
		if(nextIndex == data.length)	{
			stackFullException e = new stackFullException();			//we have to write this
			throw e;
		}
		data[nextIndex] = element;
		nextIndex++;
	}
	
	public int pop() throws stackEmptyException	{
		if(nextIndex == 0)	{
			stackEmptyException e = new stackEmptyException();
			throw e;
		}
		int value = data[nextIndex-1];
		nextIndex--;
		return value;
	}
	
	public int top() throws stackEmptyException	{
		if(nextIndex == 0)	{
			stackEmptyException e = new stackEmptyException();
			throw e;
		}
		int value = data[nextIndex-1];
		return value;
	}
}
