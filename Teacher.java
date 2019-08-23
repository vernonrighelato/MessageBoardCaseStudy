
public class Teacher extends User {

	public Teacher(String firstname, String suraname) {
		super(firstname, suraname);
		super.role = Role.TEACHER;		
	}
}