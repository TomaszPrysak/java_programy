package java_dzien_trzeci_cwiczenia;

import java.io.FilterInputStream;
import java.util.Random;
import java.util.Scanner;

public class Cwiczenie_J37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(new FilterInputStream(System.in){ // deklarujemy obekt typu scanner o nazwie odczyt i inicjalizujemy go 
			@Override
			public void close(){};
		});
		
		Random gen = new Random();
		int a = gen.nextInt(100);
		
		System.out.println("System wolosowa� liczb� z przedzia�u 1 - 100");
		System.out.println("Podaj jaka to liczba:");
		int x = input.nextInt();
		
//		// wykonane p�tl� while
//		
//		while(x != a){
//			if(x < a){
//				System.out.println("Twoja liczba jest mniejsza ni� wylosowana przez komputer");
//			}else if (x > a){
//				System.out.println("Twoja liczba jest wi�ksza ni� wylosowana przez komputer");
//			}
//			System.out.println("Pr�buj dalej:");
//			x = input.nextInt();
//		}
//		
//		System.out.println("Gratuluj�! Znalaz�e� wylosowan� przez komputer liczb�. Liczba ta to: " + a);
		
		
		// wykonane p�tl� do-while
		// sprawdzi� r�nice mi�dzy p�tl� while a do-while
		
		do{
			if(x < a){
				System.out.println("Twoja liczba jest mniejsza ni� wylosowana przez komputer");
			}else if (x > a){
				System.out.println("Twoja liczba jest wi�ksza ni� wylosowana przez komputer");
			}
			System.out.println("Pr�buj dalej:");
			x = input.nextInt();
		}while(x != a);
		
		System.out.println("Gratuluj�! Znalaz�e� wylosowan� przez komputer liczb�. Liczba ta to: " + a);
		
	}

}
