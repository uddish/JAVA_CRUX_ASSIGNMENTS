package java_assignment8;

public class selesctionSort_node {

	public static Node<Integer> selectionSort(Node<Integer> head)	{

		Node<Integer> temp = null;
		Node<Integer> prevSmall = null;
		Node<Integer> prevHead = null;
		Node<Integer> small = head;
		Node<Integer> current = null;
		Node<Integer> current1 = head;
		Node<Integer> temp1 = null;
		while(head.next != null)	{
			current = null;
			temp = head;
			prevSmall = head;
			while(temp.next != null)	{
				if(small.data > temp.next.data)	{
					prevSmall = small;
					temp = temp.next;
					small = temp;
				}
				else
					temp = temp.next;
			}

			if(head == small)	{						//(1) head is the small
				prevHead = head;
				head = head.next;
				small = head;
//				head = head.next;
			}

			else if(head.next == small)	{					//(2) small is adjacent to head
				if(prevHead == null)	{
					head.next = small.next;
					small.next = head;
					prevHead = small;
					current1 = small;
//					prevSmall = small;
					small = head;
				}
				else	{
					prevHead.next = small;
					small.next = head;
					head.next = null;
//					prevSmall = small;
					prevHead = small;
					small = head;
				}

			}
			else if(head.next != small)	{
				if(prevHead == null)	{						//(3) if small is between somewhere
					small.next = current;
					small.next = head.next;
					head.next = current;
					prevSmall.next = head;
					current1 = small;
					prevHead = small;
					head = small.next;
					small = head;
				}
				else
				{
					small.next = head.next;
					prevSmall.next = prevHead.next;
					prevHead.next = small;
					head.next = temp;
//					prevSmall = small;
					head = small;
					prevHead = head;
					head = head.next;
					small = head;
					
				}
			}
		
		}
		return current1;
	}
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head = ans_3_selectionSort.takeInput();
		Node<Integer> a = selectionSort(head);
		printLL(a);

	}
}