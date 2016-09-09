import java.util.Scanner;

public class Nr18_Computerspieler {

	public static void main(String[] args) {
		
		System.out.println("Der Computerspieler");
		System.out.println("-------------------");
		System.out.println("Überlege dir eine Zahl zwischen 1 und 1000 aus, und ich versuche, sie zu erraten.");
		System.out.println("Ich sage dir dann eine Zahl und du musst mir sagen, ob die Zahl in deinem Kopf größer (+), kleiner (-) oder gleich (=) ist.");
		System.out.println("-------------------");
		
		int untergrenze = 1;
		int obergrenze = 999;
		int ratewert = 500;
		
		int versuche = 1;
		Scanner scanner = new Scanner(System.in);
		String input;
		
		do{
			System.out.println("Ist deine Zahl = " + ratewert + "?");
			input = scanner.nextLine();
			
			if(input.equals("+")){
				
				//Beschimpfe den Spieler, wenn er eine inkonsistente Eingabe macht
				if(!(ratewert == ratewert + ( (obergrenze - ratewert)/2 ))){
					//Aktualisiere Ratewert und grenze das Suchgebiet neu ein
					untergrenze = ratewert;
					ratewert = ratewert + ( (obergrenze - ratewert)/2 );
					versuche = versuche + 1; 
				}else{
					System.out.println("Lüge!");	
				}
				
			}else if(input.equals("-")){
				
				//Beschimpfe den Spieler, wenn er eine inkonsistente Eingabe macht
				if(!(ratewert == ratewert + ( (untergrenze - ratewert) /2 ))){
					//Aktualisiere Ratewert und grenze das Suchgebiet neu ein
					obergrenze = ratewert;
					ratewert = ratewert + ( (untergrenze - ratewert) /2 );
					versuche = versuche + 1; 
				}else{
					System.out.println("Lüge!");
				}
				
			}else if(!input.equals("=")){
				System.out.println("Unzulassige Eingabe");
			}

		}while(!input.equals("="));
		
		System.out.println("Juhu! Ich habe " + versuche + " Versuch(e) gebraucht.");
		
	}

}
