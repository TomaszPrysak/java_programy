package java_dzien_pierwszy;

public class Zmienna_stala {

	public static void main(String[] args) {
		
		final int STALA_INT = 8; // deklarowanie i inicjalizowanie zmiennej z jednoczesnym s��wkiem final powoduje, �e nie mo�emy pozniej zmienic jej wartosci 
		//STALA_INT = 9; - przy pr�bie zmiany warto�ci tej zmiennej wyskoczy b��d bo jest ona sta��
		
		final int STALA_FLOAT; // je�eli najpierw zdeklarujemy typ zmiennej z jednoczesnym okre�leniem �e jest sta�a
		STALA_FLOAT = 8; // a dopiero p�zniej zainicjujemy warto�� do zmiennej to nie wyskoczy b��d w przypadku zmiany sta�ej bo inicjalizacja jest przeprowadzana po deklaracji

	}

}
