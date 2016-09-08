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
		
		System.out.println("Bitte geben sie den Wert für a ein (Dezimalstellen mit Komma trennen): ");
		//Lese a ein
		a = input.nextDouble();
		System.out.println();
		
		System.out.println("Bitte geben sie den Wert für b ein (Dezimalstellen mit Komma trennen): ");
		//Lese b ein
		b = input.nextDouble();
		System.out.println();
		
		System.out.println("Bitte geben sie den Wert für c ein (Dezimalstellen mit Komma trennen): ");
		//Lese c ein
		c = input.nextDouble();
				
		//Gebe aktuelle Gleichung aus
		System.out.println();
		System.out.println("|"+ a + "x + " + b + "| = " + c);
		System.out.println();
		
		//Überprüfe die 4 verschiedenen Fälle
		//1. Keine Lösung: c < 0 oder a = 0 & b != c
		if(c < 0 || (a == 0 && b != c)){
			System.out.println("Keine Lösung für x.");
		}
		//2. Unendliche viele Lösungen: |b| = c & a = 0 & c >= 0
		//Math.abs(b) gibt den Betrag von b zurück
		//Hier müssen wir nicht nochmal überprüfen, ob c größer 0 ist, da dieser Fall schon in der if-Verzweigung davor abgefangen wurde
		else if (Math.abs(b) == c && a == 0) {
			System.out.println("Unendlich viele Lösungen für x.");
		}
		//3. 1 Lösung: c = 0
		//Hier müssen wir auch nicht nochmal überprüfen, ob c größer 0 ist
		else if (c == 0) {
			//Berechne x
			x1 = -(b/a);
			System.out.println("1 Lösung für x: " + x1);
		}
		//4. 2 Lösungen: c > 0 & a != 0  bzw. in allen anderen Fällen
		else{
			//Berechne x1
			x1 = (c-b)/a;
			
			//Berechne x2
			x2 = (-c-b)/a;
		
			System.out.println("2 Lösungen für x: " + x1 + " und " + x2);
		}
	}

}
