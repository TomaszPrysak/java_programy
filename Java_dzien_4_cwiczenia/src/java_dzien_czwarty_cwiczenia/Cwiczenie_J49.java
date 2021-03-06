package java_dzien_czwarty_cwiczenia;

import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Cwiczenie_J49 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		System.out.println("Podaj napis (end - wyj�cie):");
		
		String znaki = input.nextLine();
		
		ArrayList<String> lista = new ArrayList<String>();
		
		while ((!znaki.equals("end")) && (!znaki.equals("END"))){ // UWAGA!!! do por�wnania dw�ch string�w u�ywamy "equals" w tym wypadku jest zaprzeczenie
			System.out.println("Podaj napis:");
			lista.add(znaki);
			znaki = input.nextLine();
		}
		
		System.out.println(lista);
		
		input.close();

	}

}
