package lecture18;

import lecture17.BTNode;
import lecture17.BinaryTreeUse;

public class isBST_better_solution {					//awesome stuff 

	public static triplet isBST(BTNode<Integer> root)	{

		if(root == null)	{
			triplet ans = new triplet();
			ans.isBST = true;
			ans.max = Integer.MIN_VALUE;					//Important condition*
			ans.min = Integer.MAX_VALUE ;					//Important condition*
			return ans;
		}

		triplet MaxLeft = isBST(root.left);
		triplet MinRight = isBST(root.right);
		triplet ans = new triplet();

		ans.max = Math.max(root.data, Math.max(MaxLeft.max, MinRight.max));//height changes at every level
		ans.min = Math.max(root.data, Math.max(MaxLeft.min, MinRight.min));//***************important****
		if(MaxLeft.isBST && MinRight.isBST)	{	//we can combine all the conditions in one if statement
			if(MaxLeft.max > root.data || MinRight.min < root.data)	{
				ans.isBST = false;
			}
			else	{
				ans.isBST = true;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(isBST(root).isBST);
//		System.out.println(isBST(root).max);
	}

}
