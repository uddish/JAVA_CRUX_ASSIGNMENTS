package java_assignment8;

import java.util.Scanner;


public class ans_1_swap {

	public static Node<Integer> takeInput()	{
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null, tail = null;
		System.out.println("Enter the next node : ");
		int data = s.nextInt();
		while(data != -1)	{
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null)	{
				head = newNode;
				tail = newNode;
			}
			else	{
				tail.next = newNode;
				tail = newNode;
			}
			System.out.println("Enter the next node : ");
			data = s.nextInt();
		}
		return head;
	}

	public static Node<Integer> swap(Node<Integer> head, int i, int j)	{
		Node<Integer> temp = head;
		Node<Integer> temp1 = head;
		Node<Integer> a = null;

		for(int k = 0;k <= j;k++)	{
			if(k == i-1)	{
				a = temp;
				
			}
				else
				temp = temp.next;

			if(k == j-1)	{
				Node<Integer> x = new Node<Integer>(a.next.data);
				Node<Integer> y = new Node<Integer>(temp1.next.data);
				a.next.data = y.data;
				temp1.next.data = x.data;

			}
			else 
				temp1 = temp1.next;
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
		Node<Integer> a = swap(head,1,3);
		printLL(a);
	}

}
