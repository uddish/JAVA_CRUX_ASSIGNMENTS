package java_assignment12;

import java.util.ArrayList;

public class ans_9 {

	public static void PrintPath(BTNode<Integer> root, int k, int a[], int size)	{

		if(root == null)	{
			return;
		}
		a[size] = root.data;
		size++;
		if(root.left == null && root.right == null)	{
			printRootToLeaf(a, size,k);
		}
		else	{
			PrintPath(root.left, k, a, size);
			PrintPath(root.right, k, a, size);
		}
	}

	public static void printRootToLeaf(int a[], int size,int k)	{
		int sum = 0;
		for(int i = 0;i < size;i++)	{
			sum += a[i];
		}
		if(sum == k)	{
			for(int i = 0;i < size;i++)	{
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		int a[] = new int[50];
		PrintPath(root,7,a,0);

	}

}
