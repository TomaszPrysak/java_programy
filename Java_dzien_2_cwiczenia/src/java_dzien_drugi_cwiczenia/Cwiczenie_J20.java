package java_dzien_drugi_cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

import static java.lang.Math.*;

public class Cwiczenie_J20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		
		// poniwa� nie narzucili�my lokalizacji z jakiego systemu ma korzysta� klasa to b�dzie korzystac z systemu z przecinkkiem

		System.out.println("Program do obliczania �redniej z trzech liczb");
		System.out.println("Wprowadz pierwsz� liczb�: ");
		double x = input.nextDouble();
		System.out.println("Wprowadz drug� liczb�: ");
		double y = input.nextDouble();
		System.out.println("Wprowadz trzeci� liczb�: ");
		double z = input.nextDouble();
		
		double srednia = round(((x+y+z)/3)*100)/100d;
		
		System.out.println("�rednia z podanych licz wynosi: " + srednia);
		
		input.close();
	}

}
