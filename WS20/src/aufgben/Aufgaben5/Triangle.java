package aufgben.Aufgaben5;


public class Triangle {
 //objektmethode für die seite eine dreieck
	private int a; 
	private int b;
	private int c;
	
	public Triangle(int pa, int pb, int pc)  // object method for the sides of a triangle
	{
		a=pa;
		b=pb;
		c=pc;
		
		
	}
	

	//objektmethode
	 
	public int circumference()
	{
		int add = a+b+c;
		 System.out.println("umfang          :" + add +" ");
         return add;
	
	}
	
	public double area()
	{
		double s = (a + b + c) / 2;
		double A = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		System.out.println("Flaecheninhalt  :" + A+ " ");
		return A;
	}
	
	//objektmethode comparison
	
	public boolean equilateral()
	{
		boolean side= true;
		if (a == b && b == c) 
		System.out.println( "Das Dreieck ist gleichseitig");
		return side;
		//else
		//System.out.println("Das Dreieck ist unregelmaessig.");

	
	}

	public boolean isosceles()
	
	{
		boolean isc= true;
		if (a == b || b == c || c == a)
			 
		 System.out.println("das Dreieck gleichschenklig");
		
		
		 else 
		 System.out.println( "Das Dreieck ist unregelmaessig.");
		 return isc;
	}
	
	/*public int getadd()
	{
		return add;
	}
	
	*/
	
	public boolean sameCircumference(Triangle t)
	{
		int y = a+b+c;
		
		return( y == t.circumference());
		
	}
	
	public boolean isSmaller(Triangle t)
	
	{
		int add = a+b+c;
		return(add< t.a+b+c);
	}
	
	public boolean isBigger(Triangle t)
	{
		int add = a+b+c;
		return(add> t.a+b+c);
	}
	
	public void print()   // enables an output
	{
	    System.out.println("Seiten"+"          "+":" + "a="+a + "," + "b=" +b+"," + "c="+c);
	    
	  
	   // System.out.println("Flaecheninhalt       :" + A+ " ");
	}

	
	
	
}
