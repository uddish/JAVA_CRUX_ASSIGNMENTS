package java_assignment8;


public class ans4_pallindrome {

	public static Node<Integer> findMid(Node<Integer> head) {
		Node<Integer> slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Boolean isPallindrome(Node<Integer> head, Node<Integer> mid)	{
		Node<Integer> h1 = head;
		Node<Integer> h2 = mid.next;
		mid.next = null;
		Node<Integer> secondPart = ans5_reverse.reverse(h2);
		while(h1.next != null)	{
			if(h1.data != secondPart.data)	{
				return false;
			}
			else	{
				h1 = h1.next;
				secondPart = secondPart.next;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Node<Integer> head = ans5_reverse.takeInput();
		Node<Integer> mid = findMid(head);
		System.out.println(isPallindrome(head, mid));
	}

}
