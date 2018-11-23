import java.util.*;

public class User 
{
	int uid;
	String UName;
	String Address;
	long Mobile;
	
	public User(int uid , String UName , String Address , long Mobile)
	{
		this.uid = uid;
		this.UName = UName;
		this.Address = Address;
		this.Mobile = Mobile;
	}
	
	public String toString()
	{
		return uid+":"+UName+":"+Address+":"+Mobile;
	}

}
