package java_dzien_pierwszy;

public class Operacje_na_zmiennych {

	public static void main(String[] args) {
		/*
		// Operacje matematyczne
		
		int a = 17;
		// int b = 4
		double b = 4; // aby wynik z dzielenia by� poprawny t� zmienn� r�wnie� musimy zmaienic na double
		// int  c = a + b
		double c = a + b; // zamienieamy na double poniewa� chcemy 
		
		System.out.println(c);

		c = a - b;
		
		System.out.println(c);
		
		c = a*b;
		
		System.out.println(c);
		
		c = a/b; // poniewa� wynik z dzielenia jest liczb� zmiennoprzecikow� a je�eli zmienna b�dzie integer wiec wynik z dzielenia nie poka�e nam to co jest po przecinku tylko zaookr�gli w d�
		
		System.out.println(c); 
		
		// Operatory skr�cone
		
		a += b;
		
		System.out.println(a);
		
		a -= b;
		
		System.out.println(a);
		
		a /= b;
		
		System.out.println(a);
		
		a *= b;
		
		System.out.println(a);
		
		// Inkrementacje i dekrementacje
		
		System.out.println(a++); // najpierw wy�weitla a p�zniej dodaje ale wyniku nie wy�wietli
		System.out.println(++a); // najpierw dodaje i nast�pnie wy�wietli wynik
		System.out.println(a--); // najpierw wy�wietli a p�zniej odejmie ale wyniku odejmowania nie wy�wietli
		System.out.println(--a); // najpierw odejmie i pokaze wynik odejmowania
		
		// Operacje por�wnania
		
		int x = 5;
		int y = 10;
		
		System.out.println("X>Y" + (x>y));
		System.out.println("X<Y" + (x<y));
		System.out.println("X!=Y" + (x!=y));
		System.out.println("X==Y" + (x==y));
		
			// Sprawdzenie czy dana zmienna jest danej klasy
		
		boolean wyraz = "Kasia" instanceof String;
		System.out.println(wyraz);
		
			// Operacje logiczne
		
		
		
			// Operator tr�jargumentowy
		
		int wynik  = x<y?x:y; // je�eli por�wnanie daje wynik true to zwracawarto�� kt�ra powoduje �e jest true, czyli 5 jest mniejsze od 10 to wynikuem b�dzie 5
		System.out.println(wynik);
		
		
		// Konwersja typu zmiennych
		
		char letter1 = 'k';
		char letter2 = 'o';
		char letter3 = 't';
		
		System.out.println("B��dne \"sumowanie\" znak�w");
		System.out.println((int)letter1); // reprezentacja liczbowa znaku letter1
		System.out.println((int)letter2); // reprezentacja liczbowa znaku letter2
		System.out.println((int)letter3); // reprezentacja liczbowa znaku letter3
		System.out.println(letter1+letter2+letter3); // b��dne sumowanie poniewa� w tym momencie zmianiena znaki na integer czyli ich po�o�enie w tabeli ascii
		System.out.println("Tekst jawny");
		System.out.println(""+letter1+letter2+letter3);
		
		letter1++;
		letter2++;
		letter3++;
		System.out.println((int)letter1);
		System.out.println((int)letter2);
		System.out.println((int)letter3);
		System.out.println("Tekst zaszyfrowany");
		System.out.println(""+letter1+letter2+letter3);
		letter1--;
		letter2--;
		letter3--;
		System.out.println((int)letter1);
		System.out.println((int)letter2);
		System.out.println((int)letter3);
		System.out.println("Tekst jawny");
		System.out.println(""+letter1+letter2+letter3);
		
		// Rzutowanie jawne
		
		int a = 5;
		double b = 5.5;
		System.out.println(b);
		System.out.println((int)b);
		int c = a/(int)b;
		System.out.println(c);
		
			// Przyk�ad rzutowania jawnego
		
		double number1 = 10.987;
		int number2 = 5;
		int zawezanie = (int)number1; // zamieniamy liczb� zmiennoprzecinkow� na sta�oprzecinkow�
		double poszerzenie = (double)number2; // zamieniamy liczb� sta�oprzecinkow� na zmiennoprzecinkow�
		System.out.println("Rzutowanie: " + zawezanie); // wy�wietlamy liczb� sta�oprzecinkow� po zamianie ze zmiennoprzecinkowej i obcina cz�ci dzies�tne
		System.out.println("Poszerzenie: " + poszerzenie); // wy�weitlamy liczb� zmienno przecinkow� ze sta�oprzecinkowej i dorzucenie cz�ci dziesi�tnych
		*/
		
		// Uwaga !!! przy porownaniu obiekt�w pos�ugujemy si� por�wnaniem "==" a przypor�wnywaniu 1:1 u�ywamy "equals"
		
		String ala = "Ala";
		String ala2 = "Ala";
		String al = "Al";
		String a = "a";
		String ala3 = al + a;
		System.out.println(ala == ala2);
		System.out.println(ala.equals(ala3));
		
	}

}
