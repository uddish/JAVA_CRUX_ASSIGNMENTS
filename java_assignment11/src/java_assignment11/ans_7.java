package java_assignment11;

public class ans_7 {			//order traversal

	public static void orderTraversal(BTNode<Integer> root)	{

		queue_LinkList<BTNode<Integer>> queue = new queue_LinkList<BTNode<Integer>>();
		queue.enqueue(root);
		queue.enqueue(null);
		while(!queue.isEmpty())	{
			BTNode<Integer> child = queue.dequeue();
			if(child == null)	{
				if(!queue.isEmpty())	{	//infinite loop because null will be enqueued every time
					queue.enqueue(child);
					System.out.println();
				}
			}
			else	{
				System.out.print(child.data);
				if(child.left != null)	{
					queue.enqueue(child.left);
				}
				if(child.right != null)	{
					queue.enqueue(child.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		orderTraversal(root);
	}

}
