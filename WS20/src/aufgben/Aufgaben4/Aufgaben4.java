package aufgben.Aufgaben4;

import java.util.Random;

public class Aufgaben4 {

	public static char[] createAndFillCharArray()
	{
		char[] alphabet=new char[25];
		Random rnd= new Random();
		for(int i = 0; i<alphabet.length; i++){
			 alphabet [i] =rnd.nextInt(25);
			System.out.println((char)asciiValue);	
		}
	}
	
	
		
		
		public static boolean contains(char[] ca, char c)
		{
			
		char [] count= {c};
		boolean tree= true;
				
		for(int index=0; index<ca.length;index++)
			
		}
		
		
		
		
		public static char[] sort(char[] a)
		{
			
		
		
		}
		
		
		
		public static char[] sort(char[] a)
		{
			
		}
		
		
		
	public static void main(String[] args) {
		for(int asciiValue = 97; asciiValue<123; asciiValue++)
		{
		    char c = (char) asciiValue;
		    System.out.print(c + " ");
		}
		System.out.printf("%n%n----------------- Erzeugen ------------------%n%n");
		char[] ca1 = createAndFillCharArray();
		print(ca1);

		System.out.printf("%n%n----------------- Sortieren ------------------%n%n");        
		char[] ca2 = sort(ca1);
		print(ca2); 
	}

}
