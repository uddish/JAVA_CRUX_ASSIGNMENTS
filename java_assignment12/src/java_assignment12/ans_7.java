package java_assignment12;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ans_7 {
	
	public static ArrayList<Integer> reverseinorderIterative(BTNode<Integer> root)	{
		ArrayList<Integer> newArray = new ArrayList<>();
		BTNode<Integer> temp = root;
		stack<BTNode<Integer>> s = new stack<>();
		while(temp != null)	{
			s.push(temp);
			temp = temp.right;
		}
		while(s.size > 0)	{
			temp = s.pop();
			newArray.add(temp.data);
			if(temp.left != null)	{
				temp = temp.left;

				while(temp != null)	{
					s.push(temp);
					temp = temp.right;
				}
			}
		}
		return newArray;
	}
	
	public static BTNode<Integer> arrayToBST(ArrayList<Integer> a,int start,int end)	{		//NO NEED
		
		if(start > end )	{
			return null;
		}
		int mid = (start+end)/2;
		BTNode<Integer> root = new BTNode<Integer>(a.get(mid));
		root.right = arrayToBST(a, start, mid-1);
		root.left = arrayToBST(a, mid+1, end);
		return root;
	}
	
	public static BTNode<Integer> ans(ArrayList<Integer> newArray)	{					//Array that has nodes replaced with sum
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(newArray.get(0));
		int sum = 0;
		for(int i = 1;i < newArray.size();i++)	{
			sum = sum + newArray.get(i-1);
			temp.add(sum);
		}
		for(int i = 0;i < temp.size();i++)
			System.out.print(temp.get(i) + " ");
		BTNode<Integer> newTree = arrayToBST(temp, 0, temp.size()-1);
		return newTree;
	}

	public static void main(String[] args) {
		//8 5 20 2 6 10 25 -1 -1 -1 -1 -1 -1 -1 -1 
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		ArrayList<Integer> newArray = reverseinorderIterative(root);
		BTNode<Integer> tree = ans(newArray);
		System.out.println();
		BinaryTreeUse.PrintBT(tree);
	}

}
