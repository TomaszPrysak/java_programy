package java_dzien_czwarty;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Inne_typy_sekwencyjne {

	public static void main(String[] args) {
		
		// Typy sekwencyjne:
		
		// 1. Listy
		
		// Aby stosowa� listy musimy zaimportowa� bibliotek� list.
		// zasada jest bardzo podobna do tabel, jednak operacje przeprowadzane na listach wykonuje si� inaczej
		// UWAGA!!! deklarowanie listy danego typu odbywa si� poprzez umieszczenie typu w nawiasach ostrych <>
		
		ArrayList<String> lista1 = new ArrayList<String>(); // deklarowanie pustej listy typu string o nazwie lista1
		
		lista1.add("Ala"); // dodanie stringu do naszej lista1 na pozycj� o indeksie  0
		lista1.add("Ola"); // r�wnie� dodanie, zawsze dodaje do listy od ko�ca czy na pozycj� o indeksie 1
		lista1.add("Ala"); // r�wnie� dodanie itd o indeksie 2

		lista1.get(2); // polecenie wydobywa z listy zapisanego w niej tekstu pod indeksem 2
		
		System.out.println(lista1.get(2)); 
		
		System.out.println(lista1); // wy�wietlenie zawarto�ci ca�ej listy w postaci tabli
		
		// p�tla do wy�wietlania zawarto�ci listy 
		
		for (String s: lista1){
			System.out.print(s + " "); 
		}
		
		System.out.println("\nWileko�� listy: " + lista1.size()); // polecenie do wy�wietlenia wielko�ci listy
		
		lista1.remove(1); // usuwanie pozycji z lity pod konkretnym indeksem
		System.out.println(lista1);
		
		lista1.remove("Ala"); // usuwanie pozycji poprzez wpisanie bezpo�redniego tekstu jaki taki jaki wyst�puje w li�cie. UWAGA!!! je�eli liest kilka takich samych to usunie pierwszy kt�ry znajdzie
		System.out.println(lista1);
		
		lista1.set(0, "Ela"); // modyfikacje pozycji pod konkretnym indeksem, kt�ry istnieje w li�cie
		System.out.println(lista1);
		
//		lista1.set(1, "Ola"); // je�eli chcemy zmodyfikowa� indeks kt�ry nie istnieje to wyrzuca nam b��d
		
		lista1.add(0, "Ola"); // dodaje do listy kolejn� zawarto�� pod konkretny indeks. Je�eli co� si� tam znajdowa�o to przesunie ca�� lista o jeden w lewo tak aby pod tym indeksem kt�ry chcemy wstawi� nowy element
		System.out.println(lista1);
		
		// 2. Zbiory
		
		// Aby stosowa� zbiory musimy zaimportowa� bibliotek� zbior�w.
		// zasada jest bardzo podobna do tabel, jednak operacje przeprowadzane na zbiorach wykonuje si� inaczej
		// UWAGA!!! deklarowanie zbioru danego typu odbywa si� poprzez umieszczenie typu w nawiasach ostrych <>
		// Zbiory nie s� indeksowane, nie mo�emy 
		
		HashSet<Integer> zbior = new HashSet<Integer>(); // deklaracja pustego ziobru typu integer
		
		zbior.add(2); // dodanie do zbioru naszej liczby integer
		zbior.add(5); // te� dodanie
		zbior.add(1); // te� dodanie 
		zbior.add(1); // te� dodanie
		
		System.out.println(zbior); // UWAGA!!! w�a�ciwo�ci� zioru jest to, �e je�eli wprowadzamy liczby nie pokolei i na dodatek s� jakie� zdublowane warto�ci to zbiory dodatkowo sortuj� i usuwaj� duplikaty. Do zbior�w nie ma znaczenia kolejno�� dodawania element�w
		
		HashSet<Integer> zbior2 = new HashSet<Integer>();
		zbior2.add(9);
		zbior2.add(8);
		zbior2.add(7);
		zbior2.addAll(zbior); // dodanie do jednego zbioru innego zbioru i od razu dokonywana jest sortowanie nie ma znaczenia czy co� by�o wprwadzane wczesniej itd
		System.out.println(zbior);
		System.out.println(zbior2);
		
		HashSet<String> zbior3 = new HashSet<String>(); // zbiory mog� by� r�wnie� stringowe, podobno je sortuje alfabetycznie
		zbior3.add("Tomek");
		zbior3.add("Piotrek");
		zbior3.add("Ala");
		System.out.println(zbior3);
		System.out.println(zbior3.contains("Ala")); // sprawdzenie czy w zbiorze co� si� znajduje, zwraca true / false
		System.out.println(zbior2.contains(8));
		System.out.println(zbior3.size()); // sprawdzenie wielko�ci zbioru
		
		System.out.println(zbior3.remove("Ala")); // operacja remove zwraca warto�� true/false poniewa� mo�emy chcec usun�� cos czego nie ma, wtedy zwroci false, je�eli usuniemy co� cos jest to zwroci true
		zbior3.remove("Ala"); // usuni�cie elementu ze zbioru
		System.out.println(zbior3);
		zbior3.clear(); // czyszczenie zbioru
		System.out.println(zbior3);
		
		// 3. Mapy
		// Aby stosowa� mapy musimy zaimportowa� bibliotek� map.
		// UWAGA!!! deklarowanie mapy danego typu odbywa si� poprzez umieszczenie typu w nawiasach ostrych <> zar�wno typu klucza jak i jakiego typu bed� warto�ci wprowadzane warto�ci
		
		HashMap<Integer,String> mapa = new HashMap<Integer,String>();
		
		mapa.put(1, "Tomek"); // umieszczanie warto�ci w mapie z przypisanymi do niej kluczami
		mapa.put(2, "Olga"); // to r�wnie� umieszczanie w mapie, nale�y pami�ta� o s��wku put
		
		System.out.println(mapa); // wy�wietlenie zawarto�ci mapy wraz z przypisanymi kluizcami i warto�ciami
		System.out.println(mapa.size()); // zwraca 
		System.out.println(mapa.get(1)); // dostanie si� do odpowiedniej warto�ci w mapie wpraowadzamy klucz jaki zosta� jej przypisany. Je�eli b�dziemy chceli si� odnie�� do  nieistniej�cego klucza dostaniemy zwrot null
		System.out.println(mapa.keySet()); // wypisuje klucze jakie znajduja si� w mapie
		System.out.println(mapa.values()); // wypisuje warto�ci jakie znajduj� si� w mapie
		mapa.remove(1, "Tomek"); // usuwa klucz wraz z warto�ci� do niej przypisan�
		mapa.clear(); // czy�ci zawartos� mapy
		System.out.println(mapa);
		
		// 4. Kolejki / Stosy
		// Aby stosowa� kolejki musimy zaimportowa� bibliotek� kolejki.
		// Dzia�aj� one na zasadzie, �e mo�emy dodawa� do niej warto�ci na pocz�tku lub na ko�cu, pobiera� zawarto�� z pocz�tku z jednoczesnym usuwaniem ze stosu albo zostawianiem jej w stosie
		
		
		ArrayDeque<String> stos = new ArrayDeque<String>();
		stos.add("napis1"); // dodanie do stosu w kolejnosci dodawania
		stos.add("napis2");
		stos.add("napis3");
		System.out.println(stos);
		stos.addFirst("napis pocz�tkowy"); // najwi�ksza u�yteczno�� sotsu to mo�liwo�� dodawania na pocz�tku stosu jakiej� warto�ci...
		stos.addLast("napis ko�cowy"); // albo na ko�cu
		System.out.println(stos);
		
		String a = stos.pollFirst(); // zdj�cie ze stosu i przypisanie do zmiennej oraz usuni�cie ze stosu  warto�ci w stosie znajduj�cej si� na pierwszym miejscu
//		String b = stos.pollLast();
		System.out.println(a);
		System.out.println(stos);
		
		String c = stos.getLast(); // zdj�cie ze stosu i przypisanie do zmiennej oraz pozostawienie w stosie warto�ci znajeuj�cej si� na ostatnim miejscu
//		String d = stos.getFirst();
		System.out.println(c);
		System.out.println(stos);
		
		stos.remove("napis2"); // usuwa konkretn� warto�� w stosie
		System.out.println(stos);
		System.out.println(stos.size()); // zwraca wielko�� stosu
		
		
		
	}

}
