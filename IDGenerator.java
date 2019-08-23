
public interface IDGenerator {
	
	
	public default String generateID(String myFisrtname, String myLastname) {		
		char firstInitial = myFisrtname.charAt(0);
		int randomNumber = (int) Math.floor(Math.random()*100);
		String myID = firstInitial + myLastname + randomNumber;
		return myID;		
	}

}
