package java_assignment11;

public class ans_6 {			//remove all the leaves from the binary tree

	public static BTNode<Integer> removeLeaves(BTNode<Integer> root)	{
		
		if(root.left == null && root.right == null)	{
			return null;
		}
		root.left = removeLeaves(root.left);				//the root will be attached to the left of the node
		root.right = removeLeaves(root.right);
		return root;
	}
	
	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		BTNode<Integer> ans = removeLeaves(root);
		BinaryTreeUse.PrintBT(ans);
	}

}
