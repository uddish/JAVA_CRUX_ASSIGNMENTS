package java_assignment12;

import java.util.ArrayList;


public class ans_4 {

	public static ArrayList<Integer> insertionInArray(BTNode<Integer> root)	{
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


		return ans;
	}

	public static int LCA(ArrayList<Integer> ans, int n1, int n2)	{

		int i = 1 ,j = 1;
		for(int k = 1;k < ans.size();k++)	{
			if(ans.get(k) == n1)	{
				i = k;
			}
			if(ans.get(k) == n2)	{
				j = k;
			}
		}

		while(ans.get(i) != ans.get(j))	{
			
			if(ans.get(i/2) == ans.get(j))	{
				return ans.get(j);
			}
			if(ans.get(j/2) == ans.get(i))	{
				return ans.get(i);
			}
			
			if(ans.get(i/2) != ans.get(1))	{
				i = i/2;
			}
			if(ans.get(j/2) != ans.get(1))	{
				j = j/2;
			}
			if(ans.get(i/2) == ans.get(1) && ans.get(j/2) == ans.get(1))
				return ans.get(1);

		}
		return ans.get(i);
	}
	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		ArrayList<Integer> ans = insertionInArray(root);
		for(int i = 0;i < ans.size();i++)
			System.out.print(ans.get(i) + " ");
		System.out.println();
		System.out.println("LCA is : " + LCA(ans, 6,8));
	}

}
