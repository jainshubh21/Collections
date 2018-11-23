import java.util.Comparator;

public class AddressSort implements Comparator<User> 
{
	@Override
	public int compare(User u1 , User u2)
	{
		return u1.Address.compareTo(u2.Address);
	}
	

}
