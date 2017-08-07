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
		
		System.out.println("System wolosowa³ liczbê z przedzia³u 1 - 100");
		System.out.println("Podaj jaka to liczba:");
		int x = input.nextInt();
		
//		// wykonane pêtl¹ while
//		
//		while(x != a){
//			if(x < a){
//				System.out.println("Twoja liczba jest mniejsza ni¿ wylosowana przez komputer");
//			}else if (x > a){
//				System.out.println("Twoja liczba jest wiêksza ni¿ wylosowana przez komputer");
//			}
//			System.out.println("Próbuj dalej:");
//			x = input.nextInt();
//		}
//		
//		System.out.println("Gratulujê! Znalaz³eœ wylosowan¹ przez komputer liczbê. Liczba ta to: " + a);
		
		
		// wykonane pêtl¹ do-while
		// sprawdziæ ró¿nice miêdzy pêtl¹ while a do-while
		
		do{
			if(x < a){
				System.out.println("Twoja liczba jest mniejsza ni¿ wylosowana przez komputer");
			}else if (x > a){
				System.out.println("Twoja liczba jest wiêksza ni¿ wylosowana przez komputer");
			}
			System.out.println("Próbuj dalej:");
			x = input.nextInt();
		}while(x != a);
		
		System.out.println("Gratulujê! Znalaz³eœ wylosowan¹ przez komputer liczbê. Liczba ta to: " + a);
		
	}

}
