package lecture14;
import lecture13.Node;
import lecture13.LinkedListUse;
import lecture14.merging_revise_code;
public class mergeSortLL {

	public static Node<Integer> findMid(Node<Integer> head) {
		Node<Integer> slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node<Integer> mergeSort(Node<Integer> head)	{
		if(head.next == null)	{
			return head;
		}
		Node<Integer> mid = findMid(head); 
		Node<Integer> h1 = head;
		Node<Integer> h2 = mid.next;
		mid.next = null;
		h1 = mergeSort(h1);
		h2 = mergeSort(h2);
		Node<Integer> h3 = merging_revise_code.mergeLL(h1, h2);
		return h3;
	}

	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		Node<Integer> merge = mergeSort(head);
		LinkedListUse.printLL(merge);
	}

}
