package java_dzien_trzeci_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J35 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		System.out.println("Podaj liczbê ca³kowit¹ dodatni¹:");
		
		int x = input.nextInt();
		
		while(x<0){
			System.out.println("Podana liczba nie jest licza ca³kowit¹ dodatni¹:");
			
			System.out.println("Podaj liczbê ca³kowit¹ dodatni¹:");
			
			x = input.nextInt();
		}

		for(int i = 0; i <= x; i = i + 1){
			System.out.println(Math.pow(2, i));
		}
		
	}

}
