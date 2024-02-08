import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class Graph
{
	private int vertices;
	private LinkedList<Integer>[] adj;
	
	@SuppressWarnings("unchecked")
	public Graph(int vertices)
	{
		this.vertices = vertices;
		adj = new LinkedList[vertices];
		for(int i=0; i<vertices; i++)
		{
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdge(int vertex, int edge)
	{
		adj[vertex].add(edge);
	}
	
	public void BFS(int vertex)
	{
		boolean visited[] = new boolean[vertices];
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[vertex] = true;
		queue.offer(vertex);
		
		while(!queue.isEmpty())
		{
			int n = queue.poll();
			System.out.print(n+" ");
			
			Iterator<Integer> iterator = adj[n].listIterator();
			
			while(iterator.hasNext())
			{
				int m = iterator.next();
				if(!visited[m])
				{
					visited[m] = true;
					queue.offer(m);
				}
			}
		}
	}
	
	private void DFShelper(int vertex, boolean[] visited)
	{
		visited[vertex] = true;
		
		System.out.print(vertex+" ");
		
		Iterator<Integer> iterator = adj[vertex].listIterator();
		while(iterator.hasNext())
		{
			int n = iterator.next();
			if(!visited[n])
			{
				DFShelper(n, visited);
			}
		}
	}
	
	public void DFS(int vertex)
	{
		boolean visited[] = new boolean[vertices];
		DFShelper(vertex, visited);
	}
	
	public static void main(String []args)
	{
		Graph g = new Graph(5);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		g.addEdge(3, 1);
		g.addEdge(4, 2);
		g.addEdge(1, 4);
		g.addEdge(4, 3);
		
		
		System.out.println("BFS ->");
		g.BFS(0);
		System.out.println("DFS ->");
		g.DFS(0);
	}
}
