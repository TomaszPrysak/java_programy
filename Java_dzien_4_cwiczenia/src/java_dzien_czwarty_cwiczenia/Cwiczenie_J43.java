package java_dzien_czwarty_cwiczenia;

import java.util.Random;

public class Cwiczenie_J43 {

	public static void main(String[] args) {
		
		int [] tab = new int [10];
		
		Random gen = new Random();
		
		// losowanie liczby
		
		for (int i = 0; i < tab.length; i++){
			int x = gen.nextInt(21) - 10;
			tab[i] = x;
			
		}
		
		// wypisywanie na ekranie
		
		for (int i = 0; i < tab.length - 1; i++){
			System.out.print(tab[i]);
			System.out.print(" ");
		}
		
		// max i min
		
		int tabMax = tab[0];
		int tabMin = tab[0];
		
		for (int j = 1; j <= tab.length - 1; j++){
			if (tabMax < tab[j]){
				tabMax = tab[j];
				}
			if (tabMin > tab[j]){
				tabMin = tab[j];
			}
		}
		
		System.out.println("Najmniejszy: " + tabMin + "\nNajwi�kszy: " + tabMax);
		
		// �rednia
		
		int suma = 0;
		for (int k = 0; k <= tab.length - 1; k++){
			suma = suma + tab[k];
		}
		
		float ave = suma/tab.length;
		
		System.out.println("�rednia z po�r�d liczb w tabeli: " + ave);
		
		// ile element�w jest mniejszych a ile jest wi�kszych 
		
	}
}
