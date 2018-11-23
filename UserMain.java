import java.util.*;

public class UserMain 
{
	public static void main(String arg[])
	{
		ArrayList<User> list =  new ArrayList<User>();
		
		User u1 = new User(1001,"Shubham","Delhi",84390677);
		User u2 = new User(1002,"Irfan","Kaushambi",99117723);
		User u3 = new User(1003,"Shivam","Banaras",80774452);
		User u4 = new User(1000,"Akshay","Renukoot",76185517);
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		
		Collections.sort(list , new MobileSort());
		Collections.sort(list,  new SortId());
		Collections.sort(list , new AddressSort());
		Collections.sort(list,  new Namesort());
		
		for(User in : list)
		{
			System.out.println(in);
		}
		
	}

}
