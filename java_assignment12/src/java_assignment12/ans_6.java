package java_assignment12;

import java.util.ArrayList;

public class ans_6 {

	public static void insertionInArray(BTNode<Integer> root)	{
		ArrayList<Integer> ans = new ArrayList<>();
		queue_LinkList<BTNode<Integer>> queue = new queue_LinkList<BTNode<Integer>>();
		queue.enqueue(root);
		queue.enqueue(null);
		ans.add(null);
		while(!queue.isEmpty())	{
			BTNode<Integer> child = queue.dequeue();
			if(child == null)	{
				if(!queue.isEmpty())	{	//infinite loop because null will be enqueued every time
					queue.enqueue(child);
					System.out.println();
				}
			}
			else	{
				ans.add(child.data);
				if(child.left != null)	{
					queue.enqueue(child.left);
				}
				if(child.right != null)	{
					queue.enqueue(child.right);
				}
			}
		}


		LargestBSTinBT(ans);
	}
	
	public static void LargestBSTinBT(ArrayList<Integer> ans)	{
		ArrayList<Integer> temp = new ArrayList<>();
		ArrayList<Integer> temp1 = new ArrayList<>();
		int i = 1, j = 1;
		for(int k = 1;k < ans.size();k++)	{
			if(ans.get(k) > ans.get(2*i) && ans.get(k) < ans.get(2*i+1))	{
				temp.add(ans.get(k));
				temp.add(ans.get(2*i));
				temp.add(ans.get(2*i+1));
				if(temp1.size() < temp.size())	{
					for(int m = 0;m < temp.size();m++)
						temp1.add(temp.remove(m));
				}
			}
			i++;

			}
			arrayToBST(temp1, 0, temp1.size());
		}
		
	public static BTNode<Integer> arrayToBST(ArrayList<Integer> a,int start,int end)	{
		
		if(start > end )	{
			return null;
		}
		int mid = (start+end)/2;
		BTNode<Integer> root = new BTNode<Integer>(a.get(mid));
		root.left = arrayToBST(a, start, mid-1);
		root.right = arrayToBST(a, mid+1, end);
		
		return root;
	}
	
	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
//		insertionInArray(root);
		insertionInArray(root);
	}

}
