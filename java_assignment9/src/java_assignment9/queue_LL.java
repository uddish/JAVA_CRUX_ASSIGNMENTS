package java_assignment9;

//import lecture13.Node;

public class queue_LL<T> {
	
		Node<T> head;
		Node<T> tail;
		int size;

		public int size()	{
			return size;
		}

		public Boolean isEmpty()	{
			return (head == null);
		}

		public T front()	{							//value of head is only displayed
			return head.data;
		}

		public void enqueue(T data)	{
			Node<T> temp = new Node<T>(data);
			//Node<T> tail = null;
			if(head == null)	{
				head = temp;
				tail = head;
			}
			else	{
				tail.next = temp;
				tail = temp;
			}
			size++;
		}

		public T dequeue()	{						//value is given to the user
			T temp = head.data;
			size--;
			head = head.next;
			return temp;
		}

}
