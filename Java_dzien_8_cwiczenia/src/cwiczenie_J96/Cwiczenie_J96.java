package cwiczenie_J96;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cwiczenie_J96 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String [] liczby = new String [10];
		
		String dec;
		
		int index;
		
		int i = 0;
		
		while(true){
			try{
				System.out.println("Podaj element tablicy, (w) - wyj�cie");
				dec = input.nextLine();
				if(dec.equals("w")){
					break;
				}else{
						if(i != liczby.length){
						liczby[i] = dec;
						i++;
					}if(i == liczby.length){
						throw new ArrayIndexOutOfBoundsException();
					}
					
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Nie mo�na wprowadzi� wi�cej element�w do tablicy");
				input.nextLine();
				break;
			}
		}
		
		while(true){
			try{
				System.out.println("Wybierz kt�ry element tablicy chcesz wy�wietli�, (0) - wyj�cie");
				index = input.nextInt();
				if(index == 0){
					break;
				}
				if(index > i){
					throw new ArrayIndexOutOfBoundsException();
				}
				System.out.println(liczby[index - 1]);
			}catch(InputMismatchException e){
				System.out.println("Nale�y poda� liczb�");
				input.nextLine();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Pod podanym indeksem nie ma �adnej warto�ci");
				input.nextLine();
			}
		}
		
		input.close();
		
	}

}
