package programowanie_obiektowe;


public class Auto {

	// Deklarujemy zmienne (pola) naszej klasy Auto
	public int iloscDrzwi = 2; // podczas wywo�ania konstruktora domy�lnego i w nim bedzie przypisa warto�� dla zmiennej iloscDrzwi, dlatego jak stworzymy nowy obiekt i wywo�amy tego obiektu zmienna iloscDrzwi to b�dzie 2
	double cena; // stworzyli�my obiekt gdzie poprzez konstruktor naurziclismy cen� 100 000 z�
	//double brutto;
	String kolorNadwozia, kolorFelg, kolorOpon, marka, model;
	
	// Metoda
	public double rabat(){
		cena = cena * 0.9;
		return cena;
	}
	
	// Metoda kt�ra zwraca jak�� warto��
	public double brutto(){ // je�eli wywo�ujemy t� metod� to nie przekazujemy jej wargumentu poniewa� w samej metodzie odwo�ujemy si� do zmiennej globalnej
		double brutto = cena * 1.23;
		return brutto; // metoda ta w wyniku dzia�ana zwraca wynik
	}
	
	/* Metoda je�eli nie u�ywamy zmiennych globalnych
	public double brutto(int cena){ // je�eli wywo�ujemy t� metod� to przekazujemy jej argument
		this.brutto = cena * 1.23;
		return brutto; // metoda ta w wyniku dzia�ana zwraca wynik
	}
	*/
	
	// Metoda kt�ra nie zwraca wart�ci a tylko tekst
	public void bruttoNetto(){
		System.out.println("Do zap�aty: ");
		System.out.println("cena netto: " + cena);
		System.out.println("cena brutto: " + cena * 1.23);
	}
	
	/* Metoda je�eli nie u�ywamy zmiennych globalnych
	// Metoda kt�ra nie zwraca wart�ci a tylko tekst
	public void bruttoNetto(int cena){
		System.out.println("Do zap�aty: ");
		System.out.println("cena netto: " + cena);
		System.out.println("cena brutto: " + cena * 1.23);
	}
	*/
	
	// Konstruktor domyslny
	public Auto(){}
	// Konstruktor z argumentami kt�re podajemy
	public Auto(
			int iloscDrzwi, 
			String kolorNadwozia, 
			String kolorFelg, 
			String kolorOpon, 
			String marka, 
			String model,
			double cena){
		this.iloscDrzwi = iloscDrzwi;
		this.kolorNadwozia = kolorNadwozia;
		this.kolorFelg = kolorFelg;
		this.kolorOpon = kolorOpon;
		this.marka = marka;
		this.model = model;
		this.cena = cena; //
	}
	
	// Metoda g��wna naszej klasy Auto w kt�rej wykonywany jest 
	public static void main(String[] args) {
		
		Auto kawasaki = new Auto(); // stworzenie obiektu z konstruktora domy�lnego, a wiemy to st�d, bo w nawiasach nie podajemy argument�w, ale musimy w klasie mie� dwa konstruktory i domyslny i z argumentami
		System.out.println(kawasaki.iloscDrzwi); // poniewa� utworzyli�my obiekt z konstruktorem domyslym to nam wy�wietli ilo�� drzwi, bo taka warto�� jest zainicjowana w polach klasy
		System.out.println(kawasaki.kolorFelg); // z kolei nie mamy przypisanej w polach klasy niczego przypisanego do zmiennej kolorFelg to 
		
		// Tworzenie nowego obiektu naszej klasy Auto wraz z wywo�aniem konstruktora i wpisaniem od razu do niego warto�ci przypisanych do konkretnych zmiennych (p�l) naszej klasy
		Auto garbus = new Auto(4, "niebieski", "czerwony", "czarne", "Volkswagen", "Garbus", 5000);
		
		Auto felicia = new Auto(5, "granatowy", "z�oty", "bia�e", "Skoda", "Felicia", 15000);
		Auto punto = new Auto(3, "bia�y", "czarne", "czarne", "Fiat", "Punto", 17500);
		Auto auris = new Auto(5, "srebrny", "srebrny", "czarne", "Toyota", "Auris", 25000);
		Auto piecset = new Auto(3, "czerwony", "��ty", "czarny", "Fiat", "500", 46000);
		Auto maluch = new Auto(3, "��ty", "niebieski", "czarny", "Fiat", "Maluch", 500);
		
		//poniewa� mamy konstruktor nie musimy przypisywac do ka�dej zmiennej (pola) zdeklarowanego na poczatku naszej klasy, wpisanie to dokonujemy podczas tworzenia nowego obiektu
		/*
		// przypisanie w�a�ciwo�ci do poszczeg�lnych p�l naszej klasy je�eli NIE mamy konstruktora!!!!
		// aby to zrobi� musimy najpierw wpisac nazw� klasy a potem po kropce nazw�pola i nada� im warto��
		garbus.iloscDrzwi = 4;
		garbus.kolorNadwozia = "Niebieski";
		garbus.kolorFelg = "Czerwony";
		garbus.kolorOpon = "Czarny";
		garbus.marka = "Volkswagen";
		garbus.model = "Garbus";
		*/
		
		// Wypisuje w princie pola naszej klasy
		System.out.println(garbus.iloscDrzwi);
		System.out.println(garbus.kolorNadwozia);
		System.out.println(garbus.kolorFelg);
		System.out.println(garbus.kolorOpon);
		System.out.println(garbus.marka);
		System.out.println(garbus.model);
		System.out.println(garbus.cena);
		
	}

}
