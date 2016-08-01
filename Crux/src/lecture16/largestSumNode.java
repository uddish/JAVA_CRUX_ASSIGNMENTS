package lecture16;

public class largestSumNode {

	public static TreeNode<Integer> largestSumNode(TreeNode<Integer> root)	{
		if(root == null)	{
			return null;
		}
		//		int sum = 0;
		TreeNode<Integer> ans = root;
		for(TreeNode<Integer> child : root.children)	{
			TreeNode<Integer> temp = largestSumNode(child);
			if(getSum(temp) > getSum(ans))	{
				ans = temp;
			}
		}
		return ans;
	}

	public static int getSum(TreeNode<Integer> root)	{				//helper function 
		int sum = 0;
		if(root == null)	{
			return 0;
		}
		for(TreeNode<Integer> child : root.children)	{
			sum += child.data;
		}
		return sum+root.data;
	}

	public static void main(String[] args) {
		//1 3 2 3 4 0 2 5 6 1 7 0 0 1 8 0
		TreeNode<Integer> tree = TreeUse.takeInput();
		TreeUse.printLevelWise(tree);
		System.out.println("largest sum node: " );
		TreeNode<Integer> l = largestSumNode(tree);
		System.out.println(l.data);
	}

}
