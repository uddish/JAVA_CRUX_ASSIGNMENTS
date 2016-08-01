package lecture16;

public class CountNumberOfNodes {

	public static int Count(TreeNode<Integer> root)	{
		if(root == null)	{
			return 0;
		}
		int count = 0;
		for(TreeNode<Integer> child : root.children)	{
			int ans = Count(child);
			count += ans;			//adding individual nodes(obtained from the ans) in count
		}
		return count+1;
	}

	public static void main(String[] args) {
		//1 3 2 3 4 0 2 5 6 1 7 0 0 1 8 0
		TreeNode<Integer> tree = TreeUse.takeInput();
		TreeUse.printLevelWise(tree);
		System.out.println("No. of nodes: " + Count(tree));
	}

}
