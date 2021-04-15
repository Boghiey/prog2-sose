package uebung.uebung5;

import java.util.Random;

public class Uebung5 {
	
	public static int throwDice()
	{
		Random rand = new Random();
		int val= rand.nextInt(6) + 1;
		return val;
		
	}
	
	public static void printThrow(int cast)
	{
		/*cast = throwDice();
				
		//if (cast!=0)
		for(int a=0; a<cast; a++)
		{*/
			System.out.println("Es wurde eine " + cast + " gewurfelt" );
		//}		
	}
	
	public static int[] insertIntoStatistics(int[] statistics, int cast)
	{
				if(cast>=1 && cast<=6)
		
	//  for(int a=0; a<statistics.length; a++)
	  {
		 statistics[cast-1]++;
	  }
	  return statistics;
		
	}
	
	public static void printStatistics(int[] statistics)
	{
		System.out.print("[");
		for(int a=0; a<statistics.length; a++)
		{
			if(a<statistics.length-1)
			{
			//int v= statistics*a;
			System.out.print("( "+ statistics[a] + "x" +(a + 1) +"), " );
		}
			else   // a==statistics.length-1
			{
				System.out.print("( "+ statistics[a] + "x" +(a + 1) +")" );
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static int sumOfStatistics(int[] statistics)
	{
	  int sum=0;
		for(int a=0; a<statistics.length;a++) 
		{
			sum=sum +(statistics[a]*(a+1));
		}
		
		return sum;					
	}
	
	public static int throwDiceUntilTarget(int target, int[] statistics)
	{
        int tries = 0;
        int cast = throwDice();
        printThrow(cast);           // Nebeneffekt - nicht so gut!
        tries++;
        insertIntoStatistics(statistics, cast);
        int sum = sumOfStatistics(statistics);
        while(sum < target)
        {
            cast = throwDice();
            printThrow(cast);       // Nebeneffekt - nicht so gut!
            tries++;
            insertIntoStatistics(statistics, cast);
            sum = sumOfStatistics(statistics);
        }
        return tries;
    }
		/*
		int v=target;
		int summe=0;
		//int anzahl=0;
		for(int a=0; a<v; a++)
		{
			System.out.println();
			
		}
		return summe+=summe;
*/
	

	public static void main(String[] args) {
	int[] statistics=new int [6];
	//insertIntoStatistics()
	
	System.out.printf("%n%n------------------- Test throwDice and printThrow -------------------%n%n");
    for(int index=0; index<10; index++)
    {
        int cast = throwDice();
        printThrow(cast);
    }
    
    System.out.printf("%n%n------------------ Test insert- and printStatistics -----------------%n%n");
    for(int index=0; index<100; index++)
    {
        int cast = throwDice();
        statistics = insertIntoStatistics(statistics, cast);
    }
    printStatistics(statistics);    
	
	
	System.out.printf("%n%n--------------------- Test sumOfStatistics --------------------------%n%n");
	printStatistics(statistics);
	int sumTest = sumOfStatistics(statistics);
	System.out.println("Summe = " + sumTest);
	
	System.out.printf("%n%n------------------- Test throwDiceUntilTarget -----------------------%n%n");
	statistics = new int[6];    // altes Array war schon befuellt 
	final int TARGET = 100;
	int tries = throwDiceUntilTarget(TARGET, statistics);
	printStatistics(statistics);
	int sum = sumOfStatistics(statistics);
	System.out.println("Es wurden " + tries + " Versuche benötigt, um " + sum + " Punkte zu erzielen.");

	
}
}
