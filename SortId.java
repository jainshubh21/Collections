import java.util.Comparator;

public class SortId implements Comparator<User> 
{
	@Override
	public int compare(User u1 , User u2)
	{
		if(u1.uid>u2.uid)
			return 1;
		else if(u1.uid<u2.uid)
			return -1;
		else
			return 0;
	} 
}
