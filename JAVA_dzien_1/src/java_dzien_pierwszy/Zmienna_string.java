package java_dzien_pierwszy;

public class Zmienna_string {

	public static void main(String[] args) {
		
		String hello = "Witaj ";
		String world = "Œwiecie";
		
		String powitanie = hello + world; // ³¹czenie dwóch stringów w jeden d³u¿szy, utworzone za pomoc¹ po³¹czeniu zmiennych
		
		String test1 = hello + "w tym gównianym œwiecie"; // ³¹czenie dóch stringów w jeden d³u¿szy, utworzone za pomoc¹ po³¹czenia jednej zmiennej z ci¹giem znaków wpisanych
		
		System.out.println(powitanie);
		
		String czesc = powitanie .substring(0, 6) + "uczniu"; // operacja na zmiennej "powitanie" - wyœwietlenie pierwsze 5 znaków. Wyci¹g okreœlon¹ iloœæ znaków poprzez zdeklarowanie pocz¹tkowej wartoœci i koñcowej
		System.out.println(czesc);

		// Metody na stringach
		
		String words = " Jeden dwa trzy cztery piêæ szeœæ siedem "; // inicjalizacja zmiennej o typie string
		String sub1 = words.substring(2, 7); // ze zmiennej typu string wyœwietla znaki od indeksu 2 do 6
		String sub2 = words.replaceAll("dwa", "hehe"); //zamieniliœmy w naszej zmiennej typu string wyraz "dwa" na wyraz "hehe"
		String sub3 = words.trim(); // poniewa¿ nasz string zawiera spacje przed i po to tym polecenim go przycinamy
		char charat = words.charAt(2); // wyci¹gami pojedynczy znak z naszej zmiennej string
		
		System.out.println(words);
		System.out.println("words.substring(2,7)");
		System.out.println(sub1);
		System.out.println("words.replaceAll(\"dwa\", \"hehe\")");
		System.out.println(sub2);
		System.out.println("words.trim()");
		System.out.println(sub3);
		System.out.println("words.charAt(2)");
		System.out.println(charat);
		
			// aby mo¿na by³o dodaæ coœ do naszej zmiennej string musimy siê posi³kowac obiektem StringBuffer
			StringBuffer nowyBufor = new StringBuffer(words); // tworzymy now¹ zmienn¹ typu StringBuffer i tworzymy 
			nowyBufor.append("dodano nowy ci¹g znaków");
			System.out.print(nowyBufor);
		
	}

}
