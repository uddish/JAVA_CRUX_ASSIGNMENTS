package java_assignment8;

import java.util.Scanner;

public class ans_2 {

	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null, tail = null;
		System.out.println("Enter next node : ");
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
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
	
	public static Node<Integer> duplicate(Node<Integer> head)	{
		Node<Integer> temp = head;
		Node<Integer> a = null;
		while(temp != null)	{
			if(temp.next == null)	{				//important condition
				break;
			}
			if(temp.data == temp.next.data)	{
				a = temp.next.next;
				temp.next = a;
			}
			else
				temp = temp.next;
		}
		return head;
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}


	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Node<Integer> a = duplicate(head);
		printLL(a);
	}

}
