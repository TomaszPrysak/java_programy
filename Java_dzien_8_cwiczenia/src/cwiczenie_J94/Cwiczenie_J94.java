package cwiczenie_J94;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cwiczenie_J94 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String imie_input;
		String nazwisko_input;
		int wiek_input;
		
		User u1 = new User();
		
		while(true){
		
			System.out.println("Podaj imiê:");
			try{
				imie_input = input.nextLine();
				if(imie_input.isEmpty()){
					throw new NullPointerException();
				}
			u1.setImie(imie_input);
			break;
			}catch(NullPointerException e){
				System.out.println("Imie nie mo¿e byæ puste");
			}
		
		}
		
		while(true){
		
			System.out.println("Podaj nazwisko: ");
			try{
				nazwisko_input = input.nextLine();
				if(nazwisko_input.isEmpty()){
					throw new NullPointerException();
				}
			u1.setNazwisko(nazwisko_input);
			break;
			}catch(NullPointerException e){
				System.out.println("Nazwisko nie mo¿e byæ puste");
			}
			
		}
			
		while(true){
		
			System.out.println("Podaj wiek: ");
			try{
				wiek_input = input.nextInt();
			u1.setWiek(wiek_input);
			break;
			}catch(InputMismatchException e){
				System.out.println("Wiek musi byæ liczb¹ ca³kowit¹");
				input.nextLine();
			}
		}
		
		input.close();
		
		

		System.out.println(u1.getImie() + " " + u1.getNazwisko() + " " + u1.getWiek());
		
	}

}
