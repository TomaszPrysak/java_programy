package dziedziczenie;

public class Zoo {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.color = "Czarny";
		
		System.out.println("Zwierz�ta daj� g�os: ");
		
		System.out.print("Kot: ");
		
		cat.makeSound();

	}

}
