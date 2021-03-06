package java_dzien_drugi_cwiczenia;

import static java.lang.Math.*;

public class Cwiczenie_J18 {

	public static void main(String[] args) {

		double x = 11;
		double y = 7;
		double r = 5.5;
		
		double pierwiastek = Math.sqrt(x);
		double potega = Math.pow(x, y);
		double bezwzgledna = Math.abs(y);
		
		double obwod = 2*Math.PI*r;
		double pole = round(Math.PI*(Math.pow(r, 2)));
		
		System.out.println("Pierwiastek kwadratowy z " + x + " wynosi: " + pierwiastek);
		System.out.println(x + " podniesione do pot�gi: " + y +  " wynosi: " + potega);
		System.out.println("Wartosc bezwzgledna z " + y + " to: " + bezwzgledna);
		
		System.out.println("Obw�d okregu o �rednicy " + r + " wynosi: " + obwod);
		System.out.println("Pole kola o �rednicy " + r + " wynosi: " + pole);
		
		System.out.printf("Value: %.2f", obwod); // spos�b na zaaokr�glenie

	}

}
