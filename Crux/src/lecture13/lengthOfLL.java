package lecture13;

import java.util.Scanner;

public class lengthOfLL {
	
	public static int takeInput() {						//taking input
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null, tail = null;
		int count = 0;
		System.out.println("Enter next node : ");
		int data = s.nextInt();
//		count++;
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);		//creating new node,calling constructor
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			System.out.println("Enter next node : ");
			data = s.nextInt();
			count++;
		}
		return count;
	}
	
	public static int length(Node<Integer> head)	{
		int count = 0;
		while(head != null)	{
			count++;
			head = head.next;
		}
		return count;
	}
	

	public static void main(String[] args) {
		int count = takeInput();
		System.out.println("Length is : "  + count);
	}

}
