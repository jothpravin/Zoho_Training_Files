public class DoubleLinkedList
{
	public class Node
	{
		int data;
		Node back;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.back = null;
			this.next = null;
		}
	}
	Node head, tail = null;
	public void add(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.back = tail;
			tail = newNode;
		}
	}
	
	public void print()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	public void printReverse()
	{
		Node current = tail;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.back;
		}
		System.out.println();
	}
	
	public static void main(String []args)
	{
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.add(50);
		dll.print();
		System.out.println("Reverse printing in double linked list");
		dll.printReverse();
		
	}
}
