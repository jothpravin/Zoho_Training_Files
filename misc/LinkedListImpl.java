public class LinkedListImpl
{
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	Node tail = null;
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
			tail = newNode;
		}
	}
	
	public void delete(int data)
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		
		if(head.data == data)	
		{
			head = head.next;
		}
		
		Node current = head;
		
		while(current.next != null && current.next.data != data)
		{
			current = current.next;
		}
		
		if(current.next != null)
		{
			current.next = current.next.next;
		}
		
		if(current.next == null)
		{
			tail = current;
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
	
	public void reverse()
	{
		Node current = head;
		Node prev = null;
		Node next;
		
		while (current != null) 
		{
		  next = current.next;
		  current.next = prev;
		  prev = current;
		  current = next;
   		}
   		head = prev;
	}
	
	public void rotate(int k)
	{
		Node current = head;
		int len = 0;
		while(current != null)
		{
			len++;
			current = current.next;
		}
		k =  k % len;
		if(k == 0)
		{
			return;
		}
		int ind = 0;
		Node temp = head;
		while(ind < len - k - 1)
		{
			temp = temp.next;
			ind++;
		}
		tail.next = head;
		head = temp.next;
		tail = temp;
		tail.next = null; 
		
	}
	
	public static void main(String []args)
	{
		LinkedListImpl ll = new LinkedListImpl();
		ll.add(10);
		ll.add(20); 
		ll.add(30); 
		ll.add(40);
		ll.add(50);
		ll.print(); 
		//ll.reverse();
		//ll.print();
		ll.rotate(9);
		System.out.println("Rotate");
		ll.print();
	}
}
