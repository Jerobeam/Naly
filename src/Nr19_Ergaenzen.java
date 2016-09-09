import java.util.Scanner;

public class Nr19_Ergaenzen {

	public static void main(String[] args) {
		
		int [] input = {5, 18, 5, 7, 4, 110, 2013, 14041997};
		
		//a)
		System.out.println("a)");
		System.out.println();
		System.out.println("Feldinhalt:");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		//b)
		System.out.println("b)");
		System.out.println();
		
		if(input.length == 0){
			System.out.println(Integer.MAX_VALUE);
		}else{
			int max = input[0];
			for (int i = 0; i < input.length; i++) {
				if(max > input [i]){
					max = input[i];
				}
			}
			System.out.println("Minimalwert im Feld = " + max);
		}
		System.out.println("---------------------------");
		System.out.println();
		
		//c)
		System.out.println("c)");
		System.out.println();
		
		boolean enthaelt_gerade_zahl = false;
		for (int i = 0; i < input.length; i++) {
			if(input[i]%2 == 0){
				enthaelt_gerade_zahl = true;
				break;
			}
		}
		System.out.println("Gerade Zahl vorhanden: " + enthaelt_gerade_zahl);
		System.out.println("---------------------------");
		System.out.println();
		
		//d)
		System.out.println("d)");
		
		boolean alle_gerade = true;
		for (int i = 0; i < input.length; i++) {
			if(input[i]%2 == 1){
				alle_gerade = false;
				break;
			}
		}
		System.out.println("Alle Zahlen gerade: " + alle_gerade);
		System.out.println("---------------------------");
		System.out.println();
		
		//e)
		System.out.println("e)");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gebe eine zu suchende Zahl ein: ");
		int n = scanner.nextInt();
		boolean zahl_vorhanden = false;
		
		for (int i = 0; i < input.length; i++) {
			if(input[i] == n){
				zahl_vorhanden = true;
				break;
			}
		}		
		System.out.println("Zahl " + n + " im Feld enthalten: " + zahl_vorhanden);
		System.out.println("---------------------------");
		System.out.println();
		
		//f)
		System.out.println("f)");
		int kleinster_index = -1;
		for (int i = 0; i < input.length; i++) {
			if(input[i] == n){
				kleinster_index = i;
				break;
			}
		}
		System.out.println("Kleinster Index der zu suchenden Zahl: " +  kleinster_index);
		System.out.println("---------------------------");
		System.out.println();
		
		//g)
		System.out.println("g)");
		System.out.println("Werte des neuen Feldes: ");
		for (int i = 0; i < input.length; i++) {
			if(input[i]%2 == 0){
				input[i] = input[i] / 2;
			}
			System.out.print(input[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		//h)
		System.out.println("h)");
		int[] feld_kopie = new int[input.length];
		
		System.out.println("Kopie des Feldes: ");
		for (int i = 0; i < feld_kopie.length; i++) {
			feld_kopie[i] = input[i];
			System.out.print(feld_kopie[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		//i)
		System.out.println("i)");
		int [] inpA = {2, 6, 345, 11, 778, 34};
		int [] inpB = {2, 6, 345, 11, 778, 34};
		
		boolean felder_sind_gleich = true;
		
		if(inpA.length == inpB.length){
			for (int i = 0; i < inpA.length; i++) {
				if(inpA[i] != inpB[i]){
					felder_sind_gleich = false;
					break;
				}
			}
		}else{
			felder_sind_gleich = false;
		}
		System.out.println("InpA und InpB sind gleich: " + felder_sind_gleich);
		System.out.println("---------------------------");
		System.out.println();
		
		//j)
		System.out.println("j)");
		int [] inpC = {2, 6, 25, 11, 778, 34, 1, 51, 25345, 5};
		int [] inpD = {2, 6, 25, 11, 778, 34, 1, 51, 25345};
		
		int[] laengeres_feld;
		int[] kuerzeres_feld;
		
		if(inpC.length > inpD.length){
			laengeres_feld = inpC;
			kuerzeres_feld = inpD;
		}else{
			laengeres_feld = inpD;
			kuerzeres_feld = inpC;
		}
		
		boolean alle_felder_enthalten = true;
		
		for (int i = 0; i < kuerzeres_feld.length; i++) {
			for (int j = 0; j < laengeres_feld.length; j++) {
				if(kuerzeres_feld[i] == laengeres_feld[j]){
					alle_felder_enthalten = true;
					break;
				}else{
					alle_felder_enthalten = false;
				}
			}
		}
		
		System.out.println("Alle Elemente von dem kleineren Feld in dem größeren Feld enthalten: " + alle_felder_enthalten);
		System.out.println("---------------------------");
	}

}
