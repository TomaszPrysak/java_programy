package java_dzien_czwarty;

public class Tablice {

	public static void main(String[] args) {
		
		// tablice wielowymiarowe
		
		int[][] tab = new int[3][3]; // ten zapis oznacza, �e deklarujemy tablic� trzy wiersze i trzy kolumny, dwuwymiarowa
		
		tab[0][0] = 1;
		tab[0][1] = 2;

		// tablica wielowymiarowa kwadratowa z inicjalizacj� warto�ci w niej
		
		int[][] tab2 = { {1,2,3}, {4,5,6}, {7,8,9} }; // deklaracje w taki spos�b powoduje, �e w tej tablicy s� trzy wiersze: w pierwszym wierszu: 1,2,3, w drugim: 4,5,6, w trzecim: 7,8,9
		
		System.out.println(tab2[0][1]);
		
		// tablica ta wygl�da nast�puj�co:
		// plasterek       0		
		// kolumna      0  I  II
		// wiersz    0  1  2  3
		// wiersz    I	4  5  6
		// wiersz   II	7  8  9
		
		// w zwi�zku z powy�szym polecenie wypisz System.out.println(tab2[0][1]); [wiersz][kolumna][plasterek] - w powy�szym plasterek jest tylko jeden wiec  nie u�ywamy
		// otrzymamy wynik: 2
		
		// czyli najpierw podajemy z kt�rego wiersza wypisujemy a nastepnie z kt�rej kolumny
		
		// aby wypisa� powy�sz� tablic� u�ywamy p�tli for
		
		for (int i = 0; i <= tab2.length - 1; i++){
			for(int j = 0; j <= tab2.length - 1; j++){
				System.out.print(tab2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(tab2[0][0]);
		System.out.println(tab2[0][1]);
		System.out.println(tab2[1][0]);
		
		// tablica 3D
		
		String [][][] tab3 = { { {"A1", "A2"}, {"A3", "A4"} }, { {"B1", "B2"}, {"B3", "B4"}} }; // tablica ta sk�ada si� z
		
		System.out.println(tab3[1][0][1]);
		
		// tablica prostok�tna, r�na ilo�� wierszy i kolumn
		
		int[][] tab4 = { {1,2,3,5,6}, {4,5,6,5,6}, {7,8,9,5,6} };
		
		for (int i = 0; i <= tab4.length - 1; i++){
			for(int j = 0; j <= tab4[1].length - 1; j++){
				System.out.print(tab4[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(tab4.length); // d�ugo�� pierwszego wymiaru
		System.out.println(tab4[1].length); // d�ugo�� drugiego wymiaru
		
		// Tablice String�w
		//----------------------------------------------
		
		String[] firstNames = {"Karol", "Basia", "Kasia"};
		String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};
		String[][] firstLast = {firstNames, lastNames};
		
		// chcemy wypisac imiona z nazwiskami
		
		for (int i = 0; i <= firstNames.length - 1; i++){
				System.out.print(firstLast[0][i]);
				System.out.print(" ");
				System.out.print(firstLast[1][i]);
				System.out.println();
		}
		
	}

}
