package obsluga_bledow;

public class ObslugaBledow_J89 {
	
	public static void testString(String s){
		
		try{
			
			System.out.println(s.length());
			
		}catch(NullPointerException e){
			
			e.printStackTrace(); // ta funkja powoduje, �e w konsoli wy�wietlamy informacj� o b��dzie
			System.out.println("Nie mo�na poda� d�ugo�ci dla napisu - zosta� przekazany null");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		testString("Test");
		testString(null);
		
	}

}
