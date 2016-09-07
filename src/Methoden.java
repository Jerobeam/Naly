
public class Methoden {

	//Das ist die Methode, welche zur Ausf�hrung die Zahl a und Zahl b ben�tigt
	//Sie besagt, ob die Zahl a ein Teiler der Zahl b ist (ohne Rest)
	public static void istTeiler (int a, int b){
		//Berechne den Rest von b durch a
		int rest = b % a;
		
		//Ist der Rest = 0, dann ist a Teiler von b
		if(rest == 0){
			System.out.println("Die Zahl " + a + " ist Teiler von " + b);
		}else {
			System.out.println("Die Zahl " + a + " ist kein Teiler von " + b);
		}
	}

	public static void main(String[] args) {

		//Wenn ich die Methode anwenden will, brauche ich nur folgenden Code:
		istTeiler(4,6);
		
		//Ich kann die Methode so oft anwenden, wie ich will, ohne dabei jedes Mal erneut den den Rest zu berechnen und zu �berbr�fen
		istTeiler(10, 5);
		
		istTeiler(8, 32);
	}
}
