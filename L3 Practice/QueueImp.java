import java.util.Arrays;

public class QueueImp<T>
{
	int size;
	T[] arr;
	int last=0;
	
	@SuppressWarnings("unchecked")
	public QueueImp(int size)
	{
		this.size = size;
		arr = (T[])new Object[size];
	}
	
	public boolean isFull()
	{
		return last == size-1;
	}
	
	public boolean isEmpty()
	{
		return last == 0;
	}
	
	public void offer(T a)
	{
		if(!isFull())
		{
			arr[last++] = a;
		}
		
		if(last > size*0.75)
		{
			resize();
		}
	}
	
	public T poll()
	{
		if(!isEmpty())
		{
			T bk = arr[0];
			last--;
			for(int i=0; i<size-1; i++)
			{
				arr[i] = arr[i+1];
			}
			return bk;
		}
		return null;
	}
	
	public T peek()
	{
		if(!isEmpty())
		{
			return arr[0];
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public void resize()
	{
		int newSize = 2* size;
		T[] newArr = (T[])new Object[newSize];
		
		for(int i=0; i<last; i++)
		{
			newArr[i] = arr[i];
		}
		
		arr = newArr;
		size = newSize;
		
	}
	
	public void print()
	{
		System.out.print("[");
		for(int i=0; i<last; i++)
		{
			System.out.print(arr[i]);
			if(i!=last-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String []args)
	{
		QueueImp<String> q = new QueueImp<>(10);
		q.offer("👿️");
		q.offer("💘️");
		q.offer("😉️");
		q.offer("😀️");
		q.offer("👿️");
		q.offer("💘️");
		q.offer("😀️");
		q.print();
		System.out.println(q.poll());
		System.out.println(q.size);
		q.print();
		
		QueueImp<Integer> q1 = new QueueImp<>(10);
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		q1.print();
	}
}
