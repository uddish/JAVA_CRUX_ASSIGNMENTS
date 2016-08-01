package java_assignment11;

import java.util.Scanner;


public class stack<T> {								//Stack using link list
	Node<T> head;
	int size;

	public int size()	{
		return size;
	}

	public Boolean isEmpty()	{
		return (head == null);
	}

	public T top()	{							//value of head is only displayed
		return head.data;
	}

	public void push(T data)	{
		Node<T> temp = new Node<T>(data);
		temp.next = head;
		head = temp;
		size++;
	}

	public T pop()	{						//value is given to the user
		T temp = head.data;
		size--;
		head = head.next;
		return temp;

	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		stack<Integer> obj = new stack<Integer>();
		obj.push(data);
		System.out.println(obj.top());
	}
}