package java_dzien_pierwszy;

public class Zmienne {

	public static void main(String[] args) {
		
		int liczba1 = 5; // deklaracja typu zmiennej i inicjalizacja warto�ci zmiennej 
		int liczba2 = liczba1;
		System.out.println(liczba1 + liczba2);
		
		double liczba3, liczba4; // tylko deklaracja zmiennej
		liczba3 = 5.0;  // w p�zniejszym kroku inicjalizacja warto�ci zmiennej (NIE ODWROTNIE)
		// liczba3 = liczba1 - UWAGA!!! do zmiennej typu double MO�EMY przypisa� zmienn� typu int
		// liczba1 = liczba3 - UWAGA!!! do zmiennej typu in NIE MO�EMY przypisac zmiennej typu double
		liczba4 = 3.3;
		System.out.println(liczba3);
		System.out.println(liczba4);
		
		
		
	}

}
