package java_assignment8;

public class ans_5_recursion {

	public static Node<Integer> reverseRecursion(Node<Integer> head)	{
		if(head.next == null)	{
			return head;
		}

		Node<Integer> ans = reverseRecursion(head.next);
		Node<Integer> temp = ans;
		while(ans.next != null)	{
			ans = ans.next;
		}
		ans.next = head;
		head.next = null;
		return temp;
	}	

	public static void main(String[] args) {
		Node<Integer> head = ans5_reverse.takeInput();
		Node<Integer> a = reverseRecursion(head);
		ans5_reverse.printLL(a);
	}

}
