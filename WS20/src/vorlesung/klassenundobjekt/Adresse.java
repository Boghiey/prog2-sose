package vorlesung.klassenundobjekt;

public class Adresse
{
    // --- Objektvariablen -----
    private String strasse;         // Zugriff nur innerhalb der Klasse
    private int nummer;             // Zugriff nur innerhalb der Klasse
    private int postleitzahl;       // Zugriff nur innerhalb der Klasse
    private String wohnort;         // Zugriff nur innerhalb der Klasse

 // --- Konstruktor ---------
    public Adresse(String str, int nr, int plz, String ort)
    {
        strasse = str;
        nummer = nr;
        postleitzahl = plz;
        wohnort = ort;
    }
    
    // --- Objektmethoden ------
    public String getAdresse()
    {
        return strasse + " " + nummer + " in " + postleitzahl + " " + wohnort;
    }       
}
