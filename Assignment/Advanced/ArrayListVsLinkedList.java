import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList 
{
    public static void main(String[] args) 
    {
        int dataSize = 10000; // Size of the data set

        // Create an ArrayList and a LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Adding elements to ArrayList and LinkedList
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) 
	  {
            arrayList.add(i);
        }
        long arrayListAddTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) 
	  {
            linkedList.add(i);
        }
        long linkedListAddTime = System.currentTimeMillis() - startTime;

        System.out.println("Adding " + dataSize + " elements:");
        System.out.println("ArrayList time: " + arrayListAddTime + "ms");
        System.out.println("LinkedList time: " + linkedListAddTime + "ms");

        // Accessing elements in ArrayList and LinkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) 
	  {
            arrayList.get(i);
        }
        long arrayListAccessTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < dataSize; i++) 
	  {
            linkedList.get(i);
        }
        long linkedListAccessTime = System.currentTimeMillis() - startTime;

        System.out.println("\nAccessing " + dataSize + " elements:");
        System.out.println("ArrayList time: " + arrayListAccessTime + "ms");
        System.out.println("LinkedList time: " + linkedListAccessTime + "ms");

        // Removing elements from ArrayList and LinkedList
        startTime = System.currentTimeMillis();
        for (int i = dataSize - 1; i >= 0; i--) 
	  {
            arrayList.remove(i);
        }
        long arrayListRemoveTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = dataSize - 1; i >= 0; i--) 
	  {
            linkedList.remove(i);
        }
        long linkedListRemoveTime = System.currentTimeMillis() - startTime;

        System.out.println("\nRemoving " + dataSize + " elements:");
        System.out.println("ArrayList time: " + arrayListRemoveTime + "ms");
        System.out.println("LinkedList time: " + linkedListRemoveTime + "ms");
    }
}

