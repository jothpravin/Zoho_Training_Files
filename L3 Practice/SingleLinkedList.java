public class SingleLinkedList<T>
{
	@SuppressWarnings("unchecked")
	class Node<T>
	{
		T data;
		Node<T> next;
		
		Node(T data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head = null;
	private Node tail = null;
	
	@SuppressWarnings("unchecked")
	public void add(T data)
	{
		Node<T> newNode = new Node(data);
		
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
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	@SuppressWarnings("unchecked")
	public void delete(T data)
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			return;
		}
		
		if(head.data == data)
		{
			head = head.next;
			return;
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
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("LinkedList is empty");
			return;
		}
		
		Node current = head;
		
		System.out.println("LinkedList elements are");
		while(current != null)
		{
			System.out.print(current.data+"->");
			
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public void print()
	{
		System.out.print("[");
		Node current = head;
		
		while(current != null)
		{
			System.out.print(current.data);
			if(current.next!=null)
			{
				System.out.print(", ");
			}
			current = current.next;
		}
		System.out.println("]");
		
	}
	
	public static void main(String []args)
	{
		SingleLinkedList<Integer> sl = new SingleLinkedList<Integer>();
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		sl.delete(2);
		
		sl.display();
		
		
		SingleLinkedList<String> sll = new SingleLinkedList<String>();
		sll.add("J");
		sll.add("JJ");
		sll.add("JJJ");
		
		sll.display();
		
		sll.delete("JJJ");
		sll.display();
		sl.print();
		sll.print();
		
	}
}
