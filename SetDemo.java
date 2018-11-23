import java.util.*;
public class SetDemo 
{
	public static void main(String arg[])
	{
		
		HashSet hs=new HashSet();
		
		hs.add("Tarun");
		hs.add("Vinod");
		hs.add("Pratim");
		hs.add("Shubham");
		hs.add("Vinod");
		
		System.out.println("Hash Set Elements"+hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add("Tarun");
		lhs.add("Vinod");
		lhs.add("Pratim");
		
		System.out.println("Linked HashSet Elements:"+lhs);
		
		TreeSet ts=new TreeSet();
		
		ts.add("Tarun");
		ts.add("Vinod");
		ts.add("Pratim");
		
		System.out.println("Tree Set Elements are :"+ts);
	}
}




