package java_assignment12;

public class ans6_recursion {

	public static triplet Check(BTNode<Integer> root)	{
		//		BTNode<Integer> ans;
		if(root == null)	{
			triplet obj = new triplet();
			obj.isBST = true;
			obj.min = Integer.MAX_VALUE;
			obj.max = Integer.MIN_VALUE;
			obj.size = 0;
			return obj;
		}
		triplet left = Check(root.left);
		triplet right = Check(root.right);
		
		triplet ans = new triplet();
		if(left.isBST && right.isBST)	{
			if(left.size > right.size)
				ans.size = left.size;
			else
				ans.size = right.size;
		}

		
		return ans;
	}

	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		triplet obj = new triplet();
		triplet check =  Check(root);
	}

}
