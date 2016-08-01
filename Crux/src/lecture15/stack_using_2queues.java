package lecture15;

import java.util.Scanner;

public class stack_using_2queues {					//implement functions of stack using two queues

	queue_linkList<Integer> q1;
	queue_linkList<Integer> q2;


	public stack_using_2queues()	{
		q1 = new queue_linkList<>();
		q2 = new queue_linkList<>();
	}

	public void push(int element)	{
		q1.enqueue(element);
	}

	public int pop()	{
		while((q1.size()-1) != 0)	{
			q2.enqueue(q1.dequeue());
		}
		int temp = q1.dequeue();
		queue_linkList<Integer> a = q1;
		q1 = q2;
		q2 = a;
		return temp;
	}

	public int top()	{
		while((q1.size-1) != 0)	{
			q2.enqueue(q1.dequeue());
		}
		int temp = q1.dequeue();
		return temp;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		stack_using_2queues obj = new stack_using_2queues();
		for(int i = 0;i < 4;i++)	{
			int data = s.nextInt();
			obj.push(data);
		}
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
	}

}
