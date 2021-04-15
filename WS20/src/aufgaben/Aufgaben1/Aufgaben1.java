package aufgaben.Aufgaben1;

public class Aufgaben1 {
	
	public static void printRhombus(int upperHalf, boolean filled)
	{
		{
			
			for(int height=1; height<=upperHalf; height++)  // To print part 1 of shapes
			{ 
		      for(int spaces=upperHalf-height; spaces>0; spaces--) // to print white spaces
		    	  System.out.print(' ');
		      
			for(int stars=2*height-1; stars>0; stars--)// print out the stars
				
			System.out.print("*");
			System.out.print('\n');
			}
				for(int height=upperHalf-1;height>0; height--) //print part 2 
						{
					for(int spaces=0; spaces<upperHalf-height;spaces++) //print out the space
						System.out.print(' ');
					for(int stars=0;stars<2*height-1;stars++)// print *
						System.out.print('*');
					System.out.print('\n');
					
							
							
			
						}
		}
	}

				
		
	 
	public static void printRhombusUnfilled(int upperHalf, boolean filled)
		{
			{
				
				for(int height=1; height<=upperHalf; height++)  // To print part 1 of shapes
				{ 
			      for(int spaces=height; spaces<upperHalf; spaces++) // to print white spaces
			    	  System.out.print(' ');
			      int k=0;
			      while(k!=(2*height-1)) // print *
			      {
			    	  if(k == 0 || k ==2*height-2)
			    	  System.out.print("*");
			    	  
			    	  else
			    		  System.out.print(" ");
			    	  k++;
			    	  ;
			      }
			      k=0;
			      System.out.println();
				}
				//upperHalf--;
				
				int height=upperHalf-1; 
			     for( ;height>=1;height--)
			     {
			    	 for(int spaces = upperHalf; spaces>height; spaces--)
			    	 {
			    		 System.out.print(" ");
			    	 }
			    	 
			int k=0;
		      while(k!=(2*height-1))  // print *
		      {
		    	  if(k == 0 || k == 2*height-2)
		    	  System.out.print("*");
		    	  else
		    		  System.out.print(" ");
		    	  k++;
		    	  ;
		      }
		      k=0;
			     
			    	 System.out.println();
			    
			     
		      }
			     }
			
			}
			
		
		
		
		
	 

	public static void main(String[] args) {
		
    printRhombus(5, true);
     printRhombusUnfilled(5,false);
    
	}

}
