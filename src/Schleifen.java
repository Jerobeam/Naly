
public class Schleifen {

	public static void main(String[] args) {
		//Die folgenden 3 Schleifenbeispiele haben alle das gleiche Ziel: Die Zahlen von 1-10 auszugeben
		
		//While-Schleife:
		System.out.println("While-Schleife:");
		System.out.println("---------------");
		int i = 1; //Erstelle einen Zähler und gebe ihm initial den Wert 1

		while(i <= 10){ //Solange i kleiner gleich 10 ist, soll die Schleife ausgeführt werden
			System.out.println(i); //Gebe den Wert von i aus
			i++; //Erhöhe i um den Wert 1 ("i++" macht das gleiche wie "i=i+1")
		}
		
		System.out.println();
		
		//Do-While-Schleife
		System.out.println("Do-While-Schleife:");
		System.out.println("------------------");
		int j = 1; //Erstelle einen Zähler und gebe ihm initial den Wert 1
		
		do{
			System.out.println(j); //Gebe den Wert von j aus
			j++; //Erhöhe j um den Wert 1
		}while(j<=10);
		
		System.out.println();
		
		//For-Schleife
		System.out.println("For-Schleife:");
		System.out.println("-------------");
		
		//Hier muss diesesmal kein Zähler extra erstellt werden, da er in der Schleife selbst erstellt wird ("int k = 0")
		for (int k = 0; k <= 10; k++) { //Erstellt den Zähler k mit dem Anfangswert 0. Die Schleife wird wiederholt, solange k kleiner gleich 10 ist.
										//Nach jedem Schleifendurchgang wird k um 1 erhöht
			System.out.println(k); //Gebe den Wert von k aus
		}
	}

}
