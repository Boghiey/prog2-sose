package aufgaben1;
//import javax.swing.JOptionPane;
import java.util.Random;

public class Aufgaben1 {

	//public static void main(String[] args) {
		


		/**

		 * Eine Klasse um Zufallszahlen zu "würfeln".

		 * Die Klasse generiert ganze 

		 * <a href="https://de.wikipedia.org/wiki/Pseudozufall">Pseudozufallszahlen</a>

		 * von 1 bis zu einem vorher festgelegten Maximum. Um einen normalen

		 * sechseitigen Würfel zu erzeugen benutzt man:

		 * <pre>

		 * Wuerfel w = new Wuerfel(6);

		 * </pre>

		 * Die ZUfallszahlen werden mit Hilfe von {@link java.util.Random} generiert.

		 *

		 * @author J. Neugebauer <schule@neugebauer.cc>

		 * @version 2018-05-05

		 */

		public class Wuerfel {

			

			private int seiten;


			private Random zufall;


			/**

			 * Konstruktor für Objekte der Klasse Wuerfel.

			 * @param pSeiten Anzahl der Seiten des Würfels.

			 */

			public Wuerfel( int pSeiten ) {

				seiten = pSeiten;

				zufall = new Random();

			}


			/**

			 * "Wirft" den Würfel

			 * Es wird eine Zufallszahl zwischen 1 und dem vorher festgelegten 

			 * Maximum (einschließlich) generiert.

			 * @return Eine Ganzzahl von 1 bis zum Maximum

			 * @see java.util.Random#nextInt(int)

			 */

			public int werfen() {

				// nextInt(int) generiert eine Zufallszahl n mit 0 <= n < 6

				return zufall.nextInt(seiten)+1;

			}

		}
	}

