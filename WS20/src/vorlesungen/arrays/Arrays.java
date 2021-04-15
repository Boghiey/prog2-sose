package vorlesungen.arrays;

public class Arrays {
	

	public static void main(String[] args)
	{
	   int length = 20;
	    int[] fibonacci = new int[length];
	    fibonacci[0] = 0;
	    fibonacci[1] = 1;
	    int currentmax=0;
	    //System.out.print("[");
	    for(int index=2; index<fibonacci.length; index++)
	    {
	        fibonacci[index] = fibonacci[index-1] + fibonacci[index-2];
	       
	        
	        //System.out.print(fibonacci[index-2] + "," + " ");
	        
	        if(fibonacci[index-2]>currentmax);
	        
	        currentmax=fibonacci[index];
		    {
		    	System.out.print(currentmax + " ");
		    }

	}
	  /*  if(fibonacci.length>0)
	    {
	     System.out.print(fibonacci[fibonacci.length-1] + "]");
	}
	   
	  */  
	}
}
