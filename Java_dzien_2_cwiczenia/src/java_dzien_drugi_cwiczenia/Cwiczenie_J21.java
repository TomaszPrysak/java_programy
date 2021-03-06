package java_dzien_drugi_cwiczenia;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Cwiczenie_J21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		
		input.useLocale(Locale.US); // narzucilismy systemowi lokalizacje US
		
		System.out.println("Program por�wnuj�cy dwie podane liczby");
		System.out.println("Podaj liczb� a: ");
		
		double a = input.nextDouble();
		
		System.out.println("Podaj liczb� b: ");
		double b = input.nextDouble();
		
		input.close();
		
		System.out.println("Czy liczba a jest wi�ksza od b: " + (a > b));
		System.out.println("Czy liczba a jest mniejsza od b: " + (a < b));
		System.out.println("Czy liczba a jest r�wna b: " + (a == b));
		System.out.println("Czy liczba a jest r�na od b: " + (a != b));

	}

}
