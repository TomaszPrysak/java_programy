package java_dzien_drugi;

public class Instrukcja_warunkowa_Switch {

	public static void main(String[] args) {

		// Instrukcja warunkowa SWITCH
		
		String ok = "2"; // deklarujemy zmienn¹ string i inicjalizacj¹ jej przez napis "2"
		
		switch(ok){ // sprawdzenie warunków dla naszej zmiennej,
		
		case "1":
			System.out.println(1); // je¿eli zmienna nasza wynosi tyle co jest napisane po case to wtedy wyœwietli napis po case
			break; // musimy zastosowaæ break je¿eli chemy aby kompilator siê zatrzyma³ na warunku który jest spe³niony. Je¿eli tego nie zrobimy to kompilator mimo, ¿e znajdzie prawid³ow¹ odpowiedz to o tak przejdzie do nastepnego warunku 
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
