package pz1klausur;

public class Kontinent extends Land{
	private Land[] laender;
	private char kontinent;

	
	public Kontinent(char kontinent, int anzahlLaender)
	{
		this.kontinent=kontinent;
		this.laender = new Land[anzahlLaender];
		for(int a=0; a<this.laender.length; a++)
		{
			this.laender[a] = new Land();
		}
		
	}
	
	public int getAnzahlLaender() {
		return this.laender.length;
	}

	public Land[] getLaender() {
		return this.laender;
	}

	public Land getLandtAtIndex(int index)
	{
		if(index>=0 && index<this.getAnzahlLaender())
		{
		return this.laender[index];
		}
		else
		{ 
			return null;
		}
	}
	
	
	public int[] getSummen()
	{
		int summeEw=0;
		int summeQm=0;
		for(int a=0; a<this.laender.length; a++)
		{
			summeEw += this.laender[a].getEinwohner();
			summeQm += this.laender[a].getGroesse();
					
		}
		int[] summen = {summeQm, summeEw};
        return summen;
		}
			
	@Override
	public String toString()
	{
		  String s = String.format("Kontinent %c %n", this.kontinent);
	        s += String.format("--------------------------%n");
	        for (int index = 0; index < this.laender.length; index++)
	        {
	            s += String.format("%24s %n", this.laender[index]);
	        }
	        return s;
		/*
		String c=""+ this.kontinent;
		System.out.println("------------------------------------");
		String s=String.format("%s : %3d km2  :  %4d ew : %8.4f", this.Laender, this.groesse, this.einwohner, this.ewDichte());
		return s;
		*/
	}

	
	public void print()
	{
		System.out.println(this.toString());
	}
	
	public void sortiere(int nach)
	{
		   for(int bubble=1; bubble<this.laender.length; bubble++)
	        {
		for(int index=0; index<this.laender.length-bubble; index++)
        {
            if(nach==0 && this.laender[index].istGroesser(this.laender[index+1]) ||
               nach==1 && this.laender[index].hatMehrEinwohner(this.laender[index+1]) ||
               nach==2 && this.laender[index].ewDichte() > this.laender[index+1].ewDichte() ||
               nach!=0 && nach!=1 && nach!=2 && this.laender[index].nameIstGroesser(this.laender[index+1]))
            {
                Land tmp = this.laender[index];
                this.laender[index] = this.laender[index+1];
                this.laender[index+1] = tmp;
            }
        }
	}
	}
}
