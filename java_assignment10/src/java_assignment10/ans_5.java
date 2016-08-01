package java_assignment10;

public class ans_5 {

	static int count = 0;


	public static int noOfLeaves(TreeNode<Integer> root)	{
		//if(root == null)	{									BAD SOLUTION SUCKER
		//count++;
		//return count;
		//}
		//for(TreeNode<Integer> child : root.children)	{
		//int ans = count + noOfLeaves(child,count);
		//count = ans;
		//}
		//return count;
		if(root == null)	{
			return 0;
		}
		if(root.children.isEmpty())	{
			count++;
		}
		for(TreeNode<Integer> child : root.children)	{
			noOfLeaves(child);
			
		}
		return count;
	}

	public static void main(String[] args) {
		//1 3 2 3 4 0 2 5 6 1 7 0 0 1 8 0
		TreeNode<Integer> tree = TreeUse.takeInput();
		TreeUse.printLevelWise(tree);
		System.out.println("No. of leaves : " + noOfLeaves(tree));
	}

}
