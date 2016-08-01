package java_assignment8;
public class ans_7 {

	public static Node<Integer> reverse(Node<Integer> head)	{//do using recursion-stack
		if(head == null)	{
			return head;
		}
		Node<Integer> ans = reverse(head.next);
		System.out.print(head.data + "->");
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = ans5_reverse.takeInput();
		Node<Integer> a = reverse(head);
	}

}
