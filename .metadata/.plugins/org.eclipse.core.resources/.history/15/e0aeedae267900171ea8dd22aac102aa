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
		
		System.out.println("Wybierz co chcesz zrobiæ - (W)yjœcie - (D)alej - (P)auza");
		
		String a = input.nextLine();
		
		switch(a){
		
		case "D":
			System.out.println("Przeszed³eœ dalej");
			break;
		case "P":
			System.out.println("Zapauzowa³eœ");
			break;
		case "W":
			System.out.println("Wyszed³eœ");
		}
		
	}

}
