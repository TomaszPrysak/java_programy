package java_dzien_drugi_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J29 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {
			};
		});
		
		System.out.println("Wybierz co chcesz zrobi� - (W)yj�cie - (D)alej - (P)auza");
		
		String a = input.nextLine();
		
		switch(a){
		
		case "D":
			System.out.println("Przeszed�e� dalej");
			break;
		case "P":
			System.out.println("Zapauzowa�e�");
			break;
		case "W":
			System.out.println("Wyszed�e�");
		}
		
	}

}
