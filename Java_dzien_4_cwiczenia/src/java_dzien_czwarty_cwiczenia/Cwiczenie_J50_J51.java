package java_dzien_czwarty_cwiczenia;

import java.io.FilterInputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Cwiczenie_J50_J51 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		HashMap<String,Integer> sklep = new HashMap<String,Integer>();
		
		ArrayList<String> koszyk = new ArrayList<String>();
		
		sklep.put("buty", 150);
		sklep.put("spodnie", 200);
		sklep.put("czapka", 70);
		sklep.put("koszula", 180);
		sklep.put("kurtka", 250);
		
		System.out.println("Podaj produkt spo�r�d dost�pnych " + sklep.keySet() + " (koniec - wyjscie i rachunek:");
		String produkt = input.nextLine();
		
		int rachunek = 0;
		
		// pierwszy spos�b
		
//		while (!produkt.equals("koniec")){
//			if (produkt.equals("buty")){
//				rachunek = rachunek + sklep.get(produkt);
//			}
//			else if (produkt.equals("spodnie")){
//				rachunek = rachunek + sklep.get(produkt);
//			}
//			else if (produkt.equals("czapka")){
//				rachunek = rachunek + sklep.get(produkt);
//			}
//			else if (produkt.equals("koszula")){
//				rachunek = rachunek + sklep.get(produkt);
//			}
//			else if (produkt.equals("kurtka")){
//				rachunek = rachunek + sklep.get(produkt);
//			}
//			else{
//				System.out.println("Podanego produktu nie ma w magazynie");
//			}
//			
//			System.out.println("Podaj nast�pny produkt:");
//			produkt = input.nextLine();
//		}
//		
//		System.out.println("Do zap�aty: " + rachunek);
//		
//		input.close();
		
		// drugi spos�b
		
//		while (!produkt.equals("koniec")){
//			if (sklep.containsKey(produkt)){
//				rachunek = rachunek + sklep.get(produkt);
//			}
//			else{
//				System.out.println("Podanego produktu nie ma w magazynie");
//			}
//			
//			System.out.println("Podaj nast�pny produkt:");
//			produkt = input.nextLine();
//		}
//		
//		System.out.println("Do zap�aty: " + rachunek);
//		
//		input.close();
		
		// Z warunkiem 
		
		while (!produkt.equals("koniec")){
			if (!koszyk.contains(produkt)){
				if (sklep.containsKey(produkt)){
					rachunek = rachunek + sklep.get(produkt);
					koszyk.add(produkt);
				}
				else{
					System.out.println("Podanego produktu nie ma w magazynie");
				}
				}
			else{
				System.out.println("W koszytku juz si� znajduje taki sam produkt. Czy chcesz doda� drug� sztuk� (T)ak, (N)ie");
				String decyzja = "";
				decyzja = input.nextLine();
				if(decyzja.equals("t")){
					rachunek = rachunek + sklep.get(produkt);
					koszyk.add(produkt);
					System.out.println("test");
					}
				}
			System.out.println("Podaj nast�pny produkt:");
			produkt = input.nextLine();
		}
		
		System.out.println("Do zap�aty: " + rachunek);
		
		
		input.close();

	}

}
