package java_assignment12;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ans_10 {

	/*public static Boolean checkSum(BTNode<Integer> root, int n, BSTClass obj)	{

		if( n == 2*root.data)
			return false;
		BTNode<Integer> temp = root;
		if(n <= root.data)	{
			while(root != null)	{
				root = root.left;
				int a = root.data - n;
				if(obj.findElement(a))
					return true;
			}
		}
		else if(n > root.data && n <= 2*root.data-1)	{
			int a = n - root.data;
			if(obj.findElement(a))
				return true;
			root = root.left;
			while(root != null)	{
				a = n - root.data;
				root = root.left;
				if(obj.findElement(a))
					return true;
			}
		}
		else	{
			int a = n - root.data;
			if(obj.findElement(a))
				return true;
			root = root.right;
			while(temp != null)	{
				a = n - root.data;
				if(obj.findElement(a))
					return true;
//				temp = root.left;
			}
		}
		return false;
	}*/
	static ArrayList<Integer> ans = new ArrayList<>();					//******1.Find inorder of BST, put inorder in arraylist***
	public static ArrayList<Integer> inOrder(BTNode<Integer> root)	{	//*****2.arraylist will be sorted automatically*****
		if(root == null)	{						//**3. now find 2 elements which sum to K as done in previous array assignment**
//			ans.add(0);
			return ans;
		}
		inOrder(root.left);
		ans.add(root.data);
//		System.out.print(root.data + " ");
		inOrder(root.right);
		return ans;
	}
	
	public static Boolean checkSum(ArrayList<Integer> ans, int n)	{
		int i = 0;
		int j = ans.size()-1;
		while(i < j)	{
//			for(int k = 0;i < ans.size();i++)	{
				if(ans.get(i) + ans.get(j) == n)
					return true;
				else if(ans.get(i) + ans.get(j) > n)	{
					j--;
				}
				else if(ans.get(i) + ans.get(j) < n)	{
					i++;
				}
//			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		ArrayList<Integer> a = inOrder(root);
		System.out.println(checkSum(a, 19));
		for(int i = 0; i < a.size();i++)	{
			System.out.print(a.get(i) + " ");
		}
//		4 2 6 1 3 5 8 -1 -1 -1 -1 -1 -1 -1 -1 
		/*BSTClass obj = new BSTClass();
		obj.insertion(10);
		obj.insertion(5);
		obj.insertion(15);
		obj.insertion(3);
		obj.insertion(6);
		obj.insertion(4);
		obj.insertion(2);
		obj.insertion(13);
		obj.insertion(17);
		obj.insertion(14);

		BinaryTreeUse.PrintBT(obj.root);
		Boolean ans = checkSum(obj.root, 6,obj);
		System.out.println(ans);*/
	}


}
