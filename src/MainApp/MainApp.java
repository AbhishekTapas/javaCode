package MainApp;

import GraphDS.GraphAdjacencyMatrix;

public class MainApp {
	public static void main(String args[]) {
		GraphAdjacencyMatrix<String> mygraph = new GraphAdjacencyMatrix<String>();
		
		mygraph.addVertex("linku");
		mygraph.addVertex("lisa");
		mygraph.addVertex("tapas");
		mygraph.addVertex("china");
		
		mygraph.addEdge(0, 1);
		mygraph.addEdge(1, 2);
		mygraph.addEdge(1, 3);
		mygraph.addEdge(2, 3);
		mygraph.addEdge(3, 0);
		
		System.out.println("Node 1 :" + mygraph.displayNode(0));
		System.out.println("Node 2 :" + mygraph.displayNode(1));
		System.out.println("Node 3 :" + mygraph.displayNode(2));
		System.out.println("Node 4 :" + mygraph.displayNode(3));
		
		System.out.println("Getting Adjsent Nodes...");
		mygraph.displayAdjacentNodes(0);
		mygraph.displayAdjacentNodes(1);
		mygraph.displayAdjacentNodes(2);
		mygraph.displayAdjacentNodes(3);
		
		System.out.println("Displaying Matrix ...");
		mygraph.displayGraphMatrix();
	}
}
