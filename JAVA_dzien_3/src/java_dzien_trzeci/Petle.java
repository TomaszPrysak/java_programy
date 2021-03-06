package java_dzien_trzeci;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Petle {

	public static void main(String[] args) {
		
		// P�tla for
		// P�tla while
		// P�tla for each
		// wypisuje zadan� przez u�ytkownika okre�lon� ilo�� razy s�owo witaj
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
//				
//		System.out.println("Wprowadz ile razy chcesz wy�wietli� witaj:");
//		
//		int liczba = input.nextInt();
//		
//		int y = 1;
//		for(int i = 0; i < liczba;  i = i + 1){ // UWAGA!!! w kroku musimy poda� krok w postaci zapusu arytmetycznego tego co stoi na int i = 0
//			System.out.println("Wtaj Tomaszu, wypisanie: " + y);
//			y = y + 1;
//		}
//		
//		input.close();
//		}
		
		System.out.println("Wprowadz ile podasz wyraz�w:");
		
		int liczba = input.nextInt();
		
		Scanner txt = new Scanner(System.in);
		
		String[] teksty = new String[liczba]; // UWAGA!!! tworzmy tablic� po to aby nasze wprowadzane teksty umieszcza� w tablicy
		
		// p�tla for
		
		for(int i = 0; i < liczba;  i = i + 1){ // UWAGA!!! w kroku musimy poda� krok w postaci zapusu arytmetycznego tego 
			System.out.println("Podaj tekst do wy�wietlenia");
			String tekst = txt.nextLine();
			teksty[i] = tekst;
		}
		
		txt.close();
		
		int i = 0;
		
		// p�tla while 
		
		while(i < liczba){
			System.out.println(teksty[i]);
			i = i + 1;
		}
		
		// p�tla for (each) - p�tla for each jest tak naprawd� p�tl� for tylko poprzez to, �e jest odpowiednia jej sk�adnia
		
		for(String var: teksty){ // przypisujemy lokalnie w p�tli do zmiennej var ka�dy pojedy�czy element z naszej tablicy od pocz�tku naszej tablicy, tak jak w Pythonie
			System.out.println(var);
		}
		
		input.close();
		
		// UWAGA!!! tworz�c jak�kolwiek tablic� w JAVIE od razu jest ona tworzona z tak� ilo�ci� pozycji jak� zadeklarowali�my, ale je�eli nic do tablicy nie wpiszemy to: czytaj ni�ej
		
		int[] liczby = new int[3];
		String [] wyrazy = new String [3];
		System.out.print(liczby[0]); // w tym wypadku wy�wietli si� 0
		System.out.print(wyrazy[1]); // w tym wypadku wy�wietli si� null
		
	}
	
		
}


