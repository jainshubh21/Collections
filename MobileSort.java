import java.util.*;

public class MobileSort implements Comparator<User>
{
	@Override
	public int compare(User u1 , User u2)
	{
		if(u1.Mobile>u2.Mobile)
			return 1;
		else if(u1.Mobile<u2.Mobile)
		 return -1;
		else
			return 0;
	}
	

}
