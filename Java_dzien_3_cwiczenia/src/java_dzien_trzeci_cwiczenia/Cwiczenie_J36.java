package java_dzien_trzeci_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J36 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		System.out.println("Podaj wszystkie liczby:");
		
	
		
		int line = 0;
		
		int sum = 0;
		
		boolean hasZERO = false;
		
		do{
			line = input.nextInt();;
			if (line != 0){
				sum = sum + line;
			}else{
				hasZERO = true;
			}
		}while(!hasZERO);
			
		System.out.println("Suma = " + sum);
		
		input.close();
	}

}
