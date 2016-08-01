package lecture21;		

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	private String name;
	private ArrayList<Vertex> vertices;

	public Graph(String name) {
		this.name = name;
		vertices = new ArrayList<Vertex>();
	}

	public boolean isEmpty() {
		return vertices.size() == 0;
	}

	public int numVertices() {
		return vertices.size();
	}

	public int totalNumEdgesInGraph() {
		int count = 0;
		for(Vertex v : vertices) {
			count += v.numEdgesOfVertex();
		}
		return count / 2;
	}

	private Vertex getVertexFromName(String name) {
		for(Vertex v : vertices) {
			if(v.name.equals(name)) {
				return v;
			}
		}
		return null;
	}

	public int getDegree(String name) throws VertexNoFoundException {
		Vertex v = getVertexFromName(name);
		if(v == null) {
			VertexNoFoundException e = new VertexNoFoundException();
			throw e;
		}
		return v.numEdgesOfVertex();
	}

	public void addVertex(String name) {
		Vertex v = getVertexFromName(name);				//calling the function to check if the vertex exists
		if(v != null) {
			//DuplicateVertexFound e = new DuplicateVertexFound();
			//throw e;
		}
		Vertex newVertex = new Vertex(name);
		vertices.add(newVertex);
	}

	public void addEdge(String first, String second) throws VertexNoFoundException {
		Vertex firstVertex = getVertexFromName(first);
		Vertex secondVertex = getVertexFromName(second);
		if(firstVertex == null || secondVertex == null) {
			VertexNoFoundException e = new VertexNoFoundException();
			throw e;
		}
		if(firstVertex.isAdjacent(secondVertex))	{
			return;
		}
		Edge newEdge = new Edge(firstVertex, secondVertex);
		firstVertex.addEdge(newEdge);
		secondVertex.addEdge(newEdge);
	}

	public void removeVertex(String name) throws VertexNoFoundException {				//REMOVE VERTEX
		Vertex v = getVertexFromName(name);
		if(v == null) {
			VertexNoFoundException e = new VertexNoFoundException();
			throw e;
		}
		ArrayList<Vertex> adjacent = v.allAdjacentVertices();			//finding adjacent vertex
		for(Vertex currentVertex : adjacent)	{						//traversing adjacent vertex
			currentVertex.removeEdgeWith(v);							//removing edge from the adjacent vertex
		}
		vertices.remove(v);
	}

	public void removeEdge(String first, String second) throws VertexNoFoundException		{	//REMOVING EDGE
		Vertex firstVertex = getVertexFromName(first);
		Vertex secondVertex = getVertexFromName(second);
		if(firstVertex == null || secondVertex == null) {
			VertexNoFoundException e = new VertexNoFoundException();
			throw e;
		}
		firstVertex.removeEdgeWith(secondVertex);
		secondVertex.removeEdgeWith(firstVertex);
	}

	public boolean isConnected()	{

		return false;
	}

	/*	public boolean hasPath(String first, String second)	{
		Vertex v1 = getVertexFromName(first);
		Vertex v2 = getVertexFromName(second);
		if(v1 == null || v2 == null)	{
			return false;
		}
		ArrayList<Vertex> adjacent = v1.allAdjacentVertices();
		for(Vertex v : adjacent)	{
			if(v.name.equals(second))	{
				return true;
			}
		}
		HashMap<Vertex, Boolean> visited = new HashMap<>();
		visited.put(v1, true);
		for(Vertex v : adjacent)	{
			if(!visited.containsKey(v))	{
				if(hasPathHelper(v,v2,visited))	{
					return true;
				}
			}
		}
		return false;
	}

	private boolean hasPathHelper(Vertex first, Vertex second, HashMap<Vertex, Boolean> visited) {
		visited.put(first, true);
		ArrayList<Vertex> adjacent = first.allAdjacentVertices();
		for(Vertex v : adjacent)	{
			if(v.name.equals(second))	{		//second is string only, that why we don't write "second.name"
				return true;
			}
		}
		return false;
	}
	 */

	public ArrayList<String> getAdjacentVertices(String name) throws VertexNoFoundException	{
		Vertex v = getVertexFromName(name);
		if(v == null) {
			VertexNoFoundException e = new VertexNoFoundException();
			throw e;
		}
		ArrayList<Vertex> adjacent = v.allAdjacentVertices();
		ArrayList<String> output = new ArrayList<>();					//converting to string
		for(Vertex v1 : adjacent)	{
			output.add(v1.name);
		}
		return output;		
	}

	public void printGraph()	{
		System.out.println(name);
		for(Vertex v : vertices)	{
			System.out.print(v.name + " : ");
			v.printAdjacentVertices();
			System.out.println();
		}

	}

	public ArrayList<String> getPath_DFS(String first, String second) {
		Vertex v1 = getVertexFromName(first);
		Vertex v2 = getVertexFromName(second);
		if(v1 == null && v2 == null)	{
			return null;
		}
		HashMap<Vertex, Boolean> visited = new HashMap<>();
		ArrayList<String> a = getPath(v1,v2,visited);
		return a;
	}

	private ArrayList<String> getPath(Vertex v1, Vertex v2, HashMap<Vertex, Boolean> visited)  {

		if(v1.isAdjacent(v2))	{
			ArrayList<String> ans = new ArrayList<>();
			ans.add(v2.name);
			ans.add(v1.name);
			return ans;
		}
		visited.put(v1, true);
		ArrayList<Vertex> adjacent = v1.allAdjacentVertices();
		for(Vertex v : adjacent)	{
			if(!visited.containsKey(v))	{
				ArrayList<String> output = getPath(v, v2, visited);
				if(output != null)	{
					output.add(v1.name);
					return output;
				}
			}
		}
		return null;
	}

}
