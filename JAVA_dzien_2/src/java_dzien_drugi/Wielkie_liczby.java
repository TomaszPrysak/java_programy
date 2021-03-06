package java_dzien_drugi;

import java.math.BigInteger;

public class Wielkie_liczby {

	public static void main(String[] args) {
		
		// UWAGA!!! nale�y pami�ta�, �e na wielkich liczbach nie stosujemy zwyk�ych operacji matematycznych jak plus(+), minus(-) itd tylko specjalne polecenia kt�re odpowiadaj� arytmetycznym operacj�
		// liczby typu Big r�wnie� wymagaj� zaimportowania biblioteki Math
		
		long x = 25615612151111665l; // UWAGA! pami�ta�, �e przy niekt�rych typach zmiennych musimy dodawa� na ko�cu liczby pierwsz� literk� od nazwy typu zmiennej
		long y = 25615612151111665l;
		
		BigInteger bigIntX = BigInteger.valueOf(x); // jest to metoda statyczna kt�ra konwertuje nasz� liczb� typu long na liczb� Big po to aby p�zniej mozna bylo robic jakies opercje na wielkich liczbach
		System.out.println(bigIntX.toString());
		
		BigInteger bigIntY = BigInteger.valueOf(y); // tak jak powy�sza liczba bigIntX ta te� powsta�a poprzez konwersj� liczby typu long na Big
		System.out.println(bigIntY.toString());
		

		
		BigInteger bigbigInt = new BigInteger("1651115154155455415189971616"); // tutaj tworzymy du�� liczb� od razu nie poprzez konwersj�. Przydatne je�eli od razu wiemy ze liczba b�dzie Big a nie tylko wynik jej dodawania
		
		
		BigInteger bigIntZ = bigIntY.add(bigIntX); // na liczbach typu Big prowadzimy operacj� poprzez tak� konstukcj� jak pokazan� tzn. zmiennaX.add(zmiannaY)
		System.out.println(bigIntZ);
		
		 

	}

}
