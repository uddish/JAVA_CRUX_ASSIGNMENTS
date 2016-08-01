package java_assignment11;

import java.util.ArrayList;

public class ans_4 {
	
	public static ArrayList<Integer> ans4(BTNode<Integer> root)	{
	
		an4_pairClass<Integer> head = new an4_pairClass<Integer>(root.data);
		an4_pairClass<Integer> temp = head;
		ArrayList<Integer> a = new ArrayList<>();
		while(temp != null)	{
			a.add(temp.data);
			a.add(temp.next.data);
			temp = new an4_pairClass<Integer>(root.left.data);
			temp.next = new an4_pairClass<Integer>(root.right.data);
			head = head.next;
		}
		return a;
	}

	public static void main(String[] args) {
		BTNode<Integer> head = BinaryTreeUse.takeInput();
		ArrayList<Integer> a = ans4(head);
		for(int i = 0;i < a.size();i++)	{
			System.out.println(a + " ");
		}
	}

}
