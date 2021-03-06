package java_dzien_drugi;

import static java.lang.Math.*; // UWAGA!!! mo�emy na p�cztku sktryptu zaimportowa� statycznie biblioteke Math (mog� by� r�wnie� inne biblioteki). Je�eli zaimportowali�my na pocz�tku biblioteke to p�niej w kodzie nie musimy zaczyna� od nazwy funkcji

public class Funkcje_matematyczne {

	public static void main(String[] args) {
		
		// wykorzystanie funkcji matematycznych
		
		double y = 9.0;
		
		int x = 3;
		
		/*
		
		UWAGA!!! w tym przypadku musimy podawa� nazwe biblioteki przed nazwami funkcji matematycznych poniewa� korzystamy z funkcji lokalnie dla konkretnego przypadu 
		
		double pierwiastek = Math.sqrt(y); // wywo�anie fukcji matematycznych nastepuje poprzez s�owo Math i po kropce nazwa funkcji jak� cgcemy wykorzysta�
		double potega = Math.pow(y, x); // w zale�no�ci od funkcji mamy r�zn� ilo�� argument�w kt�re musimy poda�
		
		*/
		
		// Poniwa� zaimportowali�my biblioteke Math dla ca�ej klasy to nie musimy przed funkcjami matematycznymi u�ywa� nazwy Math, tylko u�ywamy nazwy funkcji matematycznych
		
		double pierwiastek = sqrt(y);
		double potega = pow(y, x);
		
		System.out.println("Pierwiastek kwadratowy z "+ y + " wynosi: " + pierwiastek);
		System.out.println(y + " podniesiona do pot�gi " + x + " wynosi: " + potega);

	}

}
