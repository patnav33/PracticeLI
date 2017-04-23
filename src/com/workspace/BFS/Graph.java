package com.workspace.BFS;

public class Graph {

	private final int MAX_VERTEX = 5;
	private Vertex vertexList[]; // list of vertices
	private int adjMat[][]; // adjacency matrix
	private int nVerts; // current number of vertices
	private Queue theQueue;

	public Graph() {

		vertexList = new Vertex[MAX_VERTEX];
		adjMat = new int[5][5];
		nVerts = 0;
		for (int i = 0; i < MAX_VERTEX; i++)
			for (int j = 0; j < MAX_VERTEX; j++)
				adjMat[i][j] = 0;
		theQueue = new Queue();
	}

	public void addVertex(char lab) {
		vertexList[nVerts++] = new Vertex(lab);
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	public void display(int j) {
		System.out.println(vertexList[j].label);
	}

	public int getAdjUnvisitedVertex(int v) {

		for (int j = 0; j < nVerts; j++) {
			if (adjMat[v][j] == 1 && vertexList[j].wasVisited==false)
				return j;
		}

		return -1;
	}

	public void bfs() {

		vertexList[0].wasVisited = true;
		display(0);
		theQueue.insert(0);	
		int v2;
		
		while (!theQueue.isEmpty()) {
			int v1 = theQueue.remove();
			while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {	
				vertexList[v2].wasVisited = true;
				display(v2);
				theQueue.insert(v2);
			}
		}

		for (int j = 0; j < nVerts; j++) {
			vertexList[j].wasVisited = false;
		}

	}
}