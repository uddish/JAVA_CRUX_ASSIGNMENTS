package lecture15;

import lecture13.Node;

public class brackets_balanced<T> {
	Node<T> head;
	int size;

	public int size()	{
		return size;
	}

	public Boolean isEmpty()	{
		return (head == null);
	}

	public T top()	{							//value of head is only displayed
		return head.data;
	}

	public void push(T data)	{
		Node<T> temp = new Node<T>(data);
		temp.next = head;
		head = temp;
		size++;
	}
	public T pop()	{						//value is given to the user
		T temp = head.data;
		size--;
		head = head.next;
		return temp;

	}

	public static Boolean check(String s)	{
		brackets_balanced<Character> s1 = new brackets_balanced<Character>();
		for(int i = 0;i < s.length();i++)	{
			if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(')	{
				s1.push(s.charAt(i));
			}
			else if(s.charAt(i) == ')')	{
				int lastOpeningBracket = s1.pop();
				if(s.charAt(i) != lastOpeningBracket)
					return false;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		String s = "{a+[b+(c+d)]+(e+f)}";
		check(s);

	}

}
