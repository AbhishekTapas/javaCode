package GraphDS;

import java.util.HashMap;
import java.util.Map;

public class GraphAdjacencyMatrix<T> {
	
	public static final int MAX_SIZE = 5;
	
	Map<Integer, T> vertex;
	int countVertex;
	int graphMat[][] = new int[MAX_SIZE][MAX_SIZE];
	
	public GraphAdjacencyMatrix() {
		vertex = new HashMap<>();
		
		this.countVertex = 0;
		
		for(int i=0;i<MAX_SIZE;i++)
			for(int j=0;j<MAX_SIZE;j++)
				graphMat[i][j] = 0;
	}
	
	public boolean addVertex(T data) {
		if(!isFull(this.countVertex))
			this.vertex.put(this.countVertex, data);
		else
			return false;
		this.countVertex++;
		return true;
	}
	
	public void addEdge(int start, int end) {
		if(this.countVertex >= 2 && (isExist(start) && isExist(end))) {
			graphMat[start][end] = 1;
		}
	}
	
	public void displayGraphMatrix() {
		for(int i=0;i<this.countVertex;i++) {
			for(int j=0;j<this.countVertex;j++)
				System.out.print(graphMat[i][j] + " ");
			System.out.println("");
		}
	}
	
	public void displayAdjacentNodes(int node) {
		System.out.println("Adjacent Nodes of " + node);
		//System.out.print(vertex.get(node) + " -> ");
		for(int i=0;i<this.countVertex;i++) {
			if(graphMat[node][i] == 1)
				System.out.print(vertex.get(i) + " -> ");
			if(graphMat[i][node] == 1)
				System.out.print(vertex.get(i) + " -> ");
		}
		System.out.println("NULL");
	}
	
	public T displayNode(int node) {
		return vertex.get(node);
	}
	
	public boolean isExist(int x) {
		return x<=this.countVertex ;
	}
	
	public boolean isFull(int x) {
		return x>=MAX_SIZE;
	}
}
