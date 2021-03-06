package przeciazanie;

import programowanie_obiektowe.*; // importowanie ca�ego pakietu
import programowanie_obiektowe.Auto; // importowanie konkretnej klasy z pakietu

public class Przeciazanie {
		
		String imie, imie2, nazwisko, nazwisko2;
		
		public Przeciazanie(String imie, String imie2, String nazwisko, String nazwisko2){
			super();
			this.imie = imie;
			this.imie2 = imie2;
			this.nazwisko = nazwisko;
			this.nazwisko2 = nazwisko2;
	}
		
		public Przeciazanie(String imie, String imie2, String nazwisko) {
			super();
			this.imie = imie;
			this.imie2 = imie2;
			this.nazwisko = nazwisko;
		}

		public Przeciazanie(String imie, String nazwisko) {
			super();
			this.imie = imie;
			this.nazwisko = nazwisko;
		}

		public void dodaj(int a, int b){
			System.out.println("wynik: " + (a + b));
		}
		
		public void dodaj(double a, double b){
			System.out.println("wynik: " + (a + b));
		}

		public static void main(String[] arg){
			
			//Przeciazanie ze zmienna liczb� parametr�w
			Przeciazanie p1 = new Przeciazanie("Anna", "Maria", "Nowak", "Kowalska");
			System.out.println(p1.imie);
			Przeciazanie p2 = new Przeciazanie("Marek", "Jurek", "Janusz");
			Przeciazanie p3 = new Przeciazanie("Jan", "Kowalski");
			
			//Przeci�zanie ze zmiennym typem parametr�w
			p1.dodaj(2,5); // 
			
			Auto f1 = new Auto(2, "czerwony", "bia�y", "czewrwony", "Fiat", "Punto", 3000);
			
			f1.bruttoNetto();
			
			System.out.println(f1.iloscDrzwi);
		}

}
