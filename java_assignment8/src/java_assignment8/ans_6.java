package java_assignment8;

public class ans_6 {

	public static Node<Integer> oddEven(Node<Integer> head)	{		//place even after odd
		Node<Integer> oddhead = null;
		Node<Integer> oddtail = null;
		Node<Integer> evenhead = null;
		Node<Integer> eventail = null;
		while(head != null)	{
			if(head.data % 2 == 0)	{
				if(evenhead == null)	{
					evenhead = head;
					eventail = head;
					head = head.next;
				}
				else	{
					eventail.next = head;
					eventail = head;
//					eventail = eventail.next;
					head = head.next;
				}
			}
			else	{
				
				if(oddhead == null)	{
					oddhead = head;
					oddtail = head;
					head = head.next;
				}
				else	{
					oddtail.next = head;
					oddtail = head;
//					oddtail = oddtail.next;
					head = head.next;
				}
			}
		}
		oddtail.next = evenhead;
		eventail.next = null;				//**************very important condition*************
		return oddhead;
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
		Node<Integer> head = ans5_reverse.takeInput();	
		Node<Integer> a = oddEven(head);
		printLL(a);
	}

}
