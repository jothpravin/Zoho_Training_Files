import java.util.ArrayList;
import java.util.Scanner;

public class StackImp<T>
{
	ArrayList<T> s = new ArrayList<>();
	public void push(T a)
	{
		s.add(a);
	}
	public T peek()
	{
		if(!s.isEmpty())
			return s.get(s.size()-1);
		
		return null;
	}
	public T pop()
	{
		if(!s.isEmpty())
		{
			T temp = s.get(s.size()-1);
			s.remove(s.size()-1);
			return temp;
		}
		return null;	
	}
	public void display()
	{
		System.out.println(s);
	}
	public static void main(String []args)
	{
		StackImp<String> st = new StackImp<>();
		Scanner in = new Scanner(System.in);
		st.push("Pravin");
		st.push("Jain");
		st.push("Jaya");
		st.push("Banu");
		System.out.println("--------------Stack-Implementation------------------");
		while(true)
		{
			System.out.println("------------------------------");
			System.out.println("1.Push Element\n2.Pop Element\n3.Peek Element\n4.Print\n5.exit");
			System.out.print("Enter the option to perform :");
			int n = in.nextInt();
			switch(n)
			{
				case 1:
					System.out.print("Enter the value:");
					String t = in.next();
					st.push(t);
					break;
					
				case 2:
					System.out.println("The poped element is :"+st.pop());
					break;
					
				case 3:
					System.out.println("The peek element is :"+st.peek());
					break;
				case 4:
					st.display();
					break;
				
				case 5:
					System.out.println("Exiting....");
					System.exit(0);
					
				default:
					System.out.println("------------------------------");
					System.out.println("Enter the correct option to perform");
				
			}
			
		}
		/*st.push("Pravin");
		st.push("Jain");
		st.push("Jaya");
		st.push("Banu");
		st.display();
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.display();*/
	}
}
