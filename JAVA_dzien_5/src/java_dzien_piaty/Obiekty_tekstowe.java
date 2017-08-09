package java_dzien_piaty;

public class Obiekty_tekstowe {

	// zakresy zmiennych
	
	// zmienna klasowa
	static String p = "zmienna globalna"; // zmienna p zdeklarowana w ca�ej klasie programu i mo�na si� do niej odwo�ywa� w ramach ca�ego kodu kt�ry zamkni�ty jest w klamry klasy
	
	static void info(){ // metoda info, poza metod� g��wn�, aby si� do niej odnie�� to w metodzie g��wnej musimy si� do niej odwo�a�
		int b = 2;
	
		if(true){
			int c =3;
		}
		
		System.out.println("Jestem w metodzie info");
		System.out.println("w metodzie info (zmienna klasowa p): " + p);
	}
	
	public static void main(String[] args) { // metoda g��wna, jest zawsze uruchamiany na pocz�tku, wszystko co si� w nim dzieje to zaczyna si� tutaj, a je�eli mamy jakie� inne metody musimy si� do nich odwo�a�
		
		// zmienna w metodzie g��wnej
		int a = 1; // zmienna zadeklarowana na pocz�tku metody, jest globalna dla tej metody czyli public static void main, mo�na si� do niej odnosi� w ca�ym kodzie w ramach tej metody, b�dzie widoczna w p�tlach itd...
		
		for (int i = 0; i < 9; i++){ // zmienna i znajduj�ca si� w p�tli, zakres jej widoczno�ci jest pomi�dzy klamrami p�tli, poza p�tl� nie m�na si� do niej odnosi�
			// zakres lokalny zmiennej i w p�tli for
			System.out.println("zmienna lokalna p�tli (i): " + i);
			a = a + 1; // zmienna globalna metody static void main i dlatego mo�na si� do niej odnosi� w p�tli, mo�emy ja modyfikowa�
			System.out.println("zmienna metody w p�tli (a): " + a); 
		}
		
		// zmienna nie jest widoczna poza p�tl�
		//System.out.println("w p�tli" + i); // zmienna i kt�ra zosta�a zdeklarowana w p�tli jest widoczna tylko w p�tli i nie mo�e zostac wypisana

		System.out.println("w metodzie g��wnej (zmienna metody g��wej a): " + a); // zmienna metody g��wnej
		
		// zmienna klasowa widoczna w metodzie g��wnej
		System.out.println("w metodzie g��wnej (zmienna klasowa p): " + p);
		
		// wywo�anie metody info:
		info();
		
	}

}
