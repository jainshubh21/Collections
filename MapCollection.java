import java.util.*;

public class MapCollection 
{ 
   public static void main(String args[])
   {
	   HashMap<Integer,String> map = new HashMap<Integer,String>();
	   map.put(1000,"Shubham,Delhi,50000");
	   map.put(1001,"Irfan,Kaushambi,60000");
	   map.put(1002,"Shivam,Banaras,70000");
	   
	   Set<Integer> keys = map.keySet();
	   
	   for(int key : keys)
	   {
		   String Record = map.get(key);
		   String RDetail[] = Record.split(",");
		   System.out.println("Student Name:"+RDetail[0]);
		   System.out.println("Student City:"+RDetail[1]);
		   System.out.println("Student Fees:"+RDetail[2]);
	   }
   }
 
}
