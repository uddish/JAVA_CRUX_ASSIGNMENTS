package java_assignment12;

public class ans7_recursion {

	public static BTNode<Integer> replaceNode(BTNode<Integer> root, int sum)	{
		if(root == null)	{
			return null;
		}
		
		replaceNode(root.right, sum);
		sum = sum + root.data;
		root.data = sum - root.data;
		replaceNode(root.left, sum);
		
		return root;
	}
	
	/*public static triplet replaceNode(BTNode<Integer> root, int sum)	{
		if(root == null)	{
			triplet ans = new triplet();
			ans.max = Integer.MIN_VALUE;
			ans.min = Integer.MAX_VALUE;
			ans.isBST = true;
			ans.size = 0;
			return ans;
		}
		
		replaceNode(root.right, sum);
		sum = sum + root.data;
		root.data = sum;
		replaceNode(root.left, sum);
		triplet ans = new triplet();
		ans.max = 
	}*/
	
	public static void main(String[] args) {
		//11 2 29 1 7 15 40 -1 -1 -1 -1 -1 -1 -1 -1 
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		BTNode<Integer> ans = replaceNode(root, 0);
		BinaryTreeUse.PrintBT(ans);
		
	}

}
