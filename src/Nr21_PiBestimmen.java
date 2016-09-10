import java.util.Scanner;

public class Nr21_PiBestimmen {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie viele Punkte sollen erstellt werden?");
		//long anzahl = scanner.nextLong();
		int nPunkte = 1000;
		
		int nInnen = 0;
		
		double x;
		double y;
		for (int i = 0; i < nPunkte; i++) {
			x = Math.random(); 
			y = Math.random();
			if( (x*x + y*y) < 1){
				nInnen = nInnen + 1;
			}
		}
		System.out.println(nInnen);
		System.out.println(nPunkte);
		double pi = ((double)nInnen / (double)nPunkte) * 4;
		
		System.out.println("Ausgerechnetes Pi: " + pi);
		System.out.println("Abweichung zum echten Pi = " + (pi - Math.PI));
	}

}
