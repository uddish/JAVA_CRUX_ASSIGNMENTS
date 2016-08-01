package lecture18;

import lecture17.BTNode;
import lecture17.BinaryTreeUse;

public class BSTClass {

	BTNode<Integer> root;
	int size;



	private Boolean findElement(int value, BTNode<Integer> root)	{
		if(root == null) {
			return false;
		}
		if(root.data == value) {
			return true;
		}
		if(value < root.data)
			return findElement(value, root.left);
		else 
			return findElement(value, root.right);
	}

	public Boolean findElement(int value)	{
		return findElement(value,root);
	}

	private BTNode<Integer> insertion(int value, BTNode<Integer> root)	{

		if(root == null)	{
			BTNode<Integer> node = new BTNode<Integer>(value);
			return node;
		}
		if(value < root.data)	{
			root.left = insertion(value, root.left);
			//return root;
		}
		else	
			root.right = insertion(value, root.right);

		return root;
	}

	public void insertion(int value)	{
		root = insertion(value,root);
	}






	public static void main(String[] args) {
		BSTClass obj = new BSTClass();
		obj.insertion(1);
		obj.insertion(2);
		BinaryTreeUse.PrintBT(obj.root);

	}
}
