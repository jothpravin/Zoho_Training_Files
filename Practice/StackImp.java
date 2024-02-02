public class StackImp
{
	int arr[];
	int top = -1;
	static int defaultSize = 10;
	int size;
	public StackImp()
	{
		this(defaultSize);
	}
	
	public StackImp(int size)
	{
		this.size = size;
		arr = new int[size];
	}
	
	public boolean isFull()
	{
		return top == size-1;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public void push(int a)
	{
		if(!isFull())
		{
			top++;
			arr[top] = a;
			return;
		}
		
		if((top+1) > arr.length * 0.75)
		{
			resize();
		}
	}
	
	public int pop()
	{
		
		if(!isEmpty())
		{
			int temp = arr[top];
			arr[top--] = 0;
			return temp;
		}
		return -1;
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			return arr[top];
		}
		return -1;
	}
	
	public void resize()
	{
		int newSize = size*2;
		int []newArr = new int[newSize];
		
		for(int i=0; i<size; i++)
		{
			newArr[i] = arr[i];
		}
		
		arr = newArr;
		size = newSize;
		
	}
	
	public void print()
	{
		for(int i=0; i<size; i++)
		{
			if(arr[i]!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String []args)
	{
		StackImp s = new StackImp();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(20);
		s.push(40);
		s.push(10);
		s.push(20);
		s.push(40);
		s.push(10);
		s.push(40);
		s.push(10);
		s.push(40);	
		s.push(10);
		s.push(20);
		System.out.println("Poped element :"+s.pop());
		System.out.println("Peeked element :"+s.peek());
		s.print();
		System.out.println(s.size);
		
	}
}
