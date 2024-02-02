import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class Graph
{
	private Map<Integer, List<Integer>> adjacentList;
	
	public Graph()
	{
		adjacentList = new HashMap<>();
	}
	
	public void addVertex(int vertex)
	{
		if(!adjacentList.containsKey(vertex))
		{
			adjacentList.put(vertex , new ArrayList<>());
		}
	}
	
	public void removeVertex(int vertex)
	{
		if(adjacentList.containsKey(vertex))
		{
			adjacentList.remove(vertex);
		}
		
		for(int v: adjacentList.keySet())
		{
			adjacentList.get(v).removeIf(neighbour -> neighbour==vertex);
		}
	}
	
	public void addEdge(int source, int destination)
	{
		if(adjacentList.containsKey(source) && adjacentList.containsKey(destination))
		{
			adjacentList.get(source).add(destination);
			adjacentList.get(destination).add(source);
		}
	}
	
	public void removeEdge(int source, int destination)
	{
	    if(adjacentList.containsKey(source) && adjacentList.containsKey(destination))
	    {
		  List<Integer> sourceNeighbors = adjacentList.get(source);
		  List<Integer> destinationNeighbors = adjacentList.get(destination);

		  sourceNeighbors.remove(Integer.valueOf(destination));
		  destinationNeighbors.remove(Integer.valueOf(source));

		  if(sourceNeighbors.isEmpty())
		  {
		      adjacentList.remove(source);
		  }

		  if(destinationNeighbors.isEmpty())
		  {
		      adjacentList.remove(destination);
		  }
	    }
	}


	
	public void bfs(int vertex)
	{
	    int maxVertex = Collections.max(adjacentList.keySet());
	    boolean [] visited = new boolean[maxVertex + 1]; 
	    
	    Queue<Integer> q = new LinkedList<>();
	    q.offer(vertex);
	    visited[vertex] = true;

	    while(!q.isEmpty())
	    {
		  int v = q.poll();
		  System.out.print(v+" ");

		  List<Integer> neigh = adjacentList.get(v);
		  for(int n : neigh)
		  {
		      if(visited[n] == false)
		      {
		          q.offer(n);
		          visited[n] = true;
		      }
		  }
	    }
	    System.out.println();
	}
	
	public void print()
	{
	    for (int vertex : adjacentList.keySet())
	    {
		  System.out.print("Vertex " + vertex + " is connected to: ");
		  List<Integer> neighbors = adjacentList.get(vertex);

		  for (int neighbor : neighbors)
		  {
		      System.out.print(neighbor + " ");
		  }

		  System.out.println();
	    }
	}
	
	public Map<Integer, List<Integer>> getAdjacentList()
	{
		return adjacentList;
	}


	
	public static void main(String []args)
	{
		Graph graph = new Graph();
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
            graph.addVertex(3);
		graph.addVertex(4);
		graph.addVertex(5);
		graph.addVertex(6);

		graph.addEdge(0, 1);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 6);
		Scanner in = new Scanner(System.in);
		System.out.println("--------------Graph-Implementation------------------");
		while(true)
		{
			System.out.println("------------------------------");
			System.out.println("1.Add Vertex\n2.Delete Vertex\n3.Add Edge\n4.Remove Edge\n5.Traverse(bfs)\n6.Print\n7.Exit");
			System.out.print("Enter the option to perform :");
			int n = in.nextInt();
			switch(n)
			{
				case 1:
					System.out.print("Enter the Vertex :");
					int t = in.nextInt();
					graph.addVertex(t);
					break;
					
				case 2:
					System.out.print("Enter the Vertex to remove:");
					int t1 = in.nextInt();
					graph.removeVertex(t1);
					System.out.println("Successfully removed");
					break;
					
				case 3:
					System.out.print("Enter the egde to connect E1, E2:");
					int e1 = in.nextInt();
					int e2 = in.nextInt();
					graph.addEdge(e1, e2);
					break;
				case 4:
					System.out.print("Enter the egde to remove E1, E2:");
					int e3 = in.nextInt();
					int e4 = in.nextInt();
					graph.removeEdge(e3, e4);
					break;
				
				case 5:
					System.out.println("----Enter the start index from below this range----");
					for(int a : graph.getAdjacentList().keySet())
					{
						System.out.print(a+" ");
					}
					System.out.println();
					System.out.print("Enter the Vertex to start the BFS traversal :");
					int bf = in.nextInt();
					graph.bfs(bf);
					break;
					
				case 6:
					System.out.println("---------Printing the graph-------");	
					graph.print();
					break;
									
				case 7:
					System.out.println("Exiting....");
					System.exit(0);
					
				default:
					System.out.println("Enter the correct option to perform");
			}
			
		}
		/*graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
            graph.addVertex(3);
		graph.addVertex(4);
		graph.addVertex(5);
		graph.addVertex(6);

		graph.addEdge(0, 1);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 6);

		graph.removeEdge(2, 3);	
    		graph.print();
		graph.removeVertex(2);
		
		System.out.println("Breadth-First Search starting from vertex 1:");
		graph.bfs(1);
		System.out.println();
		System.out.println("Breadth-First Search starting from vertex 4:");
		graph.bfs(4);
		System.out.println("Graph representation:");
    		graph.print();*/
		
	}
}
