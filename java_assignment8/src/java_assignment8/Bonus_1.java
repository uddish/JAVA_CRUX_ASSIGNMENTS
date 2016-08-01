package java_assignment8;

import java.util.Scanner;

public class Bonus_1 {
	
	public static int length(Node<Integer> head)	{
		int count = 0;
		while(head != null)	{
			head = head.next;
			count++;
		}
		return count;
	}

	public static Node<Integer> append(Node<Integer> head, int length,int n)	{	
		Node<Integer> h1 = head;
		for(int i = 0;i < length-n-1;i++)	{
			h1 = h1.next;
		}
		Node<Integer> h2 = h1.next;
		h1.next = null;
		Node<Integer> temp = h2;
		while(temp.next != null)	{
			temp = temp.next;
		}
		temp.next = head;
		return h2;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = ans5_reverse.takeInput();
		int length = length(head);
		System.out.println("Enter the value of n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Node<Integer> a = append(head, length, n);
		ans5_reverse.printLL(a);
	}

}
