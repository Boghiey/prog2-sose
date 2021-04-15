package vorlesungen.arrays;

import java.util.Random;

public class Practise {
	
	public static int[] createAndFillArray(int length)
{
    int[] a = new int[length];
    Random r = new Random();                    
    for(int i=0; i<a.length; i++)
    {
        a[i]=r.nextInt();
    }
    return a;
}


	public static void main(String[] args) {
		
		int[] arr6 = createAndFillArray(5);
		printArray(arr6);
		System.out.print(arr6);

	
	}
}