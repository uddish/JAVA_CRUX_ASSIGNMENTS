package java_assignment12;

import java.util.ArrayList;

public class InorderIteratively {

	public static void inorderIterative(BTNode<Integer> root)	{
		BTNode<Integer> temp = root;
		stack<BTNode<Integer>> s = new stack<>();
		while(temp != null)	{
			s.push(temp);
			temp = temp.left;
		}
		while(s.size > 0)	{
			temp = s.pop();
			System.out.print(temp.data + " ");
			if(temp.right != null)	{
				temp = temp.right;
				while(temp != null)	{
					s.push(temp);
					temp = temp.left;
				}
			}
		}
	}

	public static void reverseinorderIterative(BTNode<Integer> root)	{
		BTNode<Integer> temp = root;
		stack<BTNode<Integer>> s = new stack<>();
		while(temp != null)	{
			s.push(temp);
			temp = temp.right;
		}
		while(s.size > 0)	{
			temp = s.pop();
			System.out.print(temp.data + " ");
			if(temp.left != null)	{
				temp = temp.left;

				while(temp != null)	{
					s.push(temp);
					temp = temp.right;
				}
			}
		}
	}

	public static void main(String[] args) {
		//10 5 15 1 6 11 20 -1 -1 -1 -1 -1 -1 -1 -1 
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		inorderIterative(root);
		System.out.println();
		reverseinorderIterative(root);
	}

}
