package TopologicalSorting;

import java.util.ArrayList;

public class Vertex {
	private String data;
	private boolean visited;
	private ArrayList<Vertex> neighbourList;

	public Vertex(String data) {
		this.data = data;
		neighbourList = new ArrayList<>();
	}

	public void addNeighbour(Vertex vertex) {
		this.neighbourList.add(vertex);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public ArrayList<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(ArrayList<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}
	
}
