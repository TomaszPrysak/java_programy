package java_dzien_trzeci_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J41 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		System.out.print("Podaj liczb� ca�kowita aby znale� jej dzielniki:");
		
		int liczba = input.nextInt();
		input.nextLine();
		
		for (int i = 1; i <= liczba; i++){
			if(liczba%i == 0){
				System.out.println(i);
			}
		}

		input.close();
		
	}

}
