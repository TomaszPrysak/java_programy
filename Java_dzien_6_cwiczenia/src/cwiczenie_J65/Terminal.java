package cwiczenie_J65;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Terminal {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		
		Magazyn m1 = new Magazyn();
		
		while(true){
			System.out.println("Co chesz zrobic: D-dodaj, U-usun, L-lista, Q-wyjscie");
			String m = input.nextLine();
			if(m.equals("D")){
				m1.dodajProdukt(new Magazyn());
			} 
			if (m.equals("L")){
				m1.wypiszWszystkieprodukty();
			}
			if (m.equals("Q")){
				System.out.println("koniec!");
				break;
			}
		}

	}
}
