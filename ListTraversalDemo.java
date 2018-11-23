import java.util.*;
public class ListTraversalDemo 
{
	public static void main(String arg[])
	{
		
		ArrayList list=new ArrayList();
		
		list.add("Vinod"); //Upcasting
		list.add("Rohit");
		list.add("Nitin");
		
		list.add(100);
		list.add(200);
		
        // Enhanced for loop Traversal.....
		
		
		/*for(Object element:list)
		{
			if(element instanceof String)
			{
				String str=(String)element;//Down casting
				System.out.println(str);
			}
			else
			{
				Integer intr=(Integer)element;//DownCasting
				System.out.println(intr);
			}
		}*/
		
		
        // Traversal Using Iterator Interface.........
		
		
		/*Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			Object element=itr.next();
			
			if(element instanceof String)
			{
				String str=(String)element;//Down casting
				System.out.println(str);
				
				if(str.equals("Rohit"))
					itr.remove();//list2.add(str);
			}
			else
			{
				Integer intr=(Integer)element;//DownCasting
				System.out.println(intr);
			}
			
		}

		
		System.out.println("After the Iterator:"+list)*/

		
		// Traversal using ListIterator Interface........
		ListIterator itr=list.listIterator();
		
		while(itr.hasNext())
		{
			Object element=itr.next();
			
			if(element instanceof String)
			{
				String str=(String)element;//Down casting
				System.out.println(str);
				
				if(str.equals("Rohit"))
					itr.set("Wasim");//itr.remove();//list2.add(str);
			}
			else
			{
				Integer intr=(Integer)element;//DownCasting
				System.out.println(intr);
			}
			
		}

		
		System.out.println("After the Iterator:"+list);
	}
}