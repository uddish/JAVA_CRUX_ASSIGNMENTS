package java_assignment9;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class stack_LL<T> {								//Stack using link list
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

	public static int getMin(stack_LL<Integer> obj)	{
		stack_LL<Integer> ob2 = new stack_LL<Integer>();
		if(ob2.size == 0)	{
			ob2.push(obj.pop());
		}
		while(obj.size != 0)	{
			if(obj.top() < ob2.top())	{
				ob2.push(obj.pop());
			}
			else
				obj.pop();
		}
		return ob2.top();
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		stack_LL<Integer> obj = new stack_LL<Integer>();
		for(int i = 0;i < 5;i++)	{
			int data = s.nextInt();
			obj.push(data);
		}

		//		System.out.println(obj.top());
		System.out.println("Minimum Value" );
		System.out.println(getMin(obj));

	}
}