package cwiczenie_J95;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Obsluga {

	public static void main(String[] args) {
		
		Scanner input = new  Scanner(System.in);
		
		System.out.println("Witaj w kalkulatorze na miare naszych czas�w!!!");
		System.out.println("Zostaniesz teraz poproszony o wprowadzenie dw�ch warto�ci a nast�pnie o wyb�r operacji na tych warto�ciach");
		System.out.println("PAMI�TAJ!!! mog� to by� warto�ci zmiennoprzecinkowe, lecze zapisuj je z kropk�!!!");
		
		Operacje o1 = new Operacje();
		
		while(true){
			input.nextLine();
			System.out.println("Wybierz operacj�\n(+) - dodawanie\n(-) - odejmowanie\n(*) - mno�enie\n(/) - dzielenie\n(w) - wyj�cie");
			String dzialanie = input.nextLine();
			try{
				if(!(dzialanie.equals("+") || dzialanie.equals("-") || dzialanie.equals("*") || dzialanie.equals("/") || dzialanie.equals("w"))){
					throw new InputMismatchException();
				}
				}catch(InputMismatchException e){
					System.out.println("Nie wybra�e� �adnej operacji. Spr�buj jeszcze raz");
				}
				if(dzialanie.equals("+")){
					try{
						System.out.println("Podaj pierwsz� warto��:");
						double x_input = input.nextDouble();
						o1.setX(x_input);
						System.out.println("Podaj drug� warto��:");
						double y_input = input.nextDouble();
						o1.setY(y_input);
						System.out.println("Wynik operacji to: " + o1.dodawanie(o1.getX(), o1.getY()));
					}catch(InputMismatchException e){
						System.out.println("Nie czyta�e� komunikat�w na pocz�tku programu. Podana warto�� nie jest liczb� zmiennoprzecinkow�");
						input.nextLine();
					}
				}else if(dzialanie.equals("-")){
					try{
						System.out.println("Podaj pierwsz� warto��:");
						double x_input = input.nextDouble();
						o1.setX(x_input);
						System.out.println("Podaj drug� warto��:");
						double y_input = input.nextDouble();
						o1.setY(y_input);
						System.out.println("Wynik operacji to: " + o1.odejmowanie(o1.getX(), o1.getY()));
					}catch(InputMismatchException e){
						System.out.println("Nie czyta�e� komunikat�w na pocz�tku programu. Podana warto�� nie jest liczb� zmiennoprzecinkow�");
						input.nextLine();
					}
				}else if(dzialanie.equals("*")){
					try{
						System.out.println("Podaj pierwsz� warto��:");
						double x_input = input.nextDouble();
						o1.setX(x_input);
						System.out.println("Podaj drug� warto��:");
						double y_input = input.nextDouble();
						o1.setY(y_input);
						System.out.println("Wynik operacji to: " + o1.mnozenie(o1.getX(), o1.getY()));
					}catch(InputMismatchException e){
						System.out.println("Nie czyta�e� komunikat�w na pocz�tku programu. Podana warto�� nie jest liczb� zmiennoprzecinkow�");
						input.nextLine();
					}
				}else if(dzialanie.equals("/")){
					try{
						System.out.println("Podaj pierwsz� warto��:");
						double x_input = input.nextDouble();
						o1.setX(x_input);
						System.out.println("Podaj drug� warto��:");
						double y_input = input.nextDouble();
						if(y_input == 0){
							throw new ArithmeticException();
						}
						o1.setY(y_input);
						System.out.println("Wynik operacji to: " + o1.dzielenie(o1.getX(), o1.getY()));
					}catch(InputMismatchException e){
						System.out.println("Nie czyta�e� komunikat�w na pocz�tku programu. Podana warto�� nie jest liczb� zmiennoprzecinkow�");
						input.nextLine();
					}catch(ArithmeticException e){
						System.out.println("B��d dzielenia przez 0!!!");
						input.nextLine();
					}
				}else if(dzialanie.equals("w")){
					System.out.println("Wyszed�e� z programu. Do zobaczenia");
					break;
				}
				
		}	
	
		input.close();
		
	}

}
