import java.util.Scanner;

public class MessageBoardManager {

	private static MessageBoardManager mbm_instance = null;
	
	public static MessageBoardManager getInstance() {
		
		if(mbm_instance == null) {
			mbm_instance = new MessageBoardManager();			
		}
		return mbm_instance;		
	}
	
	public MessageBoard createMessageBoard(User u, String name) {

		if (u.role == Role.TEACHER) {
			MessageBoard mb = new MessageBoard(name);
			mb.addUser(u);
			return mb;

		} else {
			System.out.println(u.getId() + " You don't have permission to create message boards");
			return null;
		}
	}
	
	public void displayMessages(MessageBoard mb, User u) {
		if(mb.getRegisteredUsers().contains(u)) {
			mb.displayMessages();
		}else {
			System.out.println("You don't have persmission to read messages from " + mb.getName());
		}
	}


	public void postMessage(MessageBoard mb, User u) {
		if(mb.getRegisteredUsers().contains(u)) {
			System.out.println(u.getId() + " Write your message");
			Scanner input = new Scanner(System.in);
			String messageText = input.nextLine();
			Message m = new Message(u.getId(), messageText);
			mb.addMessage(m);
		}else {
			System.out.println("You don't have persmission to add messages to " + mb.getName());
		}
		
	}

	public void deleteMessage(User u, MessageBoard mb, int index) {
		if (u.role == Role.TEACHER) {
			mb.deleteMessage(index);
		} else {
			System.out.println(u.getId() + " You don't have permission to delete messages");
		}
	}

	public void clearMessageBoard(User u, MessageBoard mb) {

		if (u.role == Role.TEACHER) {
			mb.clearMessages();
		} else {
			System.out.println(u.getId() + " You don't have permission to delete messages");
		}
	}

	public void deleteMessageBoard(User u, MessageBoard mb) {

		if (u.role == Role.TEACHER) {
			mb = null;
		} else {
			System.out.println(u.getId() + " You don't have permission to delete message boards");
		}
	}
}