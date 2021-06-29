package com.ds;


//Undirected graph
public class Graph {
	private int vertices;
	private int[][] adj;
	
	public Graph(int v)
	{
		// Initialize no. of vertices
		vertices = v;
		// Define the size of Adjacency Matrix
		// If 1 then there exists a path, else 0
		adj = new int[vertices][vertices];
	}
	
	public void addEdge(int i,int j)
	{
		adj[i][j]=1;
		adj[j][i]=1;
	}
	public void removeEdge(int i,int j)
	{
		adj[i][j]=0;
		adj[j][i]=0;
	}
	
	public void show()
	{
		int i,j;
		System.out.println("The Graph Matrix is as follows:");
		System.out.print("\t");
		for (i=0;i<vertices;i++)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		for (i=0;i<vertices;i++)
		{
			System.out.print(i+"\t");
			for (j=0;j<vertices;j++)
			{
				System.out.print(adj[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void bft(int startVertex)
	{
		boolean[] visited = new boolean[vertices];
		Queue q = new Queue(10);
		q.enqueue(startVertex);
		visited[startVertex] = true;
		while (!q.isEmpty())
		{
			int v = q.dequeue();
			System.out.println(v);
			for (int i=0;i<vertices;i++)
			{
				if ((adj[v][i]==1) &&  !visited[i])
				{	
					q.enqueue(i);
					visited[i]=true;
				}
			}
		}
	}
	
}