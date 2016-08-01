package java_assignment8;
//import lecture13.Node;
import java.util.Scanner;

public class ans5_reverse {
	
	
	public static Node<Integer> reverse(Node<Integer> head)	{
		Node<Integer> current = head;
		Node<Integer> currNext = current.next;
		Node<Integer> prev = null;
		while(current.next != null)	{

			current.next = prev;
			prev = current;
			current = currNext;
			currNext = currNext.next;
			
		}
		if(current.next == null)	{
			current.next = prev;
		}
		return current;
	}
	
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
	
	public static void printLL(Node<Integer> head) {		//printing linklist
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Node<Integer> a = reverse(head);
		printLL(a);
	}

}
