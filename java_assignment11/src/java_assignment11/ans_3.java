package java_assignment11;

public class ans_3 {

	public static triplet_ans3 check(BTNode<Integer> root)	{

		if(root == null)	{
			triplet_ans3 ans = new triplet_ans3();
			ans.height = 0;
			ans.isBalance = true;
			return ans;
		}

		triplet_ans3 leftH = check(root.left);		
		//****update height of ans and check isbalance of both leftH and rightH****
		triplet_ans3 rightH = check(root.right);
		triplet_ans3 ans = new triplet_ans3();
		ans.height = Math.max(leftH.height,rightH.height) +1;
		if(leftH.isBalance && rightH.isBalance)	{
			if(leftH.height - rightH.height == 0 || leftH.height - rightH.height == 1)	{
				ans.isBalance = true;
			}
			else	{
				ans.isBalance = false;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// 1 2 3 4 5 6 -1 -1 -1 -1 -1 -1 -1 
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(check(root).isBalance);
	}

}
