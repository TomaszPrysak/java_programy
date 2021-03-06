package java_dzien_czwarty_cwiczenia;

import java.util.Random;

public class Cwiczenie_J45 {

	public static void main(String[] args) {
		
		int [][] tab = new int [5][5];
		
		Random gen = new Random();
		
		for (int i = 0; i <= tab.length - 1; i++){
			for (int j = 0; j <= tab.length - 1; j++){
			tab[i][j] = gen.nextInt(11) - 5;
			System.out.print("\t" + tab[i][j]);
			System.out.print(" ");
			}
			System.out.println();
		}
		
		// min max
		
		int kolMax = 0;
		int kolMin = 0;
		int[][] maxMin = new int[2][5];
		
		for (int i = 0; i < tab.length; i++){
			for (int j = 0; j < tab[i].length; j++){
				if (kolMax < tab[j][i]){
					kolMax = tab[j][i];
				}
				if (kolMin > tab[j][i]){
					kolMin = tab[j][i];
				}
			}
			maxMin[0][i] = kolMax;
			maxMin[1][i] = kolMin;
			
			kolMax = 0;
			kolMin = 0;
		}

		for (int i = 0; i < maxMin.length; i++){
			for (int j = 0; j < maxMin[i].length; j++){
				System.out.print(maxMin[i][j] + "\t");
			}
			System.out.println(" ");
		}
		
	}

}