package java_assignment10;

import java.util.Scanner;

public class TreeUse {

	public static TreeNode<Integer> takeInput()	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
		int data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		queue_LinkList<TreeNode<Integer>> queue = new queue_LinkList<TreeNode<Integer>>();
		queue.enqueue(root);

		while(!queue.isEmpty())	{
			TreeNode<Integer> child = queue.dequeue();
			System.out.println("Enter no. of children of " + child.data);
			int n = s.nextInt();
			for(int i = 0;i < n;i++)	{
				System.out.println("Enter " + i + "th child of  " + child.data + " ");
				data = s.nextInt();
				TreeNode<Integer> d = new TreeNode<Integer>(data);		//d entered is also a node
				queue.enqueue(d);
				child.children.add(d);					//adding in children arraylist of treenode
			}

		}
		return root;
	}

	public static void printLevelWise(TreeNode<Integer> root)	{
		queue_LinkList<TreeNode<Integer>> queue = new queue_LinkList<TreeNode<Integer>>();
		queue.enqueue(root);
		while(!queue.isEmpty())	{
			TreeNode<Integer> child = queue.dequeue();
			String toBePrinted = child.data + ": ";
			for(TreeNode<Integer> child1 : child.children)	{
				toBePrinted += child1.data + ",";
				queue.enqueue(child1);				//storing in a queue
			}
					System.out.println(toBePrinted);
		}
	}

	public static void main(String[] args) {
		TreeNode<Integer> tree = takeInput();
		printLevelWise(tree);
	}
}
