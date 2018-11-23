import java.util.*;
public class NonGeneric 
{
	public static void main(String arg[])
	{
	ArrayList list = new ArrayList();
	list.add("Shubham");
	list.add("Irfan");
	list.add("Shivam");
	System.out.println("List is :" +list);
	
	Integer intr = (Integer)list.get(1);
	
	System.out.println("Item at index 1 is :" +intr);
	
	}
	

}
