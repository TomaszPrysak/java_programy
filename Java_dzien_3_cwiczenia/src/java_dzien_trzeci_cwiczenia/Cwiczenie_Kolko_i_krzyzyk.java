package java_dzien_trzeci_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_Kolko_i_krzyzyk {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		System.out.println("1   2 3");
		System.out.println("4  | | ");
		System.out.println("  -----");
		System.out.println("5  | | ");
		System.out.println("  -----");
		System.out.println("6  | | ");
		
//		int[] graczA = new int[2];
		
		System.out.println("Gracz A (krzy�yk)");
		System.out.println("Podaj wsp�rz�dn� x (1-3) k�ka:");
		int x1 = input.nextInt();
		System.out.println("Podaj wsp�rz�dn� y (4-6) k�ka:");
		int y1 = input.nextInt();
		
		if (x1 == 1 && y1 ==4){
			System.out.println("1   2 3");
			System.out.println("4 x| | ");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x1 == 2 && y1 ==4){
			System.out.println("1   2 3");
			System.out.println("4  |x| ");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x1 == 3 && y1 ==4){
			System.out.println("1   2 3");
			System.out.println("4  | |x");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x1 == 1 && y1 ==5){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5 x| | ");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x1 == 2 && y1 ==5){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5  |x| ");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x1 == 3 && y1 ==5){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5  | |x");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x1 == 1 && y1 ==6){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6 x| | ");
		}else if(x1 == 2 && y1 ==6){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6  |x| ");
		}else if(x1 == 3 && y1 ==6){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6  | |x");
		}
		
		
//		int[] graczB = new int[2];
		
		System.out.println("Gracz B (k�ko)");
		System.out.println("Podaj wsp�rz�dn� x (1-3) k�ka:");
		int x2 = input.nextInt();
		System.out.println("Podaj wsp�rz�dn� y (4-6) k�ka:");
		int y2 = input.nextInt();
		
		if (x2 == 2 && y2 ==4){
			System.out.println("1   2 3");
			System.out.println("4 x| | ");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x2 == 2 && y2 ==4){
			System.out.println("1   2 3");
			System.out.println("4  |x| ");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x2 == 3 && y2 ==4){
			System.out.println("1   2 3");
			System.out.println("4  | |x");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x2 == 1 && y2 ==5){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5 x| | ");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x2 == 2 && y2 ==5){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5  |x| ");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x2 == 3 && y2 ==5){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5  | |x");
			System.out.println("  -----");
			System.out.println("6  | | ");
		}else if(x2 == 1 && y2 ==6){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6 x| | ");
		}else if(x2 == 2 && y2 ==6){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6  |x| ");
		}else if(x2 == 3 && y2 ==6){
			System.out.println("1   2 3");
			System.out.println("4  | | ");
			System.out.println("  -----");
			System.out.println("5  | | ");
			System.out.println("  -----");
			System.out.println("6  | |x");
		}
		
	}	
}
