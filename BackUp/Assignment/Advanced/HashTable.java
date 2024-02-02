import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class KeyValuePair<K, V> 
{
    private K key;
    private V value;

    public KeyValuePair(K key, V value) 
    {
        this.key = key;
        this.value = value;
    }

    public K getKey() 
    {
        return key;
    }

    public V getValue() 
    {
        return value;
    }
    public void setValue(V value)
    {
    	  this.value = value;
    }
}

public class HashTable<K, V> 
{
	private ArrayList<LinkedList<KeyValuePair<K, V>>> table;
	private int capacity;
	private int size;

	public HashTable(int initialCapacity) 
	{
		this.capacity = initialCapacity;
		this.size = 0;
		this.table = new ArrayList<>(capacity);
		for (int i = 0; i < capacity; i++) 
		{
			table.add(new LinkedList<>());
		}
	}

	private int hashFunction(K key) 
	{
		return Math.abs(key.hashCode()) % capacity;
	}

	public void put(K key, V value) 
	{
		int index = hashFunction(key);
		LinkedList<KeyValuePair<K, V>> list = table.get(index);

		for (KeyValuePair<K, V> pair : list) 
		{
			if (pair.getKey().equals(key)) 
			{
				pair.setValue(value); // Update the value if the key already exists
				return;
			}
		}

		list.add(new KeyValuePair<>(key, value));
		size++;

		if ((1.0 * size) / capacity > 0.7) 
		{    
			resizeTable();
		}
	}

	public V get(K key) 
	{
		int index = hashFunction(key);
		LinkedList<KeyValuePair<K, V>> list = table.get(index);

		for (KeyValuePair<K, V> pair : list) 
		{
			if (pair.getKey().equals(key)) 
			{
			return pair.getValue();
			}
		}

		return null; // Key not found
	}

	public boolean remove(K key) 
	{
		int index = hashFunction(key);
		LinkedList<KeyValuePair<K, V>> list = table.get(index);

		for (KeyValuePair<K, V> pair : list) 
		{
			if (pair.getKey().equals(key)) 
			{
				list.remove(pair);
				size--;
				return true;
			}
		}
		return false;
	}

	private void resizeTable() 
	{
		ArrayList<LinkedList<KeyValuePair<K, V>>> oldTable = table;
		capacity *= 2;
		size = 0;

		table = new ArrayList<>(capacity);
		for (int i = 0; i < capacity; i++) 
		{
			table.add(new LinkedList<>());
		}

		for (LinkedList<KeyValuePair<K, V>> list : oldTable) 
		{
			for (KeyValuePair<K, V> pair : list) 
			{
				put(pair.getKey(), pair.getValue());
			}
		}
	}

	public void print() 
	{
		for (int i = 0; i < capacity; i++) 
		{
			LinkedList<KeyValuePair<K, V>> list = table.get(i);
			//if (!list.isEmpty()) 
			//{
				System.out.print("Bucket " + i + ": ");
				for (KeyValuePair<K, V> pair : list) 
				{
					System.out.print("(" + pair.getKey() + ", " + pair.getValue() + ") ");
				}
					System.out.println();
			//}
		}
	}

	public boolean search(K key)
	{
		return get(key)!=null ? true : false;
	}

	public static void main(String[] args) 
	{
		HashTable<String, Integer> ht = new HashTable<>(10);
		Scanner in = new Scanner(System.in);
		ht.put("one", 1);
		ht.put("two", 2);
		ht.put("three", 3);
		ht.put("four", 4);
		ht.put("five", 5);
		ht.put("six", 6);
		ht.put("seven", 7);
		ht.put("eight", 8);
		ht.put("nine", 9);
		ht.put("ten", 10);
		
		System.out.println("--------------HashTable-Implementation------------------");
		while(true)
		{
			System.out.println("------------------------------");
			System.out.println("1.Add Element\n2.Delete Element\n3.SearchElement\n4.Print\n5.exit");
			System.out.print("Enter the option to perform :");
			int n = in.nextInt();
			switch(n)
			{
				case 1:
					System.out.println("Enter the key :");
					String s = in.next();
					System.out.println("Enter the value:");
					int t = in.nextInt();
					ht.put(s, t);
					break;
					
				case 2:
					System.out.println("Enter the key to remove:");
					String s1 = in.next();
					if(ht.remove(s1))
						System.out.println("Successfully removed");
					else
						System.out.println("Key does not exit");
					break;
					
				case 3:
					System.out.println("Enter the key to search :");
					String s2 = in.next();
					if(ht.search(s2))
						System.out.println(true);
					else
						System.out.println(false);
					break;
				case 4:
					ht.print();
					break;
				
				case 5:
					System.out.println("Exiting....");
					System.exit(0);
					
				default:
					System.out.println("Enter the correct option to perform");
			}
			
		}
	}
	  
        /*ht.put("one", 1);
        ht.put("two", 2);
        ht.put("three", 3);
        ht.put("four", 4);
        ht.put("five", 5);
        ht.put("six", 6);
        ht.put("seven", 7);
        ht.put("eight", 8);
        ht.put("nine", 9);
        ht.put("ten", 10);

        /*System.out.println("Value for key 'one': " + ht.get("one"));
        System.out.println("Value for key 'two': " + ht.get("two"));
        System.out.println("Value for key 'four': " + ht.get("four"));
        System.out.println("Searching for key 'four': " + ht.search("four"));
        System.out.println("Searching for key 'four': " + ht.search("fou"));


        ht.remove("two");
        System.out.println("Value for key 'two' after removal: " + ht.get("two"));
        ht.put("one", 1);*/
        //ht.print();
}

