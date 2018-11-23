import java.util.*;

public class SortEmployee
{
	public static void main(String arg[])
	{
    ArrayList<Employee> list = new ArrayList<Employee>();
	
	list.add(new Employee(1001,"Shubham",70000));
	list.add(new Employee(1002,"Shivam",60000));
	list.add(new Employee(1003,"Irfan",80000));
	list.add(new Employee(1001,"Akshay",40000));
	Collections.sort(list);
	
	 for(Employee E : list)
	 {
		System.out.println(E);
	 }

	}
}
