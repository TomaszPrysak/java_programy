package java_dzien_drugi_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;
import static java.lang.Math.*;

public class Cwiczenie_J22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		
		System.out.println("Program oblicza pole powierzchni sześciokąta foremnego");
		System.out.println("Podaj długość boku szcześciokąta a:");
		double a = input.nextDouble();
		
		double p = round(((3*(Math.pow(a, 2))*(Math.sqrt(a)))/2)*100)/100d;
		
		System.out.println("Pole powierzchni sześciokąta foremenego o boku " + a + " wynosi: " + p);
		
		input.close();

	}

}
