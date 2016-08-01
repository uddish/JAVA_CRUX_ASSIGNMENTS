package lecture18;
import lecture17.BTNode;
import lecture17.BinaryTreeUse;

public class BT_check_ifBST {
	
	public static int getMax(BTNode<Integer> root)	{			//to find max value from left 
		if(root == null)	{
			return 0;
		}
		int left = Integer.MIN_VALUE;
		int ans = getMax(root.left);
		if(ans > left)
			left = ans;
		if(root.data > left)	
			return root.data;
		return left;
	}
	
	public static int getMin(BTNode<Integer> root)	{			//to find min value from right 
		if(root == null)	{
			return 0;
		}
		int right = Integer.MAX_VALUE;
		int ans = getMax(root.right);
		if(ans < right)
			right = ans;
		if(root.data < right)	
			return root.data;
		return right;
	}

	public static Boolean check(BTNode<Integer> root)	{
		if(root == null)	{
			return true;
		}
		int max = getMax(root.left);							//*important condition*
		int min = getMin(root.right);							//*important condition*
		if(max > root.data || min < root.data)	{				//*important condition*
			return false;
		}
		
		Boolean ans = false;

		if(root.left == null && root.right == null)	{
			return true;
		}
		else	{
			if(root.left != null && root.right == null)	{
				if(root.left.data < root.data)
					ans = check(root.left);
				else
					return false;
			}
			else if(root.right != null && root.left == null)	{
				if(root.right.data > root.data)
					ans = check(root.right);
				else
					return false;
			}
			else	{
				if(root.left.data < root.data && root.right.data > root.data)	{
					ans = check(root.left);
					ans = check(root.right);
				}
				else
					return false;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(check(root));
//		System.out.println(getMax(root.left));
	}

}
