package uebungen.uebung0;

public class Uebung2 {
 // 3//
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
	
	//4//
	
	public static void printTimesMatrix(int nr1, int nr2)
	{
		int a=0;
		while(a<nr1)
			{
			a++;
		for (int b=1; b<=nr2; b++) {
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
				
		{
			for(int row=1; row<=height; row++)
			{ 
				
			for(int stars=1; stars<=row; stars++)
			{
		    System.out.print("*");
	} 
			System.out.println();
			}
		}
	}
	
	
	 public static void printTriangleDown(int height)
	    {
	        for(int row=0; row<height; row++)
	        {
	            //System.out.println("Zeile : " + row + " Sterne : " + (height-row));
	            for(int stars=row; stars < height; stars++)
	            {System.out.print("*");
	            }
	            /*
	            System.out.print(" ");
	            for(int stars=0; stars<=row; stars++)
	            {
	                System.out.print("*");
	            }
	            System.out.print(" ");
	            for(int stars=0; stars<=row; stars++)
	            {
	                System.out.print("*");
	            }
	            */
	            System.out.println();
	        }
	    }
	//6//
	
	
	
	//7//
	
	
	
	public static void main(String[] args) {
		 
     printTimesTables(10,10);
     printTimesMatrix(10,10);
     printTriangleUp(7);
     printTriangleDown(7);
	}

}
