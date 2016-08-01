package java_assignment8;

public class insertionSort {

	public static Node<Integer> insertionSort(Node<Integer> head)	{
		Node<Integer> temp = null,h = head,h1 = null,t1 = null;
		temp = h.next;
		h.next = null;
		while(temp != null)	{
			int i = 1;
			h = head;
			h1 = head;

			while(h != null)	{				//to Calculate index to swap
				if(temp.data < h.data)	{
					break;
				}
				else	{
					h = h.next;
					i++;
				}
			}
			for(int j = 0;j < i;j++)	{

				if(i == 1)	{
					t1 = temp.next;
					temp.next = h1;
					head = temp;
					temp = t1;
				}
				else if(j == i-2)	{
					t1 = temp.next;
					temp.next = h1.next;
					h1.next = temp;
					temp = t1;
				}
				else
					h1 = h1.next;
			}

		}

		return head;
	}


	public static void main(String[] args) {
		Node<Integer> head = ans_3_selectionSort.takeInput();
		Node<Integer> a = insertionSort(head);
		ans_3_selectionSort.printLL(a);
	}
}
