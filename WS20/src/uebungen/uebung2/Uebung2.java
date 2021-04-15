package uebungen.uebung2;

public class Uebung2 {
	
	public static void printTimesTables(int nr1, int nr2)
	{
		{
			
		int a=0;
		while(a<10)
			{
			a++;
		for (int b=1; b<=10; b++) {
	  int times=a*b;
	  System.out.println(a + " * " + b + " = " + times);
		}
		System.out.println();
		}
		System.out.println();
		}
	}
	
	
	public static void printTimesMatrix(int nr1, int nr2)
	{
		
		
			
			int a=0;
			while(a<10)
				{
				a++;
			for (int b=1; b<=10; b++) {
		  int times=a*b;
		  System.out.print(times + " ");
			}
			System.out.println();
			}
			System.out.println();
			
		
	}
	
	//5//
	public static void printTriangleUp(int height)
	{
		for(int row=0; row<=height; row++)
		{ 
			
		for(int stars=row; stars<height; stars++)
		{
	    System.out.print("*");
} 
		System.out.println();
		}
		}
		

	//6//
	 public static void printXYZ()
	    {
	        int product = 36;
	        for(int z = -product; z <= product; z++)
	        {
	            for(int y = -product; y <= z; y++)
	            {
	                for(int x = -product; x <= y; x++)
	                {
	                    //if(x * y * z == product && (x <= y) && y <= z)
	                    if(x * y * z == product)
	                    {
	                        System.out.println("z=" + z + " y=" + y + " x=" + x);
	                    }
	                }
	            }
	        }
	    }
	 
	 
	//7//
	public static void printSeconds(int seconds)
	{
	int a=seconds;
	if (a>60) {
	int mins = seconds/60;
	
	int rmins = seconds%60;
	if (mins>60)
	{
	int hrs=mins/60;
	int rhrs=mins%60;
	
	if(hrs>24)
	{
		
	int day=hrs/24;
	int rday= hrs%24;
	
	
	System.out.println(a + " Sekunden sind " + day +" Tage, " + rday + " Stunden, " + rhrs +" Minuten, " + rmins +" Sekunde " );
	}
	}
	}
	}
	
	
	
	 public static int crossSum(int number)
	    {
	        int sum = 0;

	        int rest = number % 10;     // letzte Ziffer
	        sum = sum + rest;
	        int result = number / 10;   // Zahl ohne letzte Ziffer
	        while(result > 0)
	        {
	            rest = result % 10;
	            sum = sum + rest;
	            result = result / 10;
	        }

	        return sum;
	    }

	
	public static void main(String[] args) {
		 System.out.println("----- Aufgabe 1 ------");
		 System.out.println();
		printTimesTables(10, 10);
		
		 System.out.println();
		 System.out.println("----- Aufgabe 2 ------");
		printTimesMatrix(10, 10);
		 System.out.println();
		 
		 System.out.println("----- Aufgabe 3 ------");
		 System.out.println();
		printTriangleUp(7);
		 System.out.println();
		 
		 System.out.println("----- Aufgabe 4 ------");
		 System.out.println();
		printXYZ();
		 System.out.println();
		 
		 System.out.println("----- Aufgabe 5 ------");
		 System.out.println();
		printSeconds(3456789);
		printSeconds(2345678);
        printSeconds(123456);
        printSeconds(12345);
        
        System.out.println();
        System.out.println("----- Aufgabe 6 ------");
        System.out.println();
        int number = 123456789;
        int crossSum = crossSum(number);
        System.out.println("Die Quersumme von " + number + " ist " + crossSum + ".");

	}

}
