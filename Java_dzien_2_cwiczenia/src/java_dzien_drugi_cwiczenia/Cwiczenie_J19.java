package java_dzien_drugi_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		
		System.out.println("Podaj swoje imi�: ");
		String imie =  input.nextLine();
		
		System.out.println("Witaj na kursie JAVA " + imie);
		
		input.close();

	}

}
