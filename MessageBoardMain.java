
public class MessageBoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageBoardManager mbm = MessageBoardManager.getInstance();
		
		System.out.println("Hi");
		Teacher a = new Teacher("Vernon", "Righelato");
		System.out.println(a.toString());
		
		Student s = new Student("Dennis", "Mennace");
		System.out.println(s.toString());
		
		MessageBoard mb1 = mbm.createMessageBoard(a, "Message board 1");
		MessageBoard mb2 = mbm.createMessageBoard(s, "Message board 2");
		
		mbm.postMessage(mb1, a);
		mbm.postMessage(mb1, s);
		mbm.displayMessages(mb1, a);
		
	}
}
