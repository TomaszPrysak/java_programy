package java_dzien_drugi;

public class Instrukcja_warunkowa_If_Else {

	public static void main(String[] args) {
	
		// Instrukcja warunkowa IF-IF-ELSE
		
		int a = 100;
		int b = 101;
		int c = 105;
		
		if(a>b){
			if(a>c){
				System.out.println("A>B oraz A>C");
			}
			else{
				System.out.println("A>B ale A<C");
			}
		}
		else if(a == b){
			System.out.println("A==B");
		}
		else{
			System.out.println("A<B oraz A!=B");
		}
		
	}

}
