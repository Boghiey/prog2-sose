package aufgaben.aufgaben7;

public class SortedArray {
	
	private int s;
	
	public int SortedArray()
			{
		this.s=0;
		return s;
			}
	
	public int SortedArray(int element)
	{
		s= element;
		return s;
	}
	
	public boolean insert(int element)
	{
		return(this.s==element);
	}
	
	public boolean delete(int element)
	{
		return(this.s!=element);
	}

	public void print()
	{
		System.out.print("[this.s]");
	}
	
	boolean contains(int element)
	{
		return (this.s==element);
	}
}
