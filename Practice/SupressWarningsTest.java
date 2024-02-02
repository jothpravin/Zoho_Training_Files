import java.util.ArrayList;
public class SupressWarningsTest  
{
@SuppressWarnings({ "unchecked", "rawtypes" })	
public static void main(String[] args) {
ArrayList arList = new ArrayList();
  arList.add("Orange");
  arList.add("Pink");
  arList.add("Red");
  arList.add("Green");
  arList.add("Blue");
 
 for(Object obj : arList) {
	System.out.println(obj); 
   }
 }
}
