package cwiczenie_J91;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cwiczenie_J91 {

	public static void main(String[] args) {
		
		Scanner odczyt_z_klawiatury = new Scanner(System.in);
		
		int number = 0;
		
		boolean error = true;
		
		while(error){
			System.out.println("Podaj ca�kowit� (lub q - wyj�cie):");
			try{number = odczyt_z_klawiatury.nextInt();
			System.out.println("Zgaduje, �e Twoja podana liczba to: " + number);
			error = false;
			}catch(InputMismatchException e){
				if(odczyt_z_klawiatury.hasNext("q")){
					break;
				}else{
				System.out.println("Wprowadzona warto�� nie jest liczb� lub nie jest liczb� ca�kowit�. Wprowadz liczb� ca�kowit�");
				odczyt_z_klawiatury.nextLine();
				}
			}
		}
		
		odczyt_z_klawiatury.close();
		
	}
}
