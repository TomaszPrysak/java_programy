package java_dzien_drugi_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		
		System.out.println("Program wypisuje podane przez u�ytkownika s�owo od ko�ca");
		System.out.println("Podaj s��wko do odwr�cenia:");
		
		String word = input.nextLine(); // napierw przypisuje do zmiennej to co wpisze u�ytkownik a nastepnie
		
		StringBuffer drow = new StringBuffer(word);
		
		input.close();
		
		System.out.println(drow.reverse().toString());
		
	}

}
