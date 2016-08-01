package lecture14;
import lecture13.Node;
import lecture13.lengthOfLL;
import lecture13.LinkedListUse;
import java.util.Scanner;

public class stack_revise<T> {

	public int size;
	public Node<T> head;

	public int size()	{								//size will change in push or pop
		return size;
	}

	public Boolean isEmpty(Node<Integer> head)	{		//will return true is head is empty
		return (head == null);
	}

	public T top()	{
		return head.data;
	}

	public void push(T data)	{
		Node<T> temp = new Node<T>(data);
		temp.next = head;
		head = temp;
		size++;
	}
	
	public T pop()	{
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
//		int data = s.nextInt();
		stack_revise<Integer> obj = new stack_revise<Integer>();
		obj.push(data);
		System.out.println(obj.top());
		System.out.println(obj.size);
	}

}
