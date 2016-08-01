package java_assignment12;

public class ans_8 {

	public static void printNode(BTNode<Integer> root, int k, int node)	{
		//TODO add conditions to print parent and left side nodes which are at k distance from the given node
		BTNode<Integer> newRoot = returnNode(root, node);				//calling return node function

		BTNode<Integer> leftRoot = null;
		BTNode<Integer> rightRoot = null;

		if(k == 0)	{
			System.out.print(newRoot.left.data + " ");
			System.out.println(newRoot.right.data + " ");
			return;
		}
		for(int i = 0;i < k;i++)	{
			leftRoot = newRoot.left;
			rightRoot = newRoot.right;
		}
		if(leftRoot.left != null && leftRoot.right != null)	{
			System.out.print(leftRoot.left.data + " ");
			System.out.print(leftRoot.right.data + " ");
		}
		else if(leftRoot.left != null && leftRoot.right == null)	{
			System.out.print(leftRoot.left.data + " ");
		}
		else	{
			System.out.print(leftRoot.right.data + " ");
		}
		if(rightRoot.left != null && rightRoot.right != null)	{
			System.out.print(rightRoot.left.data + " ");
			System.out.print(rightRoot.right.data + " ");
		}
		else if(rightRoot.left != null && rightRoot.right == null)
			System.out.print(rightRoot.left.data + " ");
		else
			System.out.print(rightRoot.right.data + " ");
	}

	private static BTNode<Integer> returnNode(BTNode<Integer> root, int node)	{			//function to find node		
		if(root == null)	{
			return null;
		}

		if(root.data == node)	{
			return root;
		}
		BTNode<Integer> ans = returnNode(root.left, node);
		BTNode<Integer> ans1;
		if(ans == null)	{
			ans1 = returnNode(root.right, node);
			if(ans1 == null)	{
				return null;
			}
			else
				return ans1;
		}
		return ans;
	}


	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 -1 9 -1 10 11 12 13 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		printNode(root, 1, 3);
	}

}
