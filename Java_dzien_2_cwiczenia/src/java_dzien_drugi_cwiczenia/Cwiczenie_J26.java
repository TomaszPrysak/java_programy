package java_dzien_drugi_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		
		System.out.println("Prosty kalkulator");
		System.out.println("Podaj x:");
		
		float x = input.nextFloat();
		input.nextLine();
		
		System.out.println("Podaj y:");
		
		float y = input.nextFloat();
		input.nextLine();
		
		System.out.println("Wybierz dzia�anie na wprowadzonych danych:");
		
		String znak = input.nextLine();
		
		switch(znak){
		
		case "+":
			System.out.println("Wybra�e� dodawanie. Wynik dzia�ania to: " + (x+y));
			break;
			
		case "-":
			System.out.println("Wybra�e� odejmowanie. Wynik dzia�ania to: " + (x-y));
			break;
			
		case "*":
			System.out.println("Wybra�e� mno�enie. Wynik dzia�ania to: " + (x*y));
			break;
			
		case "/":
			System.out.println("Wybra�e� dzielenie. Wynik dzia�ania to: " + (x/y));
			break;
		}

		input.close();
		
	}

}
