package lecture13;

import java.util.Scanner;

public class LinkedListUse {

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

	public static void getOutput(int i, Node<Integer> head)	{		//Get value at ith position
		Node<Integer> temp = head;

		for(int j = 0;j < i;j++)	{
			if(temp == null)	{
				System.out.println("Not Found");
				return;
			}
			else if(j == i)
				System.out.println(temp.data);
			else
				temp = temp.next;
		}

	}

	public static Node<Integer> EnterInputAtI(int i, Node<Integer> head,int data)	{	//INSERTION at ith
		Node<Integer> newNode = new Node<Integer>(data);
		Node<Integer> temp = head;
		int flag = 0;
		for(int j = 0;j <= i;j++)	{
			if(temp == null)	{
				flag = 1;
				}
			else if(j == i-1)	{
				newNode.next = temp.next;
				temp.next = newNode;
				
			}
			else if(i == 0)	{
				newNode.next = temp;
				temp = newNode;
				return temp;
			}

			else	
				temp = temp.next;
		}
		if(flag == 1)	{
			System.out.println("Not found");
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
		//		getOutput(i, head);
		System.out.println("enter the value to be inserted at ith position");
		int data = s.nextInt();
		Node<Integer> output = EnterInputAtI(i, head, data);
		printLL(output);
	}

}
