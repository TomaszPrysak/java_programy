package java_dzien_czwarty_cwiczenia;

public class Cwiczenie_J48 {

	public static void main(String[] args) {
		
		int [][] tM = new int [10][10]; // tM - tabliczka mno¿enia
		
		for (int i = 0; i <= tM.length - 1; i++){
			for (int j = 0; j < 10; j++){
				tM[i][j] = (i+1)*(j+1);
				System.out.print("\t" + tM[i][j]);
			}
			System.out.println("");
		}
		

	}

}
