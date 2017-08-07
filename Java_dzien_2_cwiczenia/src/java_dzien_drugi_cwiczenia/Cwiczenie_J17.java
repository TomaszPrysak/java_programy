package java_dzien_drugi_cwiczenia;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Cwiczenie_J17 {

	public static void main(String[] args) {
		
		// Deklarowanie zmiennych typu Big Integer - sta�oprzecinkowych
		
		BigInteger bigIntX = new BigInteger("4587861185611654");
		BigInteger bigIntY = new BigInteger("156560323116549156546546");
		
		// Dzia�ania na zmiennych typu Big Integer
		
		BigInteger bigIntSuma = bigIntX.add(bigIntY);
		BigInteger bigIntRoznica = bigIntY.subtract(bigIntX);
		BigInteger bigIntMnozenie = bigIntX.multiply(bigIntY);
		BigInteger bigIntDzielenie = bigIntX.divide(bigIntY);
		
		System.out.println("Dodawanie du�ych liczb: " + bigIntSuma.toString());
		System.out.println("Odejmowanie du�ych liczb: " + bigIntRoznica.toString());
		System.out.println("Mno�enie du�ych liczb: " + bigIntMnozenie.toString());
		System.out.println("Dzielenie du�ych liczb: " + bigIntDzielenie.toString()); // wy�wietli�o zero bo dzielimy mniejsz� przez wi�ksz� i na dodatek zdeklarowali�my t� zmienn� jako integer a nie zmiennoprzecinkow� 
		
		// Deklarowanie zmiennych typu Big Decimal - zmiennoprzecinkowych
		
		BigDecimal bigDecX = new BigDecimal("4587861185611654");
		BigDecimal bigDecY = new BigDecimal("156560323116549156546546");
		BigDecimal bigDecZ = new BigDecimal("8");
		
		BigDecimal bigDecDzielenie = bigDecX.divide(bigDecZ);
		
		BigDecimal bigDecMnozenie = bigDecDzielenie.multiply(bigDecZ);
		
		// System.out.println("Dzielenie du�ych liczb zmiennoprzecinkowych: " + bigDecDzielenie.toString()); // tutaj zawr�ci b��d bo jest du�a reprezentacja liczb w okresie np X.33333333333....
		
		System.out.println(bigDecDzielenie); // tutaj nie zwr�ci b�edu poniewa� wynik dzielenia nie ma liczby z okresem kt�ry jest satle powi�kszany np. X.666666666666....

	}

}
