package uebung.uebung1;

public class Uebung1 {
	
	public static void printIntDivision(int nr1, int nr2) 
	{
		int k=nr1;
		int l=nr2;
		int v=k/l;
		int x=k%l; 
		if (x==0) {
		System.out.println(k+" geteilt durch "+l+" ergibt "+v+" ohne Rest.");
	}
	 else 
	
	{
		 System.out.println(k+" geteilt durch "+l+" ergibt "+v+". Es bleibt ein rest von "+x);
	}
	}
		


	public static void main(String[] args) {
		int a=123;
		long b=456789;
		char c='a';
		byte d=127;
		short e=32767;
		float f=4.23f;
		double g=6.98;
		boolean h=true;
		String j="Hallo!";
		
		a=2147483647;
		b=2147483647;
		c='6';
		
		int gee= 17;
		int vee=4;
		int ans= gee/vee;
		int mod= gee%vee;
		
		
		System.out.println("Wert vom Typ int        : "+a);
		System.out.println("Wert vom Typ long       : "+ b);
		System.out.println("Wert vom Typ char       : "+ c);
		System.out.println("Wert vom Typ byte       : "+ d);
		System.out.println("Wert vom Typ short      : "+ e);
		System.out.println("Wert vom Typ float      : "+ f);
		System.out.println("Wert vom Typ double     : "+ g);
		System.out.println("Wert vom Typ boolean    : "+ h);
		System.out.println("Wert vom Typ String     : "+ j);
		
		System.out.println();
		System.out.println(gee + "/"+ vee + " = " + ans);
		System.out.println(gee + " mod " + vee +" = "+ mod);
		
		System.out.println();
		printIntDivision(16,4); 

	}

}
