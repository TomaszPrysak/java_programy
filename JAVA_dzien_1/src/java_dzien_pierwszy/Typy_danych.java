package java_dzien_pierwszy;

public class Typy_danych {
	
	public static void main(String[] args) {
	
	//Sposób deklarowania zmienych i deklarowanie do niej typu danych
	
	float liczbaFloat = 25.75f; // najpierw deklarujemy typ danych dla zmiennej, a nastêpniej jej nazwê i wartoœæ. W przypadku zmiennej float na koñcu dodajemy f
	int liczbaInt = 25; // to jest inaczej deklaracja i inicjalizowanie naszej zmiennej, to znaczy, ¿e deklarujemy typ zmiennej i przypisanie wartoœci do zmiennej
	char znakA = 'A'; // ten typ zmianych zapisuje tylko JEDEN znak
	boolean czyUczProg = true;
	
	System.out.println("Liczba float:");
	System.out.println(liczbaFloat); // mo¿emy wypisaæ wartoœæ poprzez przypisanej jej zmiennej
	System.out.println(25.75);	// b¹dz poprzez bezpoœrednie wpisanie wartoœci liczby do polecenia print
	System.out.println("Liczba int:");
	System.out.println(liczbaInt);
	System.out.println(25);
	System.out.println("Znak:");
	System.out.println(znakA);
	System.out.println("A");
	System.out.println("Czy uczê siê programowaæ (wartoœæ logiczna):");
	System.out.println(czyUczProg);
	System.out.println(true);
	
	}
}
