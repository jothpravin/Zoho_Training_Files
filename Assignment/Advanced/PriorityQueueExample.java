import java.util.Comparator;
import java.util.PriorityQueue;

class Task
{
	private String name;
	private int priority;

	public Task(String name, int priority)
	{
		this.name = name;
		this.priority = priority;
	}

	public String getName()
	{
		return name;
	}

	public int getPriority()
	{
		return priority;
	}
}


class TaskComparator implements Comparator<Task>
{
	public int compare(Task t1, Task t2)
	{
		return Integer.compare(t1.getPriority(), t2.getPriority());
	}
}

public class PriorityQueueExample
{
	public static void main(String []args)
	{
		PriorityQueue<Task> pq = new PriorityQueue<>(new TaskComparator());
	
		pq.add(new Task("Pravin", 3));
		pq.add(new Task("Jain", 1));
		pq.add(new Task("Jaya", 2));

		System.out.println("The Top priority is "+pq.peek().getName());
	}
}
