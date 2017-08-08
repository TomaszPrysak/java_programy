package java_dzien_drugi;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Lokalizacja_Local {

	public static void main(String[] args) {
		
		// UWAGA !!! poniewa� w zale�no�ci od tego na jakim systemie pracujemy, tzn. na jakiej lokalizacji polskiej, angielskiej, us to system r�nie przyjmuje co jest rozdzielnikiem w liczbach zmiennoprzecinkowych
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		
		input.useLocale(Locale.US); // tutaj narzucamy na sta�e �e korzystamy z systemu wprowadzania danych wg US, tj. kropki w liczbach zmiennoprzecinkowych
		System.out.println("A : ");
		double a = input.nextDouble(); // nextDouble zczytuje dane do pustego znaku, a w naszym przypadku pustym znakiem jest enter wywo�any poprzez naci�niecie po wstawieniu liczby
		
		input.nextLine(); // to powoduje ze nextDouble zczytuje ta pusta linie i mozna wpisaywac po liczbie string
		
		System.out.println("Wprowadz swoje imi�:");
		String imie = input.nextLine();
		System.out.println("Witaj " + imie);
		
		System.out.println("B : ");
		double b = input.nextDouble();
		input.close();
		System.out.println("A + B = " + (a+b));

	}

}
