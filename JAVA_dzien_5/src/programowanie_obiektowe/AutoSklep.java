package programowanie_obiektowe;

public class AutoSklep {

	public static void main(String[] args) {
		
		System.out.println("Kupuj� auto: ");
		Auto bmw = new Auto(4, "bia�y", "z�ote", "chrom", "BMW", "X5", 100000); // stworzenie obiektu klasy Auto kt�ra znajduje si� w tym samym pakiecie programowanie_obiektowe
		System.out.println("Kupi�e�: " + bmw.marka + " " + bmw.model);
		System.out.println("Do zap�aty: " + bmw.cena);
		
		boolean rezultat = bmw instanceof Auto;
		System.out.println(rezultat);
		
		/*
		// wywo�ujemy metod� brutto z klasy Auto dla konkretnego obiektu
		double cena_brutto_rabat = bmw.brutto(); // mo�emy wpisa� bezpo�rednio argument wymagany przez metod�
		System.out.println(cena_brutto_rabat);
		
		cena_brutto_rabat = bmw.brutto(); // ale mo�emy te� si� odwo�a� do pola zdefiniowanego w momencie tworzenia obiektu
		System.out.println(cena_brutto_rabat);
		
		// wywo�ujemy metod� bruttoNetto z klasy Auto dla obiektu i tutaj uz nie musimy p�zniej wywp�ywa� printa bo ta metoda ju� ma w sobie system.out.print
		bmw.bruttoNetto();
		
		// System.out.println(bmw.brutto);
		*/
		
		System.out.println("Po rabacie: " + bmw.rabat());
		bmw.bruttoNetto();
	}

}
