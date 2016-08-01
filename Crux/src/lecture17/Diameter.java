package lecture17;

public class Diameter {
	
	public static int getHeight(BTNode<Integer> root)	{
		if(root == null)	{
			return 0;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		if(leftHeight > rightHeight)
			return leftHeight+1;					//return math.max(lefHeight,rightHeight)+1
		else
			return rightHeight+1;
	}
	
	public static int Diameter(BTNode<Integer> root)	{
		if(root == null)	{
			return 0;
		}
		int d1 = getHeight(root.left) + getHeight(root.right) + 1;
		int d2 = Diameter(root.left);
		int d3 = Diameter(root.right);
		if(d1 > d2 && d1 > d3)	{				//math.max(d1,math.max(d2,d3))
			return d1;
		}
		else if(d2 > d1 && d2 > d3)	{
			return d2;
		}
		else
			return d3;
	}

	public static void main(String[] args) {
		// 1 2 3 4 5 6 -1 -1 -1 -1 -1 -1 -1 
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		BinaryTreeUse.PrintBT(root);
		System.out.println("height : " + getHeight(root));
		System.out.println("diameter : " + Diameter(root));
	}

}
