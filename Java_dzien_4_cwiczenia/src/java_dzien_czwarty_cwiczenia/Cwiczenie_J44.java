package java_dzien_czwarty_cwiczenia;

import java.util.Random;

public class Cwiczenie_J44 {

	public static void main(String[] args) {
		
		// B£ÊDNE WYNIKI
		
		int [] tab = new int [20];
		
		Random gen = new Random();

		// losowanie licz od 1 do 10
		
		for (int i = 0; i < tab.length; i++){
			tab[i] = gen.nextInt(10) + 1;
		}
		
		// wypisywanie na ekranie
		
		for (int i: tab){
			System.out.print(tab[i]);
			System.out.print(" ");
		}
		
		System.out.println("");
		
		for (int i = 1; i < 11; i++){
			int wystapienie = 0;
			for (int j = 0; j < tab.length; j++){
				if (tab[j] == i){
					wystapienie++;
				}
			}
			if(wystapienie > 0){
			System.out.println(i + " powtarza siê w tablicy " + wystapienie);
			}
		}
		
	}

}
