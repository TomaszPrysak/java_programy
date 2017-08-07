package java_dzien_pierwszy;

public class Zmienna_string {

	public static void main(String[] args) {
		
		String hello = "Witaj ";
		String world = "�wiecie";
		
		String powitanie = hello + world; // ��czenie dw�ch string�w w jeden d�u�szy, utworzone za pomoc� po��czeniu zmiennych
		
		String test1 = hello + "w tym g�wnianym �wiecie"; // ��czenie d�ch string�w w jeden d�u�szy, utworzone za pomoc� po��czenia jednej zmiennej z ci�giem znak�w wpisanych
		
		System.out.println(powitanie);
		
		String czesc = powitanie .substring(0, 6) + "uczniu"; // operacja na zmiennej "powitanie" - wy�wietlenie pierwsze 5 znak�w. Wyci�g okre�lon� ilo�� znak�w poprzez zdeklarowanie pocz�tkowej warto�ci i ko�cowej
		System.out.println(czesc);

		// Metody na stringach
		
		String words = " Jeden dwa trzy cztery pi�� sze�� siedem "; // inicjalizacja zmiennej o typie string
		String sub1 = words.substring(2, 7); // ze zmiennej typu string wy�wietla znaki od indeksu 2 do 6
		String sub2 = words.replaceAll("dwa", "hehe"); //zamienili�my w naszej zmiennej typu string wyraz "dwa" na wyraz "hehe"
		String sub3 = words.trim(); // poniewa� nasz string zawiera spacje przed i po to tym polecenim go przycinamy
		char charat = words.charAt(2); // wyci�gami pojedynczy znak z naszej zmiennej string
		
		System.out.println(words);
		System.out.println("words.substring(2,7)");
		System.out.println(sub1);
		System.out.println("words.replaceAll(\"dwa\", \"hehe\")");
		System.out.println(sub2);
		System.out.println("words.trim()");
		System.out.println(sub3);
		System.out.println("words.charAt(2)");
		System.out.println(charat);
		
			// aby mo�na by�o doda� co� do naszej zmiennej string musimy si� posi�kowac obiektem StringBuffer
			StringBuffer nowyBufor = new StringBuffer(words); // tworzymy now� zmienn� typu StringBuffer i tworzymy 
			nowyBufor.append("dodano nowy ci�g znak�w");
			System.out.print(nowyBufor);
		
	}

}
