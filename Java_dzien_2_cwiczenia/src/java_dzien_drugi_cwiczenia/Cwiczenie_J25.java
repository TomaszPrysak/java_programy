package java_dzien_drugi_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		
		System.out.println("Program zlicza znaki wprowadzone z klawiatury");
		System.out.println("Wprowadz znaki, mog� by� spacje:");
		
		String znaki = input.nextLine();
		
		System.out.println("Wprowadzi�e� ci�g znak�w o d�ugo�ci: " + znaki.length());
		
		input.close();

	}

}
