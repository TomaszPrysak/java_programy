package cwiczenie_J61_J62_J63_S³awek;

/*
 *  Rozwiñ program Gatunki , w ten sposób, ¿eby:
obiekt typu Gatunek móg³ przechowywaæ dane chromosomów. Powinna to byæ
tablica obiektów typu Chromosom o d³ugoœci odpowiadaj¹cej liczbie
chromosomów

Utwórz klasê Chromosom:
 w ten sposób aby dane dotycz¹ce numeru chromosomu i d³ugoœci ramion by³y
wprowadzane tylko wtedy, jeœli podane liczby s¹ wiêksze od 0 w przypadku numeru
chromosomu i wiêksze lub równe 0 w przypadku d³ugoœci ramion
dodaj konstruktory:
przyjmuj¹cy jako argumenty numer chromosomu i d³ugoœci ramion, pole plciowy ustawiaj¹cy
domyœlnie jako false
 przyjmuj¹cy jako argumenty wszystkie dane
kolejne gatunki by³y przechowywane w tablicy obiektów typu Gatunek
 */

public class Chromosom {
	
	int numerChromosomu, dlugoscRamieniaChromosomu;
	boolean pluciowy;
	
	Chromosom(int nCh, int dCh){
		if(nCh > 0) {
			this.numerChromosomu = nCh;
		}
		
		if(dCh >= 0) {
			this.dlugoscRamieniaChromosomu = dCh;
		}
		this.pluciowy = false;
	}
	
	Chromosom(int nCh, int dCh, boolean pluciowy){
		if(nCh > 0) {
			this.numerChromosomu = nCh;
		}
		
		if(dCh >= 0) {
			this.dlugoscRamieniaChromosomu = dCh;
		}
		this.pluciowy = pluciowy;
	}

}
