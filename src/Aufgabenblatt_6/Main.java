package Aufgabenblatt_6;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		Buch b1;
		Buch b2;
		
		b1 = new Buch();
		b2 = new Buch();
		
		// a.)
		System.out.println(b1);
		System.out.println(b2);
		
		// b.) b1 = Buch@1db9742, b2 = Buch@106d69c
		
		// b.)
		//Korrektur
		System.out.println("Buch b1:");
		System.out.println("Titel: " + b1.titel);
		System.out.println("Genre: " + b1.genre);
		System.out.println("Autor: " + b1.autor);
		System.out.println("ISBN: " + b1.isbn);
		System.out.println("Kaufpreis: " + b1.kaufpreis);
		
		System.out.println();
		System.out.println("Buch b2:");
		System.out.println("Titel: " + b2.titel);
		System.out.println("Genre: " + b2.genre);
		System.out.println("Autor: " + b2.autor);
		System.out.println("ISBN: " + b2.isbn);
		System.out.println("Kaufpreis: " + b2.kaufpreis);
		
		// c.) s.o.
		b1.autor = "Goethe";
		b1.genre = "Tragödie";
		b1.titel = "Faust";
		b1.isbn = 123456789;
		b1.kaufpreis = 9.99;
		
		b2.autor = "Schiller";
		b2.genre = "Ballade";
		b2.titel = "Die Glocke";
		b2.isbn = 987654321;
		b2.kaufpreis = 14.99;
		
//		System.out.println(b1);
//		System.out.println(b2);
		// Korrektur
		System.out.println("Buch b1:");
		System.out.println("Titel: " + b1.titel);
		System.out.println("Genre: " + b1.genre);
		System.out.println("Autor: " + b1.autor);
		System.out.println("ISBN: " + b1.isbn);
		System.out.println("Kaufpreis: " + b1.kaufpreis);
		
		System.out.println();
		System.out.println("Buch b2:");
		System.out.println("Titel: " + b2.titel);
		System.out.println("Genre: " + b2.genre);
		System.out.println("Autor: " + b2.autor);
		System.out.println("ISBN: " + b2.isbn);
		System.out.println("Kaufpreis: " + b2.kaufpreis);
		System.out.println();
		
		// d.) 
		b1.autor = scan.nextLine();
		b1.genre = scan.nextLine();
		b1.titel = scan.nextLine();
		b1.isbn = scan.nextLong();
		b1.kaufpreis = scan.nextDouble();
		
		b2.autor = scan.nextLine();
		b2.genre = scan.nextLine();
		b2.titel = scan.nextLine();
		b2.isbn = scan.nextLong();
		b2.kaufpreis = scan.nextDouble();
		
		// e.)
		Buch[] buecher = new Buch[2];
		buecher[0] = b1;
		buecher[1] = b2;
		System.out.println("Ausgabe vor Tausch");
		System.out.println("Buch 1 Titel: " + buecher[0].titel);
		System.out.println("Buch 1 Titel: " + buecher[1].titel);
		System.out.println();
		
		// f.) Richtig :)!
		buecher[0] = b2;
		buecher[1] = b1;
		
		// Durch eine Testausgabe hättest du vielleicht gesehen, dass es richtig war :)
		System.out.println("Ausgabe nach Tausch");
		System.out.println("Buch 1 Titel: " + buecher[0].titel);
		System.out.println("Buch 1 Titel: " + buecher[1].titel);
		System.out.println();
		
		
		
		// g.) Auch richtig
		long x = b1.isbn;
		long y = b2.isbn;
		 
		b2.isbn = x;
		b1.isbn = y;

		// Ausgabe zur Überprüfung
		System.out.println("b1 ISBN: " + b1.isbn);
		System.out.println("b2 ISBN: " + b2.isbn);
		System.out.println();
		 
		
		// h.) 
		System.out.println("Liste:");
		for (int i = 0; i < buecher.length; i++) {
			System.out.println("Buch " + i + ":");
			System.out.println("Titel: " + buecher[i].titel);
			System.out.println("Genre: " + buecher[i].genre);
			System.out.println("Autor: " + buecher[i].autor);
			System.out.println("ISBN: " + buecher[i].isbn);
			System.out.println("Kaufpreis: " + buecher[i].kaufpreis);
			System.out.println("--------------");
		}
		 
		 
	
	}
}
