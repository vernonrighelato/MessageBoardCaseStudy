import java.util.ArrayList;
import java.util.List;

public class MessageBoard {
	
	private String name;
	private ArrayList<User> registeredUsers = new ArrayList<User>();
	private ArrayList<Message> messages = new ArrayList<Message>();
	
	public MessageBoard(String name) {
		this.name = name;
	}
	public void addMessage(Message message) {
		messages.add(message);
	}
	public void deleteMessage(int index) {
		
		messages.remove(index);
		
	}
	public void clearMessages() {
		messages.clear();
	}
	
	public void displayMessages() {
		
		for(Message m :messages) {
			System.out.println(m.getId() + " says" + "\n" + m.getMessage());
		}		
	}
	public void addUser(User u) {
		registeredUsers.add(u);
	}
	public ArrayList<User> getRegisteredUsers(){
		return registeredUsers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
