package operacje_na_plikach;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OperacjePliki {

	public static void main(String[] args) throws IOException {
		
		// odczytywanie z pliku
		
		File plik = new File("Pliczek1.txt"); // tworzymy obiekt klasy File s�u��cy do odczytu z pliku oraz podajemy nazw� pliku do kt�rego b�dziemy sie odwo�ywa�, czyli go odczytywa�, musimy go utworzy� w "katalogu" projektu tj. JAVA_dzien_8, po prostu klikaj�c prawym i NEW -> File UWAGA!!! w tym wypadku my podajemy tylko nazw� pliku poniewa� ten plik znajduje si� w katalogu projektu, je�eli by�my chcieli odwo�a� si� na plik w innej lokalizacji w�wczas podajemy pe�n� lokalizacj� pliku
		
		Scanner odczyt = new Scanner(plik); // tworzymy Scanner do odczytu
		
		String text1 = odczyt.nextLine(); // tworzymy zmienn� w kt�rej b�dzie przechowywany pojedy�czy wiersz z naszego pliku UWAGA!!! plik odczytywany jest w postaci jednego wiersza i stosuj�c pojedy�cz� komend� odczytu odczytamy tylko pojedy�czy wiersz, aby odczyta� wszystko i wy�wietli� musimy to zrobi� w p�tli
		
		System.out.println(text1); // wy�wietlamy to co odczytali�my z pierwszego wiersza
		
		String text2 = odczyt.nextLine(); // tworzoymy kolejna zmienn� w kt�rej przechowujemy kolejny pojedy�czy wiersz z naszego UWAGA!!! Je�eli nie b�dzie nic w drugiej linijce to b�dzie b��d - oczywi�cie lepiej to w p�tli
		
		System.out.println(text2); // wypisujemy to co w drugiej linijce - oczywi�cie lepiej to w p�tli
		
		odczyt.close(); // zamykamy strumie� odczytu pliku
		
		// zapis do pliku
		
		// I rodzaj zapisu
		// w tym przypadku nadpisuje to co by�o wcze�niej w pliku
		PrintWriter zapis = new PrintWriter(plik); // tworzymy obiek klasy PrintWriter s�u��cy do zapisu do pliku oraz podajemy nazw� pliku w kt�rym b�dziemy zapisywa�
		
		// II rodzaj zapisu
		// w tym wypadku zachowuje wszystko co by�o wcze�niej w pliku a nowe rzeczy zapisuje na samym ko�cu, argument True m�wi to, �e zachowuje to co by�o wcze�niej
		FileWriter zapis1 = new FileWriter(plik, true); // obiek klasy FileWriter s�u��cy do zapisu lub do dopisania w przypadku czystego pliku zawarto�ci oraz podajemy nazw� pliku
		
		zapis.println("Zawarto�� zapisu"); // komenda do zapisu do pliku UWAGA!!! je�eli wcze�niej co� by�o w tym pliku to zostaje zast�pione... pomimo, �e odczyt nastepuje po wierszach to zapisuy zastepuje wszystko nie tylko od pierwszego wiersza
		
		zapis.close();

	}

}
