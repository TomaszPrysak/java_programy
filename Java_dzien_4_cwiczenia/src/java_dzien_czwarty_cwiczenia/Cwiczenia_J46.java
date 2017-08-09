package java_dzien_czwarty_cwiczenia;

import java.util.Scanner;

public class Cwiczenia_J46 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Podaj liczb� ca�kowit� dodatni�:");
		
		int liczba = input.nextInt();
		
		int[] tab = new int[32];
		
		
		
		while(liczba < 0){
			System.out.println("Podana liczba nie jest liczb� ca�kowit� dodatni�");
			System.out.println("Podaj liczb� ca�kowit� dodatni�:");
			
			liczba = input.nextInt();
		}
		
		
		
		// pierwszy spos�b
		
		/*
		
		int licznik = 0;
		
		while(liczba>0){
			if(liczba%2 == 0){
				liczba = liczba / 2;
				tab[licznik = licznik + 1] = 0;
			}else{
				liczba = liczba / 2;
				tab[licznik = licznik + 1] = 1;
			}
		}
		for (int i = tab.length - 1; i >= 0; i--){
			if(licznik >= i){
				System.out.print(tab[i]);
			}else{
				System.out.print(0);
			}
		}
		*/
		
		// drugi spos�b
		
		for (int i = tab.length - 1; i >= 0; i--){
			tab[i] = liczba%2;
			liczba /= 2;
		}
		
		for (int i: tab){
			System.out.print(i);
		}
		
		input.close();
		
	}

}
