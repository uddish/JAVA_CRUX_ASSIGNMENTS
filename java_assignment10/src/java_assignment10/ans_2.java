package java_assignment10;

import java.util.ArrayList;

//import lecture16.TreeNode;

public class ans_2 {


	public static Boolean compare(TreeNode<Integer> root1, TreeNode<Integer> root2)	{
		
		if(root1 == null || root2 == null)	{
			return false;
		}
		
		if(root1.data != root2.data)	{
			return false;
		}
		Boolean ans = true;
		ArrayList<TreeNode<Integer>> temp1;
		temp1 = root1.children;
		ArrayList<TreeNode<Integer>> temp2;
		temp2 = root2.children;
		for(int i = 0;i < temp1.size() && i < temp2.size();i++)	{
			ans = compare(temp1.get(i),temp2.get(i));
		}
		return ans;
	}
	

	public static void main(String[] args) {
		TreeNode<Integer> root1 = TreeUse.takeInput();
		TreeNode<Integer> root2 = TreeUse.takeInput();
		System.out.println(compare(root1, root2));
	}

}
