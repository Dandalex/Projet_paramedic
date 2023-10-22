package fonctions;
import java.util.Scanner;



public class Poids {
	public static void main(String[] args) {
	System.out.println("Entrer le poids");
	Scanner scan = new Scanner(System.in);
	double poids = scan.nextDouble();
	System.out.println("terminer votre ligne avec k pour Kilogrammes, ou l pour livres");
	char unite = scan.next().charAt(0);
	
		if (unite=='l'||unite=='L') {
			poids= lbsToKg (poids);
			unite = 'k';
		}		
		System.out.println();
		System.out.printf("Le poids est %.2f ",poids);
		System.out.print(unite);
		
	}


	public static double lbsToKg (double x) {
		// TODO Auto-generated method stub
		x=x/2.2;
		return x;
	}
	public static double kgToLbs (double x) {
		// TODO Auto-generated method stub
		x=x*2.2;
		return x;
	}
	

}
