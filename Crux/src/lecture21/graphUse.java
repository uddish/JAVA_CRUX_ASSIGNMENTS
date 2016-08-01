package lecture21;

public class graphUse {

	public static void main(String[] args) throws VertexNoFoundException {
		String road = "road";
		Graph g = new Graph(road);
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addEdge("A", "B");
		g.addEdge("A", "C");
		g.printGraph();

	}

}
