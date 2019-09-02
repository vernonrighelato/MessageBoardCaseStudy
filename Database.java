import java.util.ArrayList;

public class Database {
	
private static Database database_instance = null;
	
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<MessageBoard> messageBoards = new ArrayList<MessageBoard>();
	//These comments were made in ecplipse in git
	public static Database getInstance() {
		
		if(database_instance == null) {
			database_instance = new Database();			
		}
		return database_instance;		
	}
	
	public User getUser(String id) {
		for(User u : users) {
			if(u.getId().equals(id)) {
				return u;
			}
		}
		System.out.println("User not found");
		return null;
	}
	
	public MessageBoard getMessageBoard(String name) {
		for(MessageBoard m : messageBoards) {
			if(m.getName().equals(name)) {
				return m;
			}
		}
		System.out.println("MEssage board not found");
		return null;
	}
	
	
	
}
