package java_dzien_trzeci_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		System.out.println("Podaj I liczb�:");
		
		int liczba1 = input.nextInt();
		
		System.out.println("Podaj II liczb� kt�ra jest wi�ksza od I liczby :");

		int liczba2 = input.nextInt();
		
		while(liczba2 < liczba1){
			System.out.println("Podana liczba nie jest wi�ksza od I liczby:");
			System.out.println("Podaj II liczb� ca�kowit�:");
			liczba2 = input.nextInt();
		}
		
		for (int i = 0; i <= (liczba2-liczba1); i = i + 1){
			System.out.print(liczba1 + i);
		}
		
	}

}
