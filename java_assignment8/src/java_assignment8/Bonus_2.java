package java_assignment8;

public class Bonus_2 {
	
	public static Node<Integer> bonus_2(Node<Integer> head,int k)	{
		Node<Integer> h1 = head;
		for(int i = 0;i < k-1;i++)	{
			h1 = h1.next;
		}
		Node<Integer> h2 = h1.next;
		h1.next = null;
		Node<Integer> reverse1 = ans5_reverse.reverse(head);		//reversing 1st k nos.
		Node<Integer> temp = h2;
		for(int i = 0;i < k-1;i++)	{
			h2 = h2.next;
		}
		Node<Integer> h3 = h2.next;
		h2.next = null;
		Node<Integer> reverse2 = ans5_reverse.reverse(temp);		//reversing next k nos.
		Node<Integer> h = reverse1;
		while(h.next != null)	{
			h = h.next;
		}
		h.next = reverse2;
		while(reverse2.next != null)	{
			reverse2 = reverse2.next;
		}
		reverse2.next = h3;
		return reverse1;
	}

	public static void main(String[] args) {
		Node<Integer> head = ans5_reverse.takeInput();
		Node<Integer> a = bonus_2(head,2);
		ans5_reverse.printLL(a);
	}

}
