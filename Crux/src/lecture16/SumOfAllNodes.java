package lecture16;

public class SumOfAllNodes {
	
	public static int sum(TreeNode<Integer> root)	{
		if(root == null)	{
			return 0;
		}
		int sum = 0;
		for(TreeNode<Integer> child : root.children)	{
			int ans = sum(child);
			sum += ans;
		}
		return sum + root.data;
	}

	public static void main(String[] args) {
		//1 3 2 3 4 0 2 5 6 1 7 0 0 1 8 0
		TreeNode<Integer> tree = TreeUse.takeInput();
		TreeUse.printLevelWise(tree);
		System.out.println("Sum : " + sum(tree));
	}

}
