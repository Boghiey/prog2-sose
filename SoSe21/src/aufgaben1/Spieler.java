package aufgaben1;

import java.util.Random;
import javax.swing.JOptionPane;

public class Spieler {
	private String name;
	private int aktStand;
	
	Spieler(String name)
	{
		aktStand =0;
		this.name = name;
		
	}
	
	public boolean wuerfel()
	{
		System.out.printf("%n%nSpieler %s ist an der reiher(bisher %d Punkte) %n -----------------------------------%n");
		int PunkteInDerReiher= 0;
		int wurf = 0;
		Random r= new Random();
		boolean ende = false;
		while(!ende)
		{
			wurf = r.nextInt(6)+1;
			System.out.printf("%s hate eine %d gewuerfelt %n",  this.name, wurf);
			if(wurf==6)
			{
				aktStand =0;
				System.out.printf("Versuch zu Ende %n Aktueller Spielstand von %s : %d Punkte %n der naechste Pieler ist dran");
				ende = true;
				
			}
			else if(aktStand+ PunkteInDerReiher +wurf >= spiel.siegpunkte)
			{
				System.out.printf("%s hat insgesamt %d Punkte und somit gewonnen!!",  this.name, (aktStand+PunkteInDerReiher+wurf));
				return true;
			}
			else 
			{
				PunkteInDerReiher +=wurf;
				System.out.printf("in diesem Versuch bisher %d Punkte -- insgesamt %d punkte %n", PunkteInDerReiher, (aktStand+PunkteInDerReiher+wurf));
				int dialogResult = JOptionPane.showInternalConfirmDialog(null, this.name+ ",Wollen sie weiter wuerfeln");
			}
		}
				
	}

}
