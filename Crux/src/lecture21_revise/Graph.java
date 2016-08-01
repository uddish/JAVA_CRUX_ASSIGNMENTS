package lecture21_revise;

import java.util.ArrayList;

public class Graph {

	private String name;
	ArrayList<Vertex> vertices;
	
	public Graph(String name)	{
		this.name = name;
		vertices = new ArrayList<>();
	}
	
	public boolean isEmpty()	{
		return (vertices.size() == 0);
	}
	
	public int numOfVertices()	{
		return vertices.size();
	}
	
	public int numEdgesInGraph()	{
		int count = 0;
		for(Vertex v : vertices)	{
			count += v.numEdgesOfVertex();
		}
		return count/2;
	}

	public Vertex getVertexFromName(String name)	{

		for(Vertex v : vertices)	{
			if(v.name.equals(name))
				return v;
		}
		return null;
	}

	public int getDegree(String name) throws vertexNotFoundExcpetion	{
		Vertex v = getVertexFromName(name);
		if(v == null)	{
			vertexNotFoundExcpetion e = new vertexNotFoundExcpetion();
			throw e;
		}
		return v.numEdgesOfVertex();
	}

	public void addVertex(String name)	{
		Vertex v = getVertexFromName(name);
		if(v != null)	{
			//Throw exception
		}
		Vertex newVertex = new Vertex(name);
		vertices.add(newVertex);
	}

	public void addEdge(String first, String second) throws vertexNotFoundExcpetion	{
		Vertex firstVertex = getVertexFromName(first);
		Vertex secondVertex = getVertexFromName(second);
		if(firstVertex == null && secondVertex == null)	{
			vertexNotFoundExcpetion e = new vertexNotFoundExcpetion();
			throw e;
		}
		if(firstVertex.isAdjacent(secondVertex))	{
			return;
		}
		Edge newEdge = new Edge(firstVertex, secondVertex);
		firstVertex.addEdge(newEdge);			//??????????
		secondVertex.addEdge(newEdge);
	}

	public void removeVertex(String name) throws vertexNotFoundExcpetion	{
		Vertex v = getVertexFromName(name);
		if(v == null)	{
			vertexNotFoundExcpetion e = new vertexNotFoundExcpetion();
			throw e;
		}
		ArrayList<Vertex> adjacent = v.allAdjacentVertices();
		for(Vertex currentVertex : adjacent)	{
			currentVertex.removeEdgeWith(v);
		}
		vertices.remove(v);
	}

	public void removeEdge(String first, String second) throws vertexNotFoundExcpetion	{
		Vertex firstVertex = getVertexFromName(first);
		Vertex secondVertex = getVertexFromName(second);
		if(firstVertex == null && secondVertex == null)	{
			vertexNotFoundExcpetion e = new vertexNotFoundExcpetion();
			throw e;
		}
		firstVertex.removeEdgeWith(secondVertex);
		secondVertex.removeEdgeWith(firstVertex);
	}

	public ArrayList<String> getAdjacentVertices(String name) throws vertexNotFoundExcpetion	{
		Vertex v = getVertexFromName(name);
		if(v == null)	{
			vertexNotFoundExcpetion e = new vertexNotFoundExcpetion();
			throw e;
		}
		ArrayList<Vertex> adjacent = v.allAdjacentVertices();
		ArrayList<String> output = new ArrayList<>();
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
}

