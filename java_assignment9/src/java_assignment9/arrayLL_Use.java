package java_assignment9;

import java.util.Scanner;

public class arrayLL_Use {

	public static void main(String[] args) throws stackEmptyException,stackFullException{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		stack_array st = new stack_array(size);
		for(int i = 0;i <= size;i++)	{
			try {
				st.push(i);
			} catch (stackFullException e) {
				System.out.println("Stack Full");
			}
		}
		System.out.println("size : " + st.size());

		try {
			System.out.println("Top : " + st.top());
			System.out.println("Pop : " + st.pop());
			System.out.println("Pop : " + st.pop());
		} catch (stackEmptyException e) {
			System.out.println("Stack Empty");
		}
	}
}
