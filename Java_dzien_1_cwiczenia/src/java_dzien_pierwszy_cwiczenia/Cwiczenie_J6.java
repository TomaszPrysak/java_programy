package java_dzien_pierwszy_cwiczenia;

public class Cwiczenie_J6 {

	public static void main(String[] args) {
		
		// Pierwszy spos�b - poprzez zdeklarowanie zmiennych
		
		int wiek = 25;
		char imie = 'J';
		char nazwisko = 'K';
		boolean prawda = true;
		
		System.out.println("Cze�� Jan, s�ysza�em �e masz " + wiek + " lat i uczysz si� programowania, czy to prawda ?");
		System.out.println(prawda);
		System.out.println("Czy Twoje inicja�y to " + imie + nazwisko + " ?");
		System.out.println("Tak, " + prawda);
		
		// Drugi spos�b - poprzez ��czenie ci�g�w znak�w i liczb, inaczej m�wi�c poprzez concat
		
		System.out.println("Cze�� Jan, s�ysza�em �e masz " + 25 + " lat i uczysz si� programowania, czy to prawda ?");
		System.out.println(prawda);
		System.out.println("Czy Twoje inicja�y to " + "J" + "K" + " ?");
		System.out.println("Tak, " + true);
		
	}

}
