package java_dzien_pierwszy_cwiczenia;

public class Cwiczenie_J6 {

	public static void main(String[] args) {
		
		// Pierwszy sposób - poprzez zdeklarowanie zmiennych
		
		int wiek = 25;
		char imie = 'J';
		char nazwisko = 'K';
		boolean prawda = true;
		
		System.out.println("Czeœæ Jan, s³ysza³em ¿e masz " + wiek + " lat i uczysz siê programowania, czy to prawda ?");
		System.out.println(prawda);
		System.out.println("Czy Twoje inicja³y to " + imie + nazwisko + " ?");
		System.out.println("Tak, " + prawda);
		
		// Drugi sposób - poprzez ³¹czenie ci¹gów znaków i liczb, inaczej mówi¹c poprzez concat
		
		System.out.println("Czeœæ Jan, s³ysza³em ¿e masz " + 25 + " lat i uczysz siê programowania, czy to prawda ?");
		System.out.println(prawda);
		System.out.println("Czy Twoje inicja³y to " + "J" + "K" + " ?");
		System.out.println("Tak, " + true);
		
	}

}
