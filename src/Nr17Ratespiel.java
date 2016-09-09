import java.util.Scanner;

public class Nr17Ratespiel {

	public static void main(String[] args) {

		//Erstelle Zufallszahl
		int random = (int)Math.round(1 + Math.random()*999);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Errate die Zahl zwischen 1 und 1000");
		
		int eingabe;
		int versuche = 0;
		do{
			System.out.println("Zahl eingeben: ");
			versuche = versuche + 1;
			eingabe = scanner.nextInt();
			
			if(eingabe < 1 || eingabe > 1000){
				System.out.println("Unzulässige Eingabe");
			}else if(eingabe == random){
				System.out.println("Richtig. Du hast " + versuche + " Versuch(e) gebraucht.");
			}else if (eingabe > random) {
				System.out.println("Die Zufallszahl ist kleiner als deine Eingabe");
			}else if (eingabe < random) {
				System.out.println("Die Zufallszahl ist größer als deine Eingabe");
			}
		}while(random != eingabe);
		
	}

}
