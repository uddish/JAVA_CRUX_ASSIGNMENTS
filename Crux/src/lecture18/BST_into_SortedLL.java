package lecture18;

import lecture13.LinkedListUse;
import lecture13.Node;
import lecture17.BTNode;
import lecture17.BinaryTreeUse;

public class BST_into_SortedLL {

	public static Node<Integer> BST_LL(BTNode<Integer> root)	{
		if(root == null)	{
			return null;
		}
		Node<Integer> newNode = new Node<Integer>(root.data);

		Node<Integer> left = BST_LL(root.left);
		Node<Integer> right = BST_LL(root.right);
		Node<Integer> head = left;
		if(left == null)	{
			newNode.next = right;
			return newNode;
		}
		while(left.next != null)	{
			left = left.next;
		}

		left.next = newNode;
		newNode.next = right;
		return head;
	}

	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		Node<Integer> head = BST_LL(root);
		LinkedListUse.printLL(head);
	}

}
