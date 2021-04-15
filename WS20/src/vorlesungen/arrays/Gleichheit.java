package vorlesungen.arrays;

public class Gleichheit {
	
	public static int getSumme(int[] a)
	{
	    int sum = 0;
	    for (int i = 0; i < a.length; i++)
	    {
	        sum += a[i];
	    }
	    return sum;
	}



	public static boolean areEqual(int[] a, int[] b)
	{   
	    boolean areEqual = true;
	    if(a.length != b.length)
	    {
	        areEqual = false;
	    }
	    for(int index=0; index < a.length && areEqual; index++)
	    //for(int index=0; index < a.length; index++)
	    {
	        if(a[index]!=b[index])
	        {
	            areEqual = false;
	        }
	    }
	    return areEqual;
	}

	public static void main(String[] args) {
		int[] arr1 = {8, 9, 2, 3, 7, 4, 1, 0, 9, 6 };
		int[] arr2 = {8, 9, 2, 3, 7, 4, 1, 0, 9, 6 };
		int[] arr3 = {8, 9, 2, 3, 7, 5, 1, 0, 9, 6 };
		int[] arr4 = {8, 9, 2 };
		int[] arr5 = {8, 9, 2, 3 };

if(arr2==arr3)
{
	System.out.print("Sie sind gleich");
	}
else {
	System.out.print("Sie sind ungleich");
	System.out.println();
}
System.out.println(areEqual(arr1, arr2));
System.out.println(areEqual(arr1, arr3));
System.out.println(areEqual(arr4, arr5));
System.out.println(areEqual(arr5, arr4));

	}

}
