public class HashTable<K, V>
{
	public static final int defaultCapacity = 16;
	int capacity;
	Node<K, V>[] table;
	
	public HashTable()
	{
		this(defaultCapacity);
	}
	
	public HashTable(int capacity)
	{
		this.capacity = capacity;
		table = new Node[capacity];
	}
	
	public void put(K key, V value)
	{
		Node<K, V> newNode = new Node<>(key, value);
		int index = hash(key);
		
		if(table[index] == null)
		{
			table[index] = newNode;
		}
		else
		{
			Node<K, V> current = table[index];
			
			while(current.next != null || current.key.equals(key))
			{
				if(current.key.equals(key))
				{
					current.value = value;
					return;
				}
				current = current.next;
			}
			current.next = newNode;
		}
		
		if(size() > capacity*0.75)
		{
			resize();
		}
	}
	
	public V get(K key)
	{
		int index = hash(key);
		
		Node<K, V> current = table[index];
		
		while(current != null)
		{
			if(current.key.equals(key))
			{
				return current.value;
			}
			current = current.next;
		}
		return null;
	}
	
	public void remove(K key)
	{
		int index = hash(key);
		Node<K, V> current = table[index];
		Node<K, V> prev = null;
		
		while(current != null)
		{
			if(current.key.equals(key))
			{
				if(prev == null)
				{
					table[index] = current.next;
				}
				else
				{
					prev.next = current.next;
				}
				return;
			}
			prev = current;
			current = current.next;
		}
	}
	
	public int hash(K key)
	{
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public void resize()
	{
		int newCapacity = 2*capacity;
		Node<K, V>[] newTable = new Node[newCapacity];
		
		for(Node<K, V> node : table)
		{
			while(node != null)
			{
				int newIndex = hash(node.key) % newCapacity;
				Node<K, V> next = node.next;
				node.next = newTable[newIndex];
				newTable[newIndex] = node;
				node = next;
			}
		}
		
		table = newTable;
		capacity = newCapacity;
		
	}
	
	public int size()
	{
		int count = 0;
		for(Node<K, V> node : table)
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
		for(int i=0; i<capacity; i++)
		{
			System.out.print("Bucket "+i+" :");
			Node<K, V> current = table[i];
			while(current != null)
			{
				System.out.print("("+current.key+", "+current.value+")");
				current = current.next;
				if(current != null)
				{
					System.out.print(" -> ");
				}
			}
			System.out.println();
		}
	}
	
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
	public static void main(String []args)
	{
		HashTable<Integer, String> ht = new HashTable<>();
		ht.put(1, "J");
		ht.put(2, "JJ");
		ht.put(3, "JJJ");
		ht.put(4, "JJJJ");
		ht.print();
		ht.put(3,"J");
		ht.print();
		System.out.println(ht.get(4));
		ht.remove(2);
		ht.print();
	}
}
