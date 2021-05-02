package aufgabe2;

public class MyInteger {
	
	public static int MAX_VALUE = Integer.MAX_VALUE; // should contain max int number
	public static int MIN_VALUE = Integer.MIN_VALUE;

	private int value;// still need to find out what objektorientiert ist
	
	
	public static int parseInt(String s) // y use parseint for string?
	{
		int num= Integer.parseInt(s);
		
		if (num >=0)
		{
			return num;
		}
		else
		{
			throw new IllegalArgumentException("Es ist kein Zahl");
		}
		if (num <=0)
		{
			return num;
		}
		else
		{
			throw new IllegalArgumentException("Es ist kein Zahl");
		}
		if(s.isEmpty())
		{
			throw new IllegalArgumentException("Es ist leer");
		}
		
		try 
		{
			double d = Double.parseDouble(s);
		}
		catch(NumberFormatException | NullPointerException nfe)
		{
			return false;
		}
		return true;
	}
	
	MyInteger(int value)
	{
		this.value= value;
	}
	
	MyInteger(String s) // still need to figure out was die aufgabestellung mein
	{ 
		
	}

	public int intValue()
	{
		return value;
	}
	
	public double doubleValue()
	{
		return value;
	}
	
	public static valueOf(String s) // figure out 7
	{
		
	}
	
	public static valueOf(int value)
	{
		
	}
	
	/*
	 @Override //9
	    public boolean equals(Object o)  // still need to change (adapt the whole method to the program
	    {
	       /* if(o == null) return false;
	        if(this == o) return true;
	        if(this.getClass() != o.getClass()) return false;

	        Land lo = (Land)o;
	        return this.name.equals(lo.name);
	    }
	*/
	 @Override
	    public String toString()  // still need to adapt the method to the program
	    {
	        String s = String.format("% : %3d  : %4d  : %8.4f", MyInteger.parseInt(s), MyInteger.MAX_VALUE, MyInteger.MIN_VALUE, value);
	        return s;
	    }
	 
	 public void print()
	    {
	        System.out.println(this.toString());
	    }

	 
}
