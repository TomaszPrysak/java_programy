package skladowe_statyczne;

public class Statyczne {

	// Normalnie aby si� odwo�ac do metody info wymusza stworzenie jakiego� obiektu aby mozna by�o po nazwie obieku i kropce wy�wietli� nazw� metody i ja uruchomi�
	
	
	public static void info(){ // z kolei je�eli metoda jest static to nie musimy tworzy� nowego obiektu aby si� odwo�a� do metody
		System.out.println("Jestem info");
	}
	
	public static void main(String[] args) {
		
		// Statyczne s1 = new Statyczne(); // najpeirw tworzymy obiekt danej klasy
		
		// s1.info(); // aby wywo�a� metd� klasy kt�ra nie jest static
		
		info(); // je�eli ustawimy metod� jako static to uruchamiamy j� tylko poprzez jej nazw�
		
	}

}
