import java.util.Scanner;

public class GGT {

	public static void main(String[] args) {

		//Zahl 1 und Zahl 2
		int x;
		int y;
		int ggt;
		
		Scanner scanner = new Scanner(System.in);
		
		do{
					
			System.out.println("Bitte geben Sie zwei Zahlen ein, von denen der gr��te gemeinsame Teiler ermittelt werden soll");
			System.out.println("1. Zahl:");
			x = scanner.nextInt();
			
			System.out.println("2. Zahl:");
			y = scanner.nextInt();
			
			if (x > y) {
				ggt = y;
			}else {
				ggt = x;
			}
			
			boolean b = false;
			
			//L�sung mit Do-Schleife
			/*do {
				b = (x % ggt == 0 && y % ggt == 0);
				
				if(!b){
					ggt = ggt - 1;
				}
			} while (!b);*/
			
			//L�sung mit While-Schleife
			while(!b){
				b = (x % ggt == 0 && y % ggt == 0);
				
				if(!b){
					ggt = ggt - 1;
				}
			};
			
			System.out.println("Der gr��te gemeinsame Teiler ist: " + ggt);
		
		}while(true);
		
	}

}
