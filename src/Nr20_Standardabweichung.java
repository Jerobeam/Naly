import java.util.Scanner;

public class Nr20_Standardabweichung {

	public static void main(String[] args) {

		int[] p = { 2, 3, 5, 7, 11, 13, 17, 19 };

		// Berechne Mittwert x
		double mittelwert = berechneMittelwert(p);
		System.out.println("Mittelwert für Feld 1: " + mittelwert);

		// Berechne Varianz
		double var = berechneVarianz(p, mittelwert);
		System.out.println("Varianz für Feld 1: " + var);

		// Berechne Standardabweichung
		double roh = Math.sqrt(berechneVarianz(p, mittelwert));
		System.out.println("Standardabweichung für Feld 1: " + roh);

		System.out.println("-------------------------------------------");

		// Würfelexperiment
		int[] wuerfel = new int[6000];
		// Würfelfeld füllen
		for (int i = 0; i < wuerfel.length; i++) {
			wuerfel[i] = 1 + (int) (Math.round(Math.random() * 5));
		}

		// Berechne Mittwert x
		mittelwert = berechneMittelwert(wuerfel);
		System.out.println("Mittelwert für Würfelexperiment: " + mittelwert);

		// Berechne Varianz
		var = berechneVarianz(wuerfel, mittelwert);
		System.out.println("Varianz für Würfelexperiment: " + var);

		// Berechne Standardabweichung
		roh = Math.sqrt(berechneVarianz(wuerfel, mittelwert));
		System.out.println("Standardabweichung für Würfelexperiment: " + roh);

		System.out.println("-------------------------------------------");

		// Nutzer darf Anzahl angeben
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie oft soll der Würfel gewirft werden?");
		int anzahl = scanner.nextInt();

		int[] wuerfel2 = new int[anzahl];
		int[] histogram = { 0, 0, 0, 0, 0, 0 };
		// Würfelfeld2 füllen
		for (int i = 0; i < wuerfel2.length; i++) {
			wuerfel2[i] = 1 + (int) (Math.round(Math.random() * 5));
			histogram[wuerfel2[i] - 1] = histogram[wuerfel2[i] - 1] + 1;
		}

		// Berechne Mittwert x
		mittelwert = berechneMittelwert(wuerfel2);
		System.out.println("Mittelwert für Würfelexperiment: " + mittelwert);

		// Berechne Varianz
		var = berechneVarianz(wuerfel2, mittelwert);
		System.out.println("Varianz für Würfelexperiment: " + var);

		// Berechne Standardabweichung
		roh = Math.sqrt(berechneVarianz(wuerfel2, mittelwert));
		System.out.println("Standardabweichung für Würfelexperiment: " + roh);

		System.out.println("-------------------------------------------");

		// Berechne Mittwert x
		mittelwert = berechneMittelwert(histogram);
		System.out.println("Mittelwert des Histogramms: " + mittelwert);

		// Berechne Varianz
		var = berechneVarianz(histogram, mittelwert);
		System.out.println("Varianz des Histogramms: " + var);

		// Berechne Standardabweichung
		roh = Math.sqrt(berechneVarianz(histogram, mittelwert));
		System.out.println("Standardabweichung des Histogramms: " + roh);
		
	}

	private static double berechneMittelwert(int[] feld) {
		double x = 0;
		for (int i = 0; i < feld.length; i++) {
			x = x + ((1.0 / feld.length) * feld[i]);
		}
		return x;
	}

	private static double berechneVarianz(int[] feld, double mittelwert) {
		double var = 0;
		for (int i = 0; i < feld.length; i++) {
			var = var + ((1.0 / (feld.length - 1)) * Math.pow((feld[i] - mittelwert), 2));
		}
		return var;

	}

}
