package cwiczenie_J65_Michal;

import java.util.Scanner;

public class Terminal {
	
	public static void main(String[] args) {
		Magzyn m1 = new Magzyn();
		Scanner menu = new Scanner(System.in);
		
		while(true){
			System.out.println("Co chesz zrobić: D-dodaj, U-usuń, Z-zmień, L-lista, Q-wyjście");
			String m = menu.nextLine();
			if(m.equals("D")){
				m1.dodajProdukt(m1);
			} 
			if (m.equals("L")){
				m1.stanyProdukty();
			}
			if (m.equals("Z")){
				m1.zmienStan();
			}
			if (m.equals("U")){
				m1.usunProdukt(m1);
			}
			if (m.equals("Q")){
				System.out.println("koniec!");
				break;
			}
		}
		menu.close();
	}

}
