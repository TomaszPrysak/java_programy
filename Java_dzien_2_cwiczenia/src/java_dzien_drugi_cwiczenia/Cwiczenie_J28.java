package java_dzien_drugi_cwiczenia;

import java.io.FilterInputStream;
import java.util.Random;
import java.util.Scanner;

public class Cwiczenie_J28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {
			};
		});
		
		System.out.println("Podaj x:");
		
		int x = input.nextInt();
		
		Random gen = new Random();
		int a = gen.nextInt(10);
		int b = gen.nextInt(10);
		int c = gen.nextInt(10);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		if(x<a){
			System.out.println("x < a");
		}
		else if(x==a){
			System.out.println("x = a");
		}
		else{
			System.out.println("x > a");
		}		
		if(x<b){
			System.out.println("x < b");
		}
		else if(x==b){
			System.out.println("x = b");
		}
		else if(x>b){
			System.out.println("x > b");
		}	
		if(x<c){
			System.out.println("x < c");
		}
		else if(x==c){
			System.out.println("x = c");
		}
		else{
			System.out.println("x > c");
		}
		

	}

}
