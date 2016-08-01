package lecture13;

import java.util.Scanner;

public class deleteFromLL {

	public static Node<Integer> takeInput() {						//taking input
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null, tail = null;
		System.out.println("Enter next node : ");
		int data = s.nextInt();
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
		}
		return head;
	}

	public static Node<Integer> delete(int i,Node<Integer> head)	{
		//		Node<Integer> newNode = new Node<Integer>(data);
		Node<Integer> temp = head;
		Node<Integer> a = null;
		int flag = 0;
		for(int j = 0;j <= i;j++)	{
			if(temp == null)	{
				flag = 1;
			}
			else if(j == i-1)	{
				a = temp.next.next;
				temp.next = a;

			}
			else if(i == 0)	{
//				a = temp.next;
//				return a;
				
				return head.next;
			}

			else	
				temp = temp.next;
		}
		if(flag == 1)	{
			System.out.println("Underflow");
		}
		return head;
	}

	public static void printLL(Node<Integer> head) {		//printing linklist
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Node<Integer> head = takeInput();
		System.out.println("Enter the value of i");
		int i = s.nextInt();
		Node<Integer> output  = delete(i, head);
		printLL(output);

	}

}
