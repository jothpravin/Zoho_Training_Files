public class HashTableImpl<K, V>
{
	class Node<K, V>
	{
		private K key;
		private V value;
		private Node next;
		
		public Node(K key, V value)
		{
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	private static final int defaultCapacity = 16;
	private int capacity;
	Node[] hashTable;
	
	public HashTableImpl()
	{
		this(defaultCapacity);
	}
	public HashTableImpl(int capacity)
	{
		this.capacity = capacity;
		this.hashTable = new Node[capacity];
	}
	
	public int hash(K key)
	{
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public void put(K key, V value)
	{
		int index = hash(key);
		Node newNode = new Node(key, value);
		if(hashTable[index] == null)
		{
			hashTable[index] = newNode;
		}
		else
		{
			Node current = hashTable[index];
			while(current.next != null || current.key == key)
			{
				if(current.key == key)
				{
					current.value = value;
					return;
				}
				current = current.next;
			}
		}
		if(size() > capacity*0.75)
		{
			//resize();
		}
	}
	
	public int size()
	{
		int count = 0;
		for(Node node : hashTable)
		{
			while(node != null)
			{
				count++;
				node = node.next;
			}
		}
		return count;
	}
	
	public void print()
	{
		for(Node node : hashTable)
		{
			Node current = node;
			while(current != null)
			{
				System.out.println("Key :"+current.key+" Value :"+current.value);
				current = current.next;
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		HashTableImpl<Integer, String> ht = new HashTableImpl<Integer, String>();
		ht.put(1, "jothipravin");
		ht.put(12, "surya");
		ht.put(3, "muthu");
		ht.put(4, "harish");
		ht.print();
		HashTableImpl<String, String> ht1 = new HashTableImpl<>();
		ht1.put("jm", "Jothi");
		ht1.put("Surya", "Mk");
		ht1.put("lp", "Harish");
		ht1.print();
	}
}
