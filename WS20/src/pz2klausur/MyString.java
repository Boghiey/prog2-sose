package pz2klausur;



public class MyString {
	
	private char[] wort;
	
	

	public char[] getWort() {
		return wort;
	}


	public MyString()
	{
		MyString[] wort = new wort[0];
		this.wort = new wort[0];
	}

	
	public MyString(char tres)
	{
		this.wort= new wort[tres];
	}
	
	public MyString(String wert)
	{
		char a= wert.charAt(wort.length);
		this.wort= new wort[a];
		
	}
	
	
	@Override
	public String toString()
	{
		String s = wort[];
		return s;
		
	}

	public void print()
	{
		System.out.println(this.toString());
	}
	
	public int  getCharAt(int index)
	{
		String s= "hallo";
		for(index=0; index<wort.length;index++)
		{
		char b= s.charAt(index);
				
		//index=0;
		//if (index!=wort[index])
		
		System.out.print(b);
		}
	
		/*else 
		{
			return wort[index];
		}*/
	}
	
		public boolean contains(char c)
		{
			for(int a=0; a<wort.length; a++)
			{
				
			}

		}
		
		@Override
		public boolean equals(Object o)
		{
			if(this ==o) return true;
			else 
			{
				return false;
			}
			
		}
	
		// teil 2
		
		public int getAsciiCodeOfCharAt(int index)
		{
			
		}
		
		public char append(char c)
		{
			c= 'c';
		     
			for(int a=0; a<wort.length;a++)
			{
				this.wort=addc()
				wort[a] = (char)
				System.out.println(wort +"c");
			}
		}
		
		public  append(MyString s)
		{
		     
			for(int a=0; a<wort.length;a++)
			{
				System.out.println(wort +s);
			}
		}
		
		public MyString concat(MyString s1, MyString s2)
		{
			
			return this.wort;
		}
		
		public void firstIndexOf(char c)
		{
			for(int a=0; a<wort.length,a++)
			{
				
			}
		}
		
		
		public void firstIndexOf(char c)
		{
			for(int a=0; a<wort.length,a++)
			{
				
			}
		}
		public MyString substring(int beginIndex)
		{
			this.wort= new wort;
			
		}
	
		public void substring(int beginIndex, int endIndex)
		{
			return this.wort;
		}
		
		public void toUpperCase()
		{
			
		}
		
		public void reverse()
		{
			for(int a =0;a<wort.length; a++)
			{
				
			}
		}
		
		public void contains(MyString s)
		{
			
		}
		
}
