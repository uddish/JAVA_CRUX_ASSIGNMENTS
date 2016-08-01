package lecture14;

import lecture13.LinkedListUse;
import lecture13.Node;

public class mergingTwoLL {

	public static Node<Integer> merging(Node<Integer> head1, Node<Integer> head2)	{
		Node<Integer> head3 = null;
		Node<Integer> tail = null;
		if(head1.data < head2.data)	{			//for null
			head3 = head1;
			tail = head1;
			head1 = head1.next;
		}
		else	{
			head3 = head2;
			tail = head2;
			head2 = head2.next;
		}	


		while(head1 != null && head2 != null)	{
			if(head1.data < head2.data)	{
				tail.next = head1;
				head1 = head1.next;
				tail = tail.next;
			}
			else	{
				tail.next = head2;
				head2 = head2.next;
				tail = tail.next;
			}

		}
		if(head1 == null)	{
			tail.next = head2; 
		}
		else
			tail.next = head1;
		
		return head3;
	}



	public static void main(String[] args) {
		Node<Integer> head1 = LinkedListUse.takeInput();		//importing from lecture13
		Node<Integer> head2 = LinkedListUse.takeInput();
		Node<Integer> a = merging(head1,head2);
		LinkedListUse.printLL(a);

	}

}
