package aufgabe7;

import java.util.Set;



public class Slack implements Publisher {

	private Set<Listener> listeners;
	
	private int nrOfMessages;
	
	
	
	public void nrOfMessages()
	{
	this.nrOfMessages=0;
	}


	public Set<Listener> getListeners() {
		return listeners;
	}

	public int getNrOfMessages() {
		return nrOfMessages;
	}



	@Override
	public boolean register(Listener listener) {
		
		// look for a way to return true if listener is added to the list or already in. still need to do that
		return false;
		
		
	}



	@Override
	public boolean unregister(Listener listener) {
		// return true if listener was erased or if it is not in the list
		return false;
	}



	@Override
	public void notifyListeners() {
		// ruft update method for listeners
		
	}



	@Override
	public String getUpdate(Listener listener) {
		//returns following string "Breaking News " + this.nrOfMessages.
		//return null;
		
		return "Breaking News " + this.nrOfMessages;
	}


	public void publishNews()
	{//Create a public void publishNews() method in which the nrOfMessages is increased by 1 and the notifyListeners() method is called. 
		return (this.nrOfMessages+1)
				
	
	}
	
	
}