
public class Employee implements Comparable<Employee> 
{
	int empId;
	String Ename;
	int salary;
	
	public Employee(int empId , String Ename , int salary)
	{
	  this.empId = empId;
	  this.Ename = Ename;
	  this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee Eobj)
	{
		if(this.salary>Eobj.salary)
			return 1;
		else if(this.salary<Eobj.salary)
			return -1;
		else 
			return 0;
		
	}
	
	public String toString()
	{
		return "Employee Id:"+empId+" Employee Name:"+Ename+" Employee Salary:"+salary;
	}
	

}
