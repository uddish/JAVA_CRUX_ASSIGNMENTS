package lecture13;

import java.util.Scanner;

//returning index of the value given by the user which is in stack
public class returnIndex {

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
	
	public static void printLL(Node<Integer> head) {		//printing linklist
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static int returnIndex(Node<Integer> head, int data)	{
		Node<Integer> temp = head;
		int count = 0;
		while(temp != null)	{
			if(temp.data == data)	{
				count++;
				return count;
			}
			else	{
				temp = temp.next;
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput(); 
		printLL(head);
		int a = returnIndex(head, 3);
		System.out.println("index is " + (a-1));
	}

}
