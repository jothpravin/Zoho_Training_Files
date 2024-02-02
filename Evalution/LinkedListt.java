class Node
{
	int data;
	Node address;
	
	public Node(int data, Node address)
	{
		this.data = data;
		this.address = address;
	}
}
class LinkedListt
{	
	int size;
	Node head;
	Node tail;
	LinkedListt(int size)
	{
		this.size = size;
	}
	
	Node[] nodes = new Node[size];	
	
	public void add(int a)
	{
		if(nodes==null)
		{
			nodes[0] = new Node(a, null);
			head = nodes[0];
		}
		else
		{
			for(int i=1; i<size; i++)
			{
				if(nodes[i]==null)
				{
					nodes[i] = new Node(a, nodes[i-1]);
					tail = nodes[i];
				}
			}
		}
	}
	
	public void print()
	{
		for(Node node: nodes)
		{
			System.out.print(node.data+" ");
		}
	}
	
	public static void main(String []args)
	{
		LinkedListt lt = new LinkedListt(10);
		lt.add(10);
		lt.add(20);
		
		lt.print();
	}
	
}
