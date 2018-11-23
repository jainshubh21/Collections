import java.util.*;

public class Namesort implements Comparator<User>
{
	@Override
	public int compare(User u1 , User u2)
	{
		return u1.UName.compareTo(u2.UName);
	}

}
