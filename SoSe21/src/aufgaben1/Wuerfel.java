package aufgaben1;

import javax.swing.JOptionPane;


public class Wuerfel {
	
	public static int Points;
	private Spieler[] spieler;
	
	Wuerfel()
	{
		anzSpielerFestlegen();
		anzSiegPunkteFestlegen();
		nameDerSpieler();
		
	}
	

	public void anzSpielerFestlegen()
	{
		int anzSpieler =0;
		boolean inputOk = false;
		while(!inputOk)
		{
			try 
			{
				String input = JOptionPane.showInputDialog("Anzahl Spieler :");
				inputOk = true;
				anzSpieler = Integer.parseInt(input);
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein ");
				inputOk = false;
			}
		}
		spieler = new Spieler[anzSpieler];
	}
	
	public void anzSiegPunkteFestlegen()
	{
		boolean inputOk = false;
		while(!inputOk)
		{
			try
			{
				String input = JOptionPane.showInputDialog("Siegpunkte");
				inputOk = true ;
				int siegPunkte = Integer.parseInt(input);
			}
			catch(NumberFormatExcerption e)
			{
				JOptionPane.showMessageDialog(null, "Die Eingabe muss eine ");
				inputOk = false;
			}
		}
	}
	
	public void nameDerSpieler()
	{
		String name = "";
		for( int ad = 0; ad<spieler.length; ad++)
		{
			name = JOptionPane.showInputDialog("Name des Spieler " + (ad + 1)+ " :");
			spieler[ad] = new Spieler(name);
		}
	}
	
	public void spielen()
	{
		int index = 0;
		boolean gewonnen = false;
		while(!gewonnen)
		{
			gewonnen = spieler[index].wuerfel();
			index = (index<spieler.length-1) ? index+1 :0;
			
		}
	}
	
	
	
	public static void main(String[] args) {
	Wuerfel spiel = new Wuerfel();
	spiel.spielen();

	}

}
