public class Student
{
	long sapID;
	String firstName, lastName;
	
	public Student(long sapID, String firstName, String lastName)
	{
		this.sapID = sapID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getSapID()
	{
		return sapID;
	}

	public void setSapID(long sapID)
	{
		this.sapID = sapID;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Override
	public String toString()
	{
		return "Student [sapID=" + sapID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
