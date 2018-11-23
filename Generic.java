import java.util.*;

public class Generic 
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shubham");
		list.add("Irfan");
		list.add("Shivam");
		
		//Integer intr = (Integer)list.get(1);   // Creates compile time error as list is string type
		
		//list.add(788); // Creates compile time error as list is string type
		
		System.out.println("List is:" + list );
		
	}

}
