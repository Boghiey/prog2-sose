package uebungen.uebung0;

public class Uebung1 {

	 public static void printInDivision(int nr1, int nr2)
	 {	
	int division= nr1/nr2;
	int rest=nr1%nr2;
	
    if (rest==0)
    {
	   System.out.println(nr1 + " geteilt durch " + nr2 + " ergibt " + division + " ohne rest"); 
    } else {
    System.out.println(nr1 + " geteilt durch " + nr2 + " ergibt " + division + ". Es bleibt ein Rest von " + rest); 
    }
	 }
	 
	 public static int getQuotient(int nr1, int nr2)
	 {
		int kut=nr1/nr2; 
		System.out.println(nr1 + "/" + nr2+ " =" + kut);
		return kut;
	 }

	 public static int getRemainder(int nr1, int nr2)
	 {
		 int art=nr1%nr2;
		 System.out.println(nr1 + " mod " + nr2+ " = " + art);
	     return art;
	 }
	 
	 
	 
	 
	public static void main(String[] args)
	{
	int num =123;
	long zahl=456789;
	char gee='6';
	byte tee=127;
	short cas=32767;
	float ter=4.23f;
	double wer=6.98;
	boolean rt=true;
	String zut="Hallo";
	
	num=2147483647;
	num++;
	
	zahl=1234567890;
	zahl++;
	System.out.println(num);
	System.out.println(zahl);
	System.out.println(gee);
	System.out.println(tee);
	System.out.println(cas);
	System.out.println(ter);
	System.out.println(wer);
	System.out.println(rt);
	System.out.println(zut);
	
	printInDivision(7,4);
	printInDivision(17,4);
	printInDivision(16,4);
	getQuotient(17,4);
	getRemainder(17,4);
	}
    
	
		

	
}
