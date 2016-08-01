package java_assignment11;

public class ans_2 {

	public static Boolean check(BTNode<Integer> root1, BTNode<Integer> root2)	{
		if(root1 == null && root2 == null)	{
			return true;
		}
		if(root1.data != root2.data)	{
			return false;
		}
		Boolean ans;
		ans = check(root1.left, root2.left);
		ans = check(root1.right, root2.right);
		return ans;
	}
	
	public static void main(String[] args) {
		BTNode<Integer> root1 = BinaryTreeUse.takeInput();
		BTNode<Integer> root2 = BinaryTreeUse.takeInput();
		System.out.println(check(root1, root2));
	}

}
