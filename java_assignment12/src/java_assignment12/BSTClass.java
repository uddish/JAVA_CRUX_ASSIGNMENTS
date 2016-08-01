package java_assignment12;

import java.util.ArrayList;

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

	static ArrayList<Integer> ans = new ArrayList<>();					
	public static ArrayList<Integer> inOrder(BTNode<Integer> root)	{	
		if(root == null)	{					
			return ans;
		}
		inOrder(root.left);
		ans.add(root.data);
		inOrder(root.right);
		return ans;
	}

	public void remove(BTNode<Integer> root, int n, ArrayList<Integer> ans)	{
		// TODO complete remove 
		if(root == null)	{
			return;
		}
		for(int i = 0;i < ans.size();i++)
			if(n == ans.get(i))	{
				ans.set(i, ans.get(i+1));
			}
	}

	public static void main(String[] args) {
		BSTClass obj = new BSTClass();
		obj.insertion(2);
		obj.insertion(1);
		obj.insertion(3);
		obj.insertion(7);
		BinaryTreeUse.PrintBT(obj.root);

	}
}

