package java_dzien_czwarty_cwiczenia;

public class Cwiczenie_J47 {

	public static void main(String[] args) {
		
		int[][] mJ = new int [3][3]; // mJ1 = macierz jednostkowa pierwsza
//		int[][] mJ2 = new int [3][3]; // mJ2 = macierz jednostkowa druga // nie potrzebna nam druga macierz bo mo�emy doda� pierwsz� macierz do samej siebie
		int[][] mS = new int [3][3]; // mS = macierz sumy dw�ch macierzy jednostkowych
		
		for (int i = 0; i <= mJ.length - 1; i++){
			for (int j = 0; j < 3; j++){
				if(i == j){
					mJ[i][j] = 1;
				}
			}
		}
		
		for (int i = 0; i < 3; i++){
			for(int j = 0; j < mJ.length; j++){
			mS[i][j] = mJ[i][j] + mJ[i][j];
			System.out.print("\t" + mS[i][j]);
			}
			System.out.println("");
		}

	}

}
