package aufgaben.Aufgaben3;

import java.util.Random;

public class Aufgaben3 {
	
	//1
	
	public static int[] createAndFillArray(int length, int fromInclusive, int toInclusive)
	{
		 int[] a = new int[length];
		    Random r = new Random();   
		    int bound=(toInclusive - fromInclusive) + 1 ;
		    
		    for(int i=0; i<a.length; i++)
		    {
		    	if(toInclusive > fromInclusive )
		    	{
		    		
		        a[i]=r.nextInt(bound) + fromInclusive;
		    	}
		    }
		    return a;
		}

	
	
	
	//2
public static void printArray(int[] a)
{
	//int[] arr1= {27, 30, 25, 26, 23, 20, 30, 30, 22, 21, 29, 29, 21, 20}; // have to try to create a seperate method for this.
	
		System.out.print("[");
	for(int index=0; index<a.length; index++)
	{
		System.out.print(a[index] + "," + " ");
		//System.out.print(arr1[index] + "," + " ");
	}
	System.out.print(a[a.length-1] + "]");
}

//3
public static void printTable(int[] a)
{
	System.out.print("| Index :    |   0  |   1  |   2  |   3  |   4  |   5  |   6  |   7  |   8  |   9  |  10  |  11  |  12  |  13  |");
	System.out.println();
	System.out.print("|------------|------|------|------|------|------|------|------|------|------|------|------|------|------|------|");
	System.out.println();
	System.out.print("| Wert :     ");

	for(int index=0; index<a.length; index++)
	{
		System.out.print("|  ");
		System.out.print(a[index]+"  ");
		
	}
	System.out.print("|");
	/*System.out.println();
	System.out.print("|-------|-----|------|-----|-----|-----|-----|-----|-----|");
	*/
	//System.out.print("Wert");
	
	
	 //System.out.println("--------");
	
	}


public static void printHorizontal(int[] a)
{
	int[] arr1= {27, 30, 25, 26, 23, 20, 30, 30, 22, 21, 29, 29, 21, 20};
	System.out.println("   |");
	
	int stars=0;
	for(int g=0; g<a.length; g++) {
		System.out.print(" "+ g+ " |" );
		
		for(int index=0; index<a.length; index++)
	{
			if(stars!=arr1[0])
		{
			
		System.out.print("*");
		}
		//System.out.print(arr1[index]);	
		
			
	}System.out.println();
	}
		
	
	}
	
	
	 

	
	//System.out.println(" "+index + " |");
	


	public static void main(String[] args) {
		
		Random r= new Random();
		int length = r.nextInt(10)+10;
		int[] arr1 =createAndFillArray(length, 20, 30);
		
		//int[] arr1= {27, 30, 25, 26, 23, 20, 30, 30, 22, 21, 29, 29, 21, 20};
		
	
		

		//System.out.printf("%n%n%n----------- printArray -----------------%n%n%n");p	RF   CR%$
		//printArray(arr);

		//printArray(arr1);
		System.out.printf("%n%n%n----------- printArray -----------------%n%n%n");
		printArray(arr1);
		
		
		System.out.printf("%n%n%n----------- printTable -----------------%n%n%n");
		printTable(arr1);
		
		System.out.printf("%n%n%n----------- printHorizontal ------------%n%n%n");
		printHorizontal(arr1);

		
	}
		
	
	
	

}
