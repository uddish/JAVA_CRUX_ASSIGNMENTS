package java_assignment9;

import java.util.Scanner;


public class ans_1 {
	
	stack_LL<Integer> s1;
	stack_LL<Integer> s2;
	
	public ans_1()	{
		s1 = new stack_LL<>();
		s2 = new stack_LL<>();
	}
	public void enqueue(int element)	{
		s1.push(element);
	}
	
	public int dequeue()	{
	while(s1.size-1 != 0)	{
		s2.push(s1.pop());
	}
		int temp = s1.pop();
		while(s2.size != 0)	{
			s1.push(s2.pop());
		}
		return temp;
	}
		
	public int front()	{
	while(s1.size != 0)	{
	s2.push(s1.pop());
	}
	int temp = s2.top();
	while(s2.size != 0)	{
		s1.push(s2.pop());
	}
	return temp;
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ans_1 obj = new ans_1();
		for(int i = 0;i < 4;i++)	{
			int data = s.nextInt();
			obj.enqueue(data);
	}
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		System.out.println("front : " + obj.front());
		System.out.println(obj.dequeue());
	}
}
