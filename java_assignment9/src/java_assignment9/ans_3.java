package java_assignment9;

import java.util.Scanner;

public class ans_3 {
	
	public static queue_LL<Integer> reverseQueue(queue_LL<Integer> obj)	{
		if(obj.size-1 == 0)	{
			return obj;
		}
		int a = obj.dequeue();
		queue_LL<Integer> ans = reverseQueue(obj);
		ans.enqueue(a);
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		queue_LL<Integer> obj = new queue_LL<Integer>();
		System.out.println("Enter 5 nos. in the queue");
		for(int i = 0;i < 5;i++)	{
			int data = s.nextInt();
			obj.enqueue(data);
		}
		queue_LL<Integer> obj1 = reverseQueue(obj);
		System.out.println("Dequeue :" + obj1.dequeue());
		System.out.println("Dequeue :" + obj1.dequeue());
		System.out.println("Dequeue :" + obj1.dequeue());
	}

}
