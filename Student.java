
public class Student extends User{

	
	public Student(String firstname, String suraname) {
		super(firstname, suraname);
		super.role = Role.STUDENT;		
	}
}