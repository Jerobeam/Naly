
public class IfVerzweigungen {

	public static void main(String[] args) {

		int zufallszahl; //Erstelle eine Zufallszahl
		zufallszahl = (int)(Math.random()*100); //Gebe der Zufallszahl einen zuf�lligen Wert zwischen 1 und 100
		System.out.println("Zufallszahl: " + zufallszahl);
		
		if(zufallszahl == 4){ //�berpr�fe, ob die Zufallszahl gleich 4 ist
			System.out.println("Das ist meine Lieblingszahl"); //Ist die Zufallszahl gleich 4 gebe diesen Text aus
			
		//Ist die Zufallszahl nicht gleich 4, so �berpr�fe die Bedingung der n�chsten Verzweigung
		}else if(zufallszahl > 80){ //�berpr�fe, ob die Zufallszahl gr��er als 80 ist
			System.out.println("Die Zufallszahl ist gr��er als 80");
			
		//Ist die Zufallszahl nicht gr��er als 80, so �berpr�fe die Bedingung der n�chsten Verzweigung
		}else if(zufallszahl > 20 && zufallszahl < 60){ //�berpr�fe, ob die Zufallszahl gr��er als 20 und gleichzeitig kleiner als 60 ist
			System.out.println("Die Zufallszahl liegt zwischen 20 und 60");
			
		//Ist die Zufallszahl nicht gr��er als 20 und gleichzeitig kleiner als 60, so �berpr�fe die Bedingung der n�chsten Verzweigung
		}else if(zufallszahl == 1 || zufallszahl == 2 || zufallszahl == 3){ //�berpr�fe, ob die Zufallszahl gleich 1 oder 2 oder 3 ist
			System.out.println("Die Zufallszahl ist gleich 1 oder 2 oder 3");
		
		//Wird keine der Bedingungen erf�llt, so f�hre den Code des else-Blocks aus
		}else{
			System.out.println("Die Zufallszahl erf�llt keine der Bedingungen");
		}
		
	}

}
