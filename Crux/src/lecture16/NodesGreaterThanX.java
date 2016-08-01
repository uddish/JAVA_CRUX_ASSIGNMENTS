package lecture16;

public class NodesGreaterThanX {
	
	public static int NodesGreaterThanX(TreeNode<Integer> root,int x)	{
		
		if(root == null)	{
			return 0;
		}
		int count = 0;
		for(TreeNode<Integer> child : root.children)	{
			int ans = NodesGreaterThanX(child,x);
				count += ans;
		}
		if(root.data > x)	{
			return count+1;
		}
		return count;
	}

	public static void main(String[] args) {
		//1 3 2 3 4 0 2 5 6 1 7 0 0 1 8 0
		TreeNode<Integer> tree = TreeUse.takeInput();
		TreeUse.printLevelWise(tree);
		System.out.println("count: " + NodesGreaterThanX(tree, 3));
	}

}
