package skladowe_statyczne;

public class Statyczne {

	// Normalnie aby siê odwo³ac do metody info wymusza stworzenie jakiegoœ obiektu aby mozna by³o po nazwie obieku i kropce wyœwietliæ nazwê metody i ja uruchomiæ
	
	
	public static void info(){ // z kolei je¿eli metoda jest static to nie musimy tworzyæ nowego obiektu aby siê odwo³aæ do metody
		System.out.println("Jestem info");
	}
	
	public static void main(String[] args) {
		
		// Statyczne s1 = new Statyczne(); // najpeirw tworzymy obiekt danej klasy
		
		// s1.info(); // aby wywo³aæ metdê klasy która nie jest static
		
		info(); // je¿eli ustawimy metodê jako static to uruchamiamy j¹ tylko poprzez jej nazwê
		
	}

}
