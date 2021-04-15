package pz1klausur;

public class Welt {
	
	private Kontinent[] kontinente;
	
	public Welt(Kontinent[] kontinente)
	{
		this.kontinente= kontinente;
	}
	
	 public int anzahlLaender()
	    {
	        int anzahl = 0;
	        for (int index = 0; index < this.kontinente.length; index++)
	        {
	            anzahl += this.kontinente[index].getAnzahlLaender();
	        }
	        return anzahl;
	    }
	 
	public Land[] getAlleLaender()
	{
		Land[] alleLaender = new Land[this.anzahlLaender()];
		int indexAlle=0;
		for(int a=0; a<this.kontinente.length; a++)
		{
			for(int b=0; b<this.kontinente[a].getAnzahlLaender(); b++)
		
		{
		alleLaender[indexAlle++] = this.kontinente[a].getLandtAtIndex(b);
		}
		}
		return alleLaender;
	}
	
	//sorts the names in order to make it easier to identify 
public Land[] sortiereAlleLaenderNachName()
{
	Land[] alleLaender = this.getAlleLaender();
	
	   for(int bubble=1; bubble<alleLaender.length; bubble++)
     {
	for(int index=0; index<alleLaender.length-bubble; index++)
 {
     if( alleLaender[index].nameIstGroesser(alleLaender[index+1]))
     {
         Land tmp = alleLaender[index];
         alleLaender[index] = alleLaender[index+1];
         alleLaender[index+1] = tmp;
     }
 }
     }
	   return alleLaender;
 }


	public void printAlleLaender(Land[] alleLaender)
	{
		for(int a=0; a<alleLaender.length; a++)
		{
			System.out.println(alleLaender[a]);
		}
	}
	
	public boolean enthaeltDoppel()
	{
		Land[] alleLaender= this.getAlleLaender();
		
		for(int a=0; a<alleLaender.length-1; a++)
		{
			for(int b=a+1;b<alleLaender.length; b++ )
			{
				if(alleLaender[a].equals(alleLaender[b]))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public Land groesstestLand()
	{
		 Land[] alleLaender = this.getAlleLaender();
	        int indexGroesstes = 0;
		for(int index=1; index<alleLaender.length; index++)
		{
			 if(alleLaender[index].istGroesser(alleLaender[indexGroesstes]))
	            {
	                indexGroesstes = index;
	            }
		}
			
		 return alleLaender[indexGroesstes];
	}
	
	public Land[] alleLaenderGroesserAls(int groesse) 
	{
		Land[] alleLaender = this.getAlleLaender();
		int anzahl=0;
		for(int a=0; a<alleLaender.length; a++)
		{
		if(alleLaender[a].getGroesse()>groesse)
			{
				anzahl ++;
			}
		}
		
		Land[] laender = new Land[anzahl];
		int indexLaender=0;
		for(int index=0;index<alleLaender.length;index++)
		{
			if(alleLaender[index].getGroesse()>groesse)
			{
				laender[indexLaender++] = alleLaender[index];
			}
		}
		return laender;
	}
	
}
