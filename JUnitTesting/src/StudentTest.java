import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class StudentTest
{
	@Test
	void testSapID()
	{
		Student student = new Student(403000059, "Abhishek", "Singh");
		assertEquals(student.getSapID(), 403000059);
	}

	@Test
	void testFirstName()
	{
		Student student = new Student(403000059, "Abhishek", "Singh");
		assertEquals(student.getFirstName(), "Abhishek");
	}

	@Ignore
	@Test
	void testLastName()
	{
		Student student = new Student(403000059, "Abhishek", "Singh");
		assertEquals(student.getLastName(), "Singh");
	}
}
