package java_assignment11;

public class ans_8 {

	public static void ZigZag(BTNode<Integer> root)	{

		/*queue_LinkList<BTNode<Integer>> queue = new queue_LinkList<BTNode<Integer>>();
		queue.enqueue(root);
		queue.enqueue(null);
		int count = 1;
		while(!queue.isEmpty())	{
			BTNode<Integer> child = queue.dequeue();

			if(child == null)	{
				if(!queue.isEmpty())	{	//infinite loop because null will be enqueued every time
					queue.enqueue(child);
					System.out.println();
					count++;
				}
			}
			else	{
				System.out.print(child.data);
				if(count % 2 == 0)	{
					if(child.right != null)	{
						queue.enqueue(child.right);
					}
					if(child.left != null)	{
						queue.enqueue(child.left);
					}

				}
				else	{
					if(child.left != null)	{
						queue.enqueue(child.left);
					}
					if(child.right != null)	{
						queue.enqueue(child.right);
					}
				}
			}

		}	*/

		stack<BTNode<Integer>> stack1 = new stack<BTNode<Integer>>();
		stack<BTNode<Integer>> stack2 = new stack<BTNode<Integer>>();
		stack<BTNode<Integer>> temp = null;
		stack1.push(root);
		System.out.println(root.data);
		int count = 1;
		while(!stack1.isEmpty())	{
			while(stack1.size != 0)	{
				BTNode<Integer> s1 = stack1.pop();
				if(count %2 != 0)	{
					if(s1.left != null)	{
						stack2.push(s1.left);
						System.out.print(s1.left.data);
					}
					if(s1.right != null)	{
						stack2.push(s1.right);
						System.out.print(s1.right.data);
					}
				}
				else	{
					if(s1.right != null)	{
						stack2.push(s1.right);
						System.out.print(s1.right.data);
					}
					if(s1.left != null)	{
						stack2.push(s1.left);
						System.out.print(s1.left.data);
					}
				}
			}
			System.out.println();
			count++;
			temp = stack2;
			stack2 = stack1;
			stack1 = temp;
		}

	}

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1 
		BTNode<Integer> root = BinaryTreeUse.takeInput();
		ZigZag(root);
	}

}
