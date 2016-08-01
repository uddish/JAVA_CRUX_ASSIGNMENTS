package java_assignment11;

import java.util.Scanner;
//
//import java_assignment12.queue_LinkList;


public class BinaryTreeUse {

	public static BTNode<Integer> takeInput()	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		if(rootData == -1)	{
			return null;
		}
		BTNode<Integer> root = new BTNode<Integer>(rootData);
		queue_LinkList<BTNode<Integer>> queue = new queue_LinkList<BTNode<Integer>>();
		queue.enqueue(root);
		while(!queue.isEmpty())	{
			BTNode<Integer> child = queue.dequeue();
			System.out.println("Enter left child of " + child.data + " ");
			int left = s.nextInt();
			if(left != -1)	{
				BTNode<Integer> leftChild = new BTNode<Integer>(left);
				child.left = leftChild;
				queue.enqueue(leftChild);
			}
			System.out.println("Enter right child of " + child.data + " ");
			int right = s.nextInt();
			if(right != -1)	{
				BTNode<Integer> rightChild = new BTNode<Integer>(right);
				child.right = rightChild;
				queue.enqueue(rightChild);
			}
		}
		return root;
	}
	
	public static void PrintBT(BTNode<Integer> root)	{
		if(root == null)	{
			return;
		}
		String print = root.data + " : ";
		
		if(root.left != null)	{
			print += root.left.data + " , ";
		}
		if(root.right != null)	{
			print += root.right.data + " , ";
		}
		System.out.println(print);
		PrintBT(root.left);
		PrintBT(root.right);
	}

	public static void main(String[] args) {
		BTNode<Integer> root = takeInput();
		PrintBT(root);
	}

	
}
