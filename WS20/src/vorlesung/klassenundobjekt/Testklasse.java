package vorlesung.klassenundobjekt;

public class Testklasse {
	public static void main(String[] args)
    {
		 Adresse adresse1 = new Adresse("Wilhelminenhofstr.", 75, 12459, "Berlin");          
	     Adresse adresse2 = new Adresse("Treskowallee", 8, 10318, "Berlin");      
       Adresse adresse3 = new Adresse("Alexanderplatz", 6, 11234,"Berlin");
	    /*
	    Adresse adresse1 = new Adresse();       // erstes Objekt erzeugt
        Adresse adresse2 = new Adresse();       // zweites Objekt erzeugt
        Adresse adresse3 = new Adresse();
    
        adresse1.strasse = "Wilhelminenhofstr.";
        adresse1.nummer = 75;
        adresse1.postleitzahl = 12459;
        adresse1.wohnort = "Berlin";

        adresse2.strasse = "Treskowallee";
        adresse2.nummer = 8;
        adresse2.postleitzahl = 10318;
        adresse2.wohnort = "Berlin";
        
        adresse3.strasse = "Alexanderplatz";
        adresse3.nummer = 6;
        adresse3.postleitzahl = 11234;
        adresse3.wohnort = "Berlin";
        
        */

        System.out.println(adresse1.getAdresse());
        System.out.println(adresse2.getAdresse());
        System.out.println(adresse3.getAdresse());
        
    }

}
