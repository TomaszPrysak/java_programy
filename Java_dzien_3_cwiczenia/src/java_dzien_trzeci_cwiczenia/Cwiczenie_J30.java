package java_dzien_trzeci_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		System.out.println("Podaj liczb� ca�kowit� dodatni�:");
		
		int x = input.nextInt();
		
		while (x < 1) { // najpierw sprawdzamy czy liczba jest wieksza od zera, je�eli nie to pyta znowu
			System.out.println("Podaj liczb� ca�kowit� dodatni�:");
			x = input.nextInt();
		}
		
		//po spe�nieniu warunku 
		for (int i = 1; i <= x; i = i + 2){
			System.out.println(i);
		}
		
		input.close();

	}

}
