package java_dzien_drugi_cwiczenia;

import static java.lang.Math.*;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Cwiczenie_J23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		
		System.out.println("Program s³u¿y do obliczania odleg³oœæi miêdzy dwoma punktami na ziemi");
		System.out.println("Podaj wspó³rzêd¹ x punktu A, x1:");
		double x1 = input.nextDouble();
		System.out.println("Podaj wspó³rzêd¹ y punktu A, y1:");
		double y1 = input.nextDouble();
		System.out.println("Podaj wspó³rzêd¹ x punktu B, x2:");
		double x2 = input.nextDouble();
		System.out.println("Podaj wspó³rzêd¹ y punktu B, y2:");
		double y2 = input.nextDouble();
		
		double dist = round(((sqrt(pow((x1-x2),2)+pow((cos((x1*PI)/180)*(y1-y2)),2)))*111)*100)/100d;
		
		input.close();
		
		System.out.println("Odlegoœæ miêdzy punktami A i B wynosi: " + dist);

	}

}
