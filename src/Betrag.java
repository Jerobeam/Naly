import java.util.Scanner;

public class Betrag {

	public static void main(String[] args) {
		
		//Initialisiere die Variablen
		double a;
		double b;
		double c;
		double x1;
		double x2;
		
		//Erstelle einen Scanner um Nutzereingaben in der Konsole entgegen zu nehmen
		Scanner input = new Scanner(System.in);
	
		System.out.println("Allgemeine Betragsgleichungen der Form |ax + b| = c");
		System.out.println("---------------------------------------------------");
		
		System.out.println("Bitte geben sie den Wert f�r a ein (Dezimalstellen mit Komma trennen): ");
		//Lese a ein
		a = input.nextDouble();
		System.out.println();
		
		System.out.println("Bitte geben sie den Wert f�r b ein (Dezimalstellen mit Komma trennen): ");
		//Lese b ein
		b = input.nextDouble();
		System.out.println();
		
		System.out.println("Bitte geben sie den Wert f�r c ein (Dezimalstellen mit Komma trennen): ");
		//Lese c ein
		c = input.nextDouble();
				
		//Gebe aktuelle Gleichung aus
		System.out.println();
		System.out.println("|"+ a + "x + " + b + "| = " + c);
		System.out.println();
		
		//�berpr�fe die 4 verschiedenen F�lle
		//1. Keine L�sung: c < 0 oder a = 0 & b != c
		if(c < 0 || (a == 0 && b != c)){
			System.out.println("Keine L�sung f�r x.");
		}
		//2. Unendliche viele L�sungen: |b| = c & a = 0 & c >= 0
		//Math.abs(b) gibt den Betrag von b zur�ck
		//Hier m�ssen wir nicht nochmal �berpr�fen, ob c gr��er 0 ist, da dieser Fall schon in der if-Verzweigung davor abgefangen wurde
		else if (Math.abs(b) == c && a == 0) {
			System.out.println("Unendlich viele L�sungen f�r x.");
		}
		//3. 1 L�sung: c = 0
		//Hier m�ssen wir auch nicht nochmal �berpr�fen, ob c gr��er 0 ist
		else if (c == 0) {
			//Berechne x
			x1 = -(b/a);
			System.out.println("1 L�sung f�r x: " + x1);
		}
		//4. 2 L�sungen: c > 0 & a != 0  bzw. in allen anderen F�llen
		else{
			//Berechne x1
			x1 = (c-b)/a;
			
			//Berechne x2
			x2 = (-c-b)/a;
		
			System.out.println("2 L�sungen f�r x: " + x1 + " und " + x2);
		}
	}

}
