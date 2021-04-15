package aufgaben.Aufgaben6;

public class Bruch {
	private int zaehler;
	private int nenner;
	
	
	public Bruch()
	{
		this.zaehler = 1;
		this.nenner = 1;
		
	}
	
	public Bruch(int zaehler, int nenner)
	{
		this.zaehler = zaehler;
		this.nenner = nenner;
		
	}
	public Bruch plus(Bruch b)
	{
		//return b + Bruch;
		int z = this.zaehler * b.nenner + this.nenner * b.zaehler ;
		int n = this.nenner * b.nenner;
		
		Bruch ausgabeBruch = new Bruch(z, n);
		
		ausgabeBruch.nenner = n;
		ausgabeBruch.zaehler = z;
		
		return ausgabeBruch;
	}
	public Bruch minus(Bruch b)
	{
		//return (zaehler/nenner)- b;
		int z = this.zaehler * b.nenner - this.nenner * b.zaehler ;
		int n = this.nenner * b.nenner;
		
		Bruch ausgabeBruch = new Bruch(z, n);
		
		ausgabeBruch.nenner = n;
		ausgabeBruch.zaehler = z;
		
		return ausgabeBruch;
		
	}
	
	public Bruch mal(Bruch b)
	{
		//return (zaehler/nenner)*b;
		int z = this.zaehler * b.zaehler ;
		int n = this.nenner * b.nenner;
		
		Bruch ausgabeBruch = new Bruch(z, n);
		
		ausgabeBruch.nenner = n;
		ausgabeBruch.zaehler = z;
		
		return ausgabeBruch;
	}
	
	public Bruch geteilt(Bruch b)
	{
		//return (zaehler/nenner)/ b;
		int z = this.zaehler * b.nenner ;
		int n = this.nenner * b.zaehler;
		
		Bruch ausgabeBruch = new Bruch(z, n);
		
		ausgabeBruch.nenner = n;
		ausgabeBruch.zaehler = z;
		
		return ausgabeBruch;
	}

	public Bruch kuerzen()
	{
	int ggt = ggT(zaehler, nenner);
	zaehler = zaehler/ggt;
	nenner = nenner/ggt;
	System.out.println(zaehler + "/" + nenner);
	}
	

	public String toString()
	{
		return zaehler + "/"+ nenner;
		
		/*
		String s = String.format("Rectangle : ( zaehler=%2d, nenner=%2d, Bruch plus=%3d, Bruch minus=%2d, Bruch mal=%2d,Bruch geteilt=%2d, Bruch kuerzen=%2d )", 
                this.zaehler, this.nenner);
                		//this.Bruch plus() this.Bruch minus(), this.Bruch mal(), this.Bruch geteilt(),this.Bruch kuerzen());
        return s; 
        */
	}
	
	
	public int ggT(int zahl1, int zahl2)
	{
		while (zahl1 != zahl2) {
		
		if (zahl1 > zahl2) {
		zahl1 = zahl1 - zahl2;
	} 
else {
	zahl2 = zahl2 - zahl1;
	}
}
return zahl1;
	}

	
}
