import java.util.*;
public class ArrayListDemo 
{
	public static void main(String arg[])
	{		
		ArrayList list=new ArrayList();
		
		list.add("Vinod");
		list.add("Rohit");
		list.add("Nitin");
		
		list.add(100);
		list.add(200);
		
		System.out.println("The Size of Collection:"+list.size());
		
		System.out.println("Total Collection:"+list);
		
		list.remove(1); //Removing the element of 1 index
		
		System.out.println("After Removing:"+list);
		
		list.add(3,"Tarun");
		
		System.out.println("Adding an Element 3 index:"+list);
		
		ArrayList list2=new ArrayList();
		
		//Adding an collection to another collection
		list2.addAll(list);
		
		System.out.println("Array List 2 Objects:"+list2);
		
		//Searching a Particular element
		if(list.contains(100))
			System.out.println("100 Element is there");
		else
			System.out.println("100 element is Not there");
		
	}
}