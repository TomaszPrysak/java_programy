package cwiczenie_J54_J55;

public class Test {
	
	public static void main(String[] arg){
		
		Operacje pierwsza = new Operacje();
		
		System.out.println(pierwsza.dodaj(1, 3));
		System.out.println(pierwsza.dodaj(10, 55, 7));
		System.out.println(pierwsza.dodaj(3.8, 7.4));
		System.out.println(pierwsza.dodaj(4.1, 8.1, 7.1));
		
		System.out.println(pierwsza.odejmij(1, 3));
		System.out.println(pierwsza.odejmij(10, 55, 7));
		System.out.println(pierwsza.odejmij(3.8, 7.4));
		System.out.println(pierwsza.odejmij(4.1, 8.1, 7.1));
		
		pierwsza.printType(pierwsza.odejmij(1, 3));
	}
}
