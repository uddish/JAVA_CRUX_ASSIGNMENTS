package java_assignment10;


public class ans_3 {

	public static int nextLargerElement(TreeNode<Integer> root, int n)	{
		if(root == null)	{
			return 0;
		}
		int large = Integer.MAX_VALUE;
		for(TreeNode<Integer> child : root.children)	{
			int ans = nextLargerElement(child, n);
			if(ans > n && ans < large)	{
				large = ans;
			}
		}
			if(root.data > n && root.data < large)
				return root.data;

		return large;
	}

	public static void main(String[] args) {
		//1 3 2 3 4 0 2 5 6 1 7 0 0 1 8 0
		TreeNode<Integer> tree = TreeUse.takeInput();
		TreeUse.printLevelWise(tree);
		int a = nextLargerElement(tree, 3);
		System.out.println("Next larger ---> " + a);
	}

}
