package lecture14;
import lecture13.LinkedListUse;
import lecture13.Node;

public class merging_revise_code {

	public static Node<Integer> mergeLL(Node<Integer> head1, Node<Integer> head2)	{
		Node<Integer> head3 = null;
		Node<Integer> tail = null;
		if(head1.data < head2.data)	{
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
				tail.next = head1;						//tail is only pointing at the new node/value
				tail = tail.next;						//tail is now the new value i.e. value at head1
				head1 = head1.next;

			}
			else	{
				tail.next = head2;
				tail = tail.next;
				head2 = head2.next;
			}
		}

		if(head1 != null)	{
			tail.next = head1;
		}
		else
			tail.next = head2;

		return head3;

	}


	public static void main(String[] args) {
		Node<Integer> head1 = LinkedListUse.takeInput();
		Node<Integer> head2 = LinkedListUse.takeInput();
		Node<Integer> head3 = mergeLL(head1, head2);
		LinkedListUse.printLL(head3);
	}

}
