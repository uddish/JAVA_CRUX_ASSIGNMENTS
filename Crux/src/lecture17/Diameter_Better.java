package lecture17;

public class Diameter_Better {

	public static Pair diameter_better(BTNode<Integer> root)	{
		if(root == null)	{
			Pair ans = new Pair();
			ans.diameter = 0;
			ans.height = 0;
			return ans;
		}
		Pair ans1 = diameter_better(root.left);
		Pair ans2 = diameter_better(root.right);
		Pair ans3 = new Pair();
		ans3.height = Math.max(ans1.height, ans2.height) + 1;
		ans3.diameter = ans1.height + ans2.height + 1;
		Pair ans;

		if(ans1.diameter > ans2.diameter && ans1.diameter > ans3.diameter)	{
			ans = ans1;
		}
		else if(ans2.diameter > ans1.diameter && ans2.diameter > ans3.diameter)	{
			ans = ans2;
		}
		else	{
			ans = ans3;
		}
		return ans;
	}


	public static void main(String[] args) {
		// 1 2 3 4 5 6 -1 -1 -1 -1 -1 -1 -1 
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		BinaryTreeUse.PrintBT(root);
		System.out.println("Diameter : " + diameter_better(root).diameter);
		

	}

}
