package lecture21_revise;

import java.util.ArrayList;

public class Vertex {

	ArrayList<Edge> edgeList;
	String name;

	public Vertex(String name) {
		this.name = name;
		edgeList = new ArrayList<Edge>();
	}

	public int numEdgesOfVertex() {
		return edgeList.size();
	}

	public void addEdge(Edge newEdge) {				//??????????
		edgeList.add(newEdge);
	}

	public boolean isAdjacent(Vertex secondVertex) {
		for(Edge e : edgeList)	{
			if(e.first.name.equals(secondVertex.name))	{
				return true;
			}
		}
		return false;
	}

	public void removeEdgeWith(Vertex v) {
		for(Edge e : edgeList)	{
			if(e.first.equals(v) || e.first.equals(v))
				edgeList.remove(e);
			return;
		}
	}

	public ArrayList<Vertex> allAdjacentVertices() {
		ArrayList<Vertex> output = new ArrayList<>();
		for(Edge e : edgeList)	{
			if(e.first.name.equals(this.name))	{
				output.add(e.second);
			}
			else if(e.second.name.equals(this.name))	{
				output.add(e.first);
		}
	}
	return output;
}

	public void printAdjacentVertices() {
		ArrayList<Vertex> adjacent = this.allAdjacentVertices();
		for(Vertex v : adjacent)	{
			System.out.print(v.name + ",");
		}
	}

}
