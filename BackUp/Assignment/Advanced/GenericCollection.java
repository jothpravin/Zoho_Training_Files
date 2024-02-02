import java.util.ArrayList;
import java.util.List;

class Custom
{
	private String name;
	
	public Custom(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "CustomObject{name ="+name+"}";
	}
}

public class GenericCollection<T>
{
	private List<T> elements = new ArrayList<>();
	
	public void addElements(T a)
	{
		elements.add(a);
	}
	
	public List<T> getElements()
	{
		return elements;
	}
	
	public boolean searchElement(T a)
	{
		for(T e : elements)
		{
			if(e.equals(a))
				return true;
		}
		return false;	
	}
	
	public void printWildcardElements(List<?> wildcardList) 
	{
		for (Object element : wildcardList) 
		{
			System.out.println(element);
		}
	}

	public void printString(List<? extends String> wildcardList) 
	{
		for (Object element : wildcardList) 
		{
			System.out.println(element);
		}
	}

	public void printNumberElements(List<? extends Number> wildcardList) 
	{
		for (Object element : wildcardList) 
		{
			System.out.println(element);
		}
	}
      

    public static void main(String[] args) 
    {
	  GenericCollection<Object> gc = new GenericCollection<>();
	  
	  gc.addElements("Pravin");
	  gc.addElements('J');
	  gc.addElements(3);
	  gc.addElements(true);
	  gc.addElements(new Custom("Pravin"));
	  List<String> s = new ArrayList<>();
	  s.add("Pravin");
	  s.add("Jai");
	  List<Integer> i = new ArrayList<>();
	  i.add(3);
	  i.add(8);
	  System.out.println("wildcard with Bounded type example - <? extends String>");
	  gc.printString(s);
	  System.out.println("wildcard with Bounded type example - <? extends Number>");
	  gc.printNumberElements(i);
	  System.out.println("unBounded type example");
	  gc.printWildcardElements(gc.getElements());
     }
}
