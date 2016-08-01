package java_assignment12;

//import java_assignment11.Node;

public class Node<T> {

	public T data;
	public Node<T> next;

	public Node(T data) {						//Constructor
		this.data = data;
	}
}