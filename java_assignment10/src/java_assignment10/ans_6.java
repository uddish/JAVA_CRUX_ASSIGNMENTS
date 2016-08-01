package java_assignment10;

public class ans_6 {

	public static TreeNode<Integer> replacingWithDepth(TreeNode<Integer> root, int value)	{
		if(root == null)	{
			return null;
		}

		value++;
		for(TreeNode<Integer> child : root.children)	{
			TreeNode<Integer> ans = replacingWithDepth(child,value);
			ans.data = value;
		}

		root.data = 0;
		return root;
	}

	public static void main(String[] args) {
		//1 3 2 3 4 0 2 5 6 1 7 0 0 1 8 0
		TreeNode<Integer> tree = TreeUse.takeInput();
		TreeNode<Integer> root = replacingWithDepth(tree,0);
		TreeUse.printLevelWise(root);
	}

}
