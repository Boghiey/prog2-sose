package aufgabe7;

public class Student extends Slack implements Listener 
{
	private String name;   // speicer name von student
	

	private Publisher publisher;  // speicher publisher an dem sich student anmeldet

	public Student(String name)
	{
		name= this.name;
	}
	

	public String getName() {
		return name;
	}
	
	@Override
	public void update() {
		//return getUpdate
				
		System.out.println(this.name + " received " + msg);
		
	}

	@Override
	public void setPublisher(Publisher publisher) {
		
	//register(Listener listener)
		System.out.println(this.name + " registered! ");
		
	}

	@Override
	public void removePublisher(Publisher publisher) {
		System.out.println(this.name + " deregistered! ");
		
	}


}
