package pz2klausur;

public class Testklasse {

	public static void main(String[] args) {
		System.out.printf("%n%n----------------------Test MyString teil 1 -------------------%n%n");
		MyString s1 = new MyString();
		MyString s2 = new MyString('a');
		
		MyString s3 = new MyString("Hallo");
		
		
		
		
		s1.print();
		s2.print();
		s3.print();
		
		System.out.printf("%n%n----------------------Test MyString teil 2 --------------------%n%n");
	
		System.out.println("Ascii-Code Zeichen aus s3 mit index 1 = "+ s3.getAsciiCodeOfCharAt(1));
		
		System.out.println(s3.append(c));
		
		MyString s6= new MyString("ballo");
		System.out.println(s6.append(s));
		
		MyString s4 = new MyString("hallo");
		MyString s5 = new MyString("halLo");
		
		System.out.println("s3 gleich s4 ?" + s3.equals(s4));
		System.out.println("s3 gleich s4 ?" + s3.equals(s4));
		
		System.out.printf("%n%n----------------------Test MyString teil 3 --------------------%n%n");
		System.out.println();
		System.out.println();
		
		s3.substring(1, 3)
		s3.toUpperCase();
		s3.reverse();
		s3.contains(s);
	}

}
