package java_assignment11;

public class ans_5 {				//print those who don't have siblings

	public static void noSiblings(BTNode<Integer> root)	{
		if(root == null)	{
			return;
		}
		noSiblings(root.left);
		noSiblings(root.right);
		if(root.left != null && root.right == null)	{
			System.out.println(root.left.data);
		}
		else if(root.left == null && root.right != null)	{
			System.out.println(root.right.data);
		}
		
	}
	
	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		noSiblings(root);
	}

}
