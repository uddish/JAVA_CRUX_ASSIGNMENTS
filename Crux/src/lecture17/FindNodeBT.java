package lecture17;

public class FindNodeBT {					//find node in a binary tree

	public static BTNode<Integer> check(BTNode<Integer> root, int k)	{
		if(root == null)	{
			return null;
		}
		if(root.data == k)
			return root;
		BTNode<Integer> ans1 = check(root.left,k);
		BTNode<Integer> ans2;
		if(ans1 == null)	{						//ans1 will have either null or k
			ans2 = check(root.right,k);				//if null, it can be in ans2
			if(ans2 == null)	{
				return null;
			}
				else	{
					return ans2;
			}
		}
		return ans1;
	}

	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		BinaryTreeUse.PrintBT(root);
		BTNode<Integer> h = check(root, 3);
		System.out.println("node : " + h.data);
	}

}
