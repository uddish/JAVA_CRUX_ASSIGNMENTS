package java_assignment12;

public class ans_2 {

	public static BTNode<Integer> ans2(BTNode<Integer> root)	{

		if(root == null)	{
			return null;
		}
		BTNode<Integer> newNode = new BTNode<Integer>(root.data);
		BTNode<Integer> temp = root.left;
		root.left = newNode;
		newNode.left = temp;
		ans2(newNode.left);
		ans2(root.right);

		return root;

	}

	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		BTNode<Integer> ans = ans2(root);
		BinaryTreeUse.PrintBT(ans);
	}

}
