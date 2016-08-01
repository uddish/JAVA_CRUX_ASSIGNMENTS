package java_assignment11;

public class ans_1_sum {

	public static int SumOfNodes(BTNode<Integer> root)	{
		
		if(root == null)	{
			return 0;
		}
		int left = 0, right = 0;
		left = left + SumOfNodes(root.left);
		right = right + SumOfNodes(root.right);
		
		return root.data + left + right;
	}
	
	public static void main(String[] args) {
		//1 2 3 4 5 -1 -1 -1 -1 -1 -1
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		BinaryTreeUse.PrintBT(root);
		System.out.println("SUM : " + SumOfNodes(root));
	}

}
