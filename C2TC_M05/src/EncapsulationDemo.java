class Employee
{
	private int empid;//data-hiding
	public void setEmpid(int empid1)
	{
		empid = empid1;
	}
	public int getEmpid()
	{
		return empid;
	}
}

public class EncapsulationDemo
{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.setEmpid(17);
		System.out.println(e.getEmpid());
	}

}