package java_dzien_drugi;

public class Instrukcja_warunkowa_Switch {

	public static void main(String[] args) {

		// Instrukcja warunkowa SWITCH
		
		String ok = "2"; // deklarujemy zmienn� string i inicjalizacj� jej przez napis "2"
		
		switch(ok){ // sprawdzenie warunk�w dla naszej zmiennej,
		
		case "1":
			System.out.println(1); // je�eli zmienna nasza wynosi tyle co jest napisane po case to wtedy wy�wietli napis po case
			break; // musimy zastosowa� break je�eli chemy aby kompilator si� zatrzyma� na warunku kt�ry jest spe�niony. Je�eli tego nie zrobimy to kompilator mimo, �e znajdzie prawid�ow� odpowiedz to o tak przejdzie do nastepnego warunku 
		case "2":
			System.out.println(2);
			break;
		case "3":
			System.out.println(3);
			break;
		default:
			System.out.println("default");
			break;
		}

	}

}
