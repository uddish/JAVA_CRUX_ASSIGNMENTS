package java_assignment8;

import java.util.Scanner;

public class ans_3_selectionSort {

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

	public static Node<Integer> selectionSort(Node<Integer> head)	{
	
		Node<Integer> a = head;
		int temp1 = 0;
		Node<Integer> temp = head;
		Node<Integer> small = head;
		while(temp != null)	{
			
		while(temp != null)	{
			if(small.data > temp.data)	{
				small = temp;
				temp = temp.next;
			}
			else	{
				temp = temp.next;
			}
		}
		temp1 = small.data;
		small.data = head.data;
		head.data = temp1;
		head = head.next;
		temp = head;
		small = head;
		}

		return a;

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
		Node<Integer> a = selectionSort(head);
		printLL(a);

	}
}
