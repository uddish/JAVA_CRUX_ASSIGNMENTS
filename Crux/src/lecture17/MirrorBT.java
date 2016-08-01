package lecture17;

public class MirrorBT {

	public static void PrintBT(BTNode<Integer> root)	{
		if(root == null)	{
			return ;
		}
		String print = root.data + " : ";

		if(root.left != null)	{
			print += root.left.data + " , ";
		}
		if(root.right != null)	{
			print += root.right.data + " , ";
		}
		System.out.println(print);
		PrintBT(root.left);
		PrintBT(root.right);

	}

	public static void Mirror(BTNode<Integer> root)	{
		if(root == null)	{
			return;
		}
		BTNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
//		PrintBT(root);
		Mirror(root.left);
		Mirror(root.right);

	}

	public static void main(String[] args) {
		//1 2 3 4 5 -1 -1 -1 -1 -1 -1
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		Mirror(root);
		PrintBT(root);
	}

}
