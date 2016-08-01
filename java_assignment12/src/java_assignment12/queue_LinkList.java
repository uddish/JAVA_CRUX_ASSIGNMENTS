package java_assignment12;

import java.util.Scanner;

public class queue_LinkList<T> {
	Node<T> head;
	Node<T> tail;
	int size;

	public int size()	{
		return size;
	}

	public Boolean isEmpty()	{
		return (head == null);
	}

	public T front()	{							//value of head is only displayed
		return head.data;
	}

	public void enqueue(T data)	{
		Node<T> temp = new Node<T>(data);
		//Node<T> tail = null;
		if(head == null)	{
			head = temp;
			tail = head;
		}
		else	{
			tail.next = temp;
			tail = temp;
		}
		size++;
	}

	public T dequeue()	{						//value is given to the user
		T temp = head.data;
		size--;
		head = head.next;
		return temp;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		int data1 = s.nextInt();
		queue_LinkList<Integer> obj = new queue_LinkList<Integer>();
		obj.enqueue(data);
		obj.enqueue(data1);
		System.out.println("front : " + obj.front());
		System.out.println("size : " + obj.size);
		System.out.println("dequeue : " + obj.dequeue());
		System.out.println("size : " + obj.size);
		System.out.println("dequeue : " + obj.dequeue());
	}

}

