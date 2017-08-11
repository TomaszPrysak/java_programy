package dziedziczenie;

public class Zoo {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.color = "Czarny";
		
		System.out.println("Zwierzêta daj¹ g³os: ");
		
		System.out.print("Kot: ");
		
		cat.makeSound();

	}

}
