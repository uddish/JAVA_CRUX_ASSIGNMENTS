package lecture16;


public class LargestDataNode {

	public static int largestDataNode(TreeNode<Integer> root)	{
		if(root == null)	{
			return 0;
		}
		int largest = 0;
		for(TreeNode<Integer> child : root.children)	{
			int ans = largestDataNode(child);
			if(ans > largest)
				largest = ans;
		}
		if(root.data > largest)
			return root.data;
		return largest;
	}

	public static void valueAtDepthK(TreeNode<Integer> root, int k)	{
		if(k == 0)	{
			System.out.println(root.data);
			return;
		}
		for(TreeNode<Integer> child : root.children)	{
			valueAtDepthK(child, k-1);
		}
	}

	public static void main(String[] args) {
		//1 3 2 3 4 0 2 5 6 1 7 0 0 1 8 0
		TreeNode<Integer> tree = TreeUse.takeInput();
		TreeUse.printLevelWise(tree);
		System.out.println("largest : " + largestDataNode(tree));
//		int k = 2;
//		System.out.println("All elements at depth " + k + " : ");
//		valueAtDepthK(tree, k);
//		System.out.println();

	}

}
