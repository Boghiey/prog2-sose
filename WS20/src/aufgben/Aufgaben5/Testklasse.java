package aufgben.Aufgaben5;

public class Testklasse {

	public static void main(String[] args) {
	
		Triangle t1 = new Triangle(3, 4, 5);
		Triangle t2 = new Triangle(4, 4, 7);
		Triangle t3 = new Triangle(5, 5, 5);
		Triangle t4 = new Triangle(4, 5, 3);
		Triangle t5 = new Triangle(4, 3, 5);
		Triangle t6 = new Triangle(3, 4, 5);
		
		

		t1.print();
		t1.circumference();
		t1.area();
		t1.equilateral();
		t1.isosceles();
		System.out.println();
		
		t2.print();
		t2.circumference();
		t2.area();
		t2.equilateral();
		t2.isosceles();
		System.out.println();
		
		t3.print();
		t3.circumference();
		t3.area();
		t3.equilateral();
		//t3.isosceles();
		System.out.println();
		
		t4.print();
		t4.circumference();
		t4.area();
		t4.equilateral();
		t4.isosceles();
		System.out.println();
		
		t5.print();
		t5.circumference();
		t5.area();
		t5.equilateral();
		t5.isosceles();
		System.out.println();
		
		t6.print();
		t6.circumference();
		t6.area();
		t6.equilateral();
		t6.isosceles();
		System.out.println();
		
		System.out.println("t1 und t2 gleicher Umfang ? :" + t1.sameCircumference(t2));
		System.out.println("t1 und t2 gleicher Umfang ? :" + t1.sameCircumference(t3));
		System.out.println("t1 und t2 gleicher Umfang ? :" + t2.sameCircumference(t3));
		System.out.println();
		
		System.out.println("t1 kleiner als t2 ? :" + t1.isSmaller(t2));
		System.out.println("t2 kleiner als t1 ? :" + t1.isSmaller(t2));
		System.out.println("t1 kleiner als t4 ? :" + t1.isSmaller(t2));
		System.out.println("t4 kleiner als t1 ? :" + t1.isSmaller(t2));
		System.out.println();
		
		
		System.out.println("t1 groesser als t2 ? :" + t1.isBigger(t2));
		System.out.println("t2 groesser als t1 ? :" + t2.isBigger(t1));
		System.out.println("t1 groesser als t4 ? :" + t1.isBigger(t4));
		System.out.println("t4 groesser als t1 ? :" + t4.isBigger(t1));
		
		
	}
	
	

}
