package lecture15;

import java.util.Scanner;


public class queue_array_use {

	public static void main(String[] args)  throws queueEmptyException,queueFullException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = s.nextInt();
		queue_array ob = new queue_array(size);
		for(int i = 0;i <= size;i++)	{
			try {
				ob.enqueue(i);
			} catch (queueFullException e) {
				System.out.println("Queue is full");
			}
		}
		System.out.println("size : " + ob.size());
		try {
			System.out.println("dequeue : " + ob.dequeue());
			System.out.println("dequeue : " + ob.dequeue());
			System.out.println("front : " + ob.front());
		} catch (queueEmptyException e) {
			System.out.println("Queue is empty");
		}
		
		System.out.println("size : " + ob.size());
	}

}
