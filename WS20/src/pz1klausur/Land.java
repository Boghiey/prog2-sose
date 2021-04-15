package pz1klausur;

import java.util.Random;

public class Land {
	private String name;
	private int groesse;
	private int einwohner;
	
	public String getName() {
		return name;
	}
	

	public int getGroesse() {
		return groesse;
	}
	
	public int getEinwohner() {
		return einwohner;
	}
	
	public String erzeugeName()
	{
		Random r=new Random();
		int let= r.nextInt(26) +65; // value of capital letters in ascii code
		char c=(char)let; // converts int to char
		String s= "" + c;
		
		int num= r.nextInt(10);
		s +=num;
		return s;
	}
		
		public Land()
		{
			this.name = this.erzeugeName(); // initialise name
			Random r=new Random();
			this.groesse=r.nextInt(100)+1;   // initialise groesse randomly
			this.einwohner=r.nextInt(1000)+1; // initialise einwohner randomly
	}
		
		public double ewDichte()
		{
			double ewDichte = (double)this.einwohner / (double)this.groesse;
			return ewDichte;		
		}
	
		//overrinding tostring
		@Override
		public String toString()
		{
			String s=String.format("%s : %3d km2  :  %4d ew : %8.4f", this.erzeugeName(), this.groesse, this.einwohner, this.ewDichte());
			return s;
		}
		
		public void print()
		{
			System.out.println(this.toString());
		}
		
		public boolean istGroesser(Land land)
		{
			return this.groesse>land.groesse;
			
			/*boolean mehr=true;
			boolean nicht=false;
			//for(int a=0; a<;a++)
			if(this.groesse>land)
			{
				return mehr;
						
			}
			else
			{
				return nicht;
			}*/
		}
			
			public boolean hatMehrEinwohner(Land land)
			{
				return this.einwohner>land.einwohner;
				
		}
			
			public boolean nameIstGroesser(Land land)
			{
				return this.name.compareTo(land.name)>0;
		}	
			
			@Override
			public boolean equals(Object o)
			{

				
			if(o==null) return false;
			if(this ==o) return true;
			if (this.getClass() !=o.getClass()) return false;
			
			Land lo =(Land)o;
			return this.name.equals(lo.name);
			
			}
}

