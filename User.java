
public abstract class User implements IDGenerator {
	
	private String firstname;
	private String suraname;
	private String id;
	protected Role role;
	
	public User(String firstname, String suraname) {
		
		this.firstname = firstname;
		this.suraname = suraname;
		id = generateID(firstname, suraname);
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSuraname() {
		return suraname;
	}
	public void setSuraname(String suraname) {
		this.suraname = suraname;
	}	
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", suraname=" + suraname + ", id=" + id + ", role=" + role + "]";
	}	
}