package lecture13;

import java.util.Scanner;

public class RecursionLL {
	
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
	
	public static Node<Integer> insertLL(Node<Integer> head,int i,int data)	{	//insertion-recursion
		if(i == 0)	{
			Node<Integer> newNode = new Node<Integer>(data);
			newNode.next = head;
			head = newNode;
			return head;
		}
		head.next = insertLL(head.next, i-1, data);
		return head;
	}
	
	public static Node<Integer> delete(Node<Integer> head,int i)	{	//deletion using recursion
		if(i == 0)	{
			return head.next;
		}
		head.next = delete(head.next, i-1);
		return head;
	}
	
	public static int length(Node<Integer> head)	{		//finding length using recursion
		if(head.next == null)	{
			return 1;
		}
		int count = length(head.next) +1;
		return count;
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
//		head = insertLL(head, 2, 9);
//		head = delete(head, 2);
		int a = length(head);
		System.out.println(a);
		printLL(head);
		
	}

}
