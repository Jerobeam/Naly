import java.util.Scanner;

public class Nr20_LaufspielSpielfeld {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		char [][] spielfeld = {
								{'O', 'O', 'O', 'O', 'O', 'O', 'O'},
								{'O', 'O', 'O', 'O', 'O', 'O', 'O'},
								{'O', 'O', 'O', 'O', 'O', 'O', 'O'},
								{'O', 'O', 'O', 'O', 'O', 'O', 'O'},
								{'O', 'O', 'O', 'O', 'O', 'O', 'O'},
								{'O', 'O', 'O', 'O', 'O', 'O', 'O'},
								{'O', 'O', 'O', 'O', 'O', 'O', 'O'}
								};
		
		//Zielposition
		int a = (int)Math.round(1 + Math.random()*6);
		int b = (int)Math.round(1 + Math.random()*6);
		
		//Male Zielposition in Spielfeld
		spielfeld[b-1][a-1] = 'Z';
				
		//Startposition
		int x;
		int y;
		//Ermittle solange eine neue Startposition, bis die Startposition nicht gleich der Zielposition ist
		do{
			x = (int)Math.round(1 + Math.random()*6);
			y = (int)Math.round(1 + Math.random()*6);
		}while(x == a && y == b);
		
		//Male Startposition in Spielfeld
		spielfeld[y-1][x-1] = 'S';
		
		//Versuchezähler
		int versuche = 0;
		
		//Zum testen kannst du dir die Start und Zielpositionen ausgeben lassen ;)
		//System.out.println("Startposition: (" + x + ", " + y + ")");
		//System.out.println("Zielposition: (" + a + ", " + b + ")");
		
		//Solange die Positionen nicht übereinstimmen, führe die While Schleife aus
		while(!(x == a && y == b)){
			//Berechne die Distanz zwischen den beiden Punkten und gebe diese aus
			double abstand = Math.sqrt( Math.pow((a - x), 2) + Math.pow((b - y), 2) );
			System.out.println("Die Distanz zwischen Start und Ziel beträgt " + abstand);
			
			System.out.println();
			maleSpielfeld(spielfeld);
			System.out.println();
			
			System.out.println("In welche Richtung möchtest du laufen (1 - nach oben | 2 - nach unten | 3 - nach links | 4 - nach rechts)?");
			int richtung = scanner.nextInt();
			versuche = versuche + 1;
			
			if(richtung == 1){
				//Verhindere, dass der Spieler aus dem Spielfeld herausläuft
				if(y < 7){
					//Aktualisiere das Spielfeld
					spielfeld[y-1][x-1] = 'O';
					spielfeld[y][x-1] = 'S';
					
					//Aktualisiere Spielerposition
					y = y + 1;
					System.out.println("Du läufst eins nach oben");
				}else{
					System.out.println("Du bist schon am oberen Rand. Du kannst nicht noch weiter nach oben.");
				}
				
			}else if(richtung == 2){
				//Verhindere, dass der Spieler aus dem Spielfeld herausläuft
				if(y > 1){
					//Aktualisiere das Spielfeld
					spielfeld[y-1][x-1] = 'O';
					spielfeld[y-2][x-1] = 'S';
					
					//Aktualisiere Spielerposition
					y = y - 1;
					System.out.println("Du läufst eins nach unten");
				}else{
					System.out.println("Du bist schon am unteren Rand. Du kannst nicht noch weiter nach unten.");
				}
				
			}else if(richtung == 3){
				//Verhindere, dass der Spieler aus dem Spielfeld herausläuft
				if(x > 1){
					//Aktualisiere das Spielfeld
					spielfeld[y-1][x-1] = 'O';
					spielfeld[y-1][x-2] = 'S';
					
					//Aktualisiere Spielerposition
					x = x - 1;
					System.out.println("Du läufst eins nach links");
				}else{
					System.out.println("Du bist schon am linken Rand. Du kannst nicht noch weiter nach links.");
				}
				
			}else if(richtung == 4){
				//Verhindere, dass der Spieler aus dem Spielfeld herausläuft
				if(x < 7){
					//Aktualisiere das Spielfeld
					spielfeld[y-1][x-1] = 'O';
					spielfeld[y-1][x] = 'S';
					
					//Aktualisiere Spielerposition
					x = x + 1;
					System.out.println("Du läufst eins nach rechts");
				}else{
					System.out.println("Du bist schon am rechten Rand. Du kannst nicht noch weiter nach rechts.");
				}

			}else{
				System.out.println("Unzulässige Eingabe.");
			}
			
			System.out.println("Position: (" + x + ", " + y + ")");
		}
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Glückwunsch, du hast das Ziel erreicht. Du hast " + versuche + " Versuche gebraucht. Party!");
		System.out.println("-----------------------------------------------------------------------------");
		
	}
	
	public static void maleSpielfeld(char [][] spielfeld){
		for (int i = spielfeld.length-1; i >= 0; i--) {
			for (int j = 0; j < spielfeld[0].length; j++) {
				System.out.print(spielfeld[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
