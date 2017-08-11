package dziedziczenie;

public class CatSyjamski extends Cat {
	
	public static void main(String[] args) {
	
		CatSyjamski syjam = new CatSyjamski();
		
		syjam.liczbaNog = 4;
		syjam.umaszczenie = "bia³y";
		
		System.out.println(syjam.liczbaNog + " " + syjam.umaszczenie);
		
		syjam.makeSound();
		
	}
}
