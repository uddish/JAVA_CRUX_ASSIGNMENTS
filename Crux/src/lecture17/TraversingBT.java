package lecture17;

public class TraversingBT {

	public static void preOrder(BTNode<Integer> root)	{
		if(root == null)	{
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void postOrder(BTNode<Integer> root)	{
		if(root == null)	{
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");

	}

	public static void inOrder(BTNode<Integer> root)	{
		if(root == null)	{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}

	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		//preOrder(root);
		//postOrder(root);
		inOrder(root);
	}

}
