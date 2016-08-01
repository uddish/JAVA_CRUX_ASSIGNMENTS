package lecture18;

import lecture17.BTNode;
import lecture17.BinaryTreeUse;

public class array_into_BST {
	
	public static BTNode<Integer> arrayToBST(int a[],int start,int end)	{
		
		if(start > end )	{
			return null;
		}
		int mid = (start+end)/2;
		BTNode<Integer> root = new BTNode<Integer>(a[mid]);
		root.left = arrayToBST(a, start, mid-1);
		root.right = arrayToBST(a, mid+1, end);
		
		return root;
	}
	

	public static void main(String[] args) {
		int a[] = {1,2,3,10,11,14,15};
		BTNode<Integer> print = arrayToBST(a, 0,a.length-1);
		BinaryTreeUse.PrintBT(print);
	}

}
