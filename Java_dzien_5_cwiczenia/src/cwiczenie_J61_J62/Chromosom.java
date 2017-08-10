package cwiczenie_J61_J62;

public class Chromosom {
	
	int nrChromosomu;
	int dlChromosomu;
	boolean pluciowy;
	
	Chromosom(int nrChr, int dlChr){
		if(nrChr > 0){
			this.nrChromosomu = nrChr;
		}
		if(dlChr >= 0){
			this.dlChromosomu = dlChr;
		}
		this.pluciowy = false;
	}
	
	Chromosom(int nrChr, int dlChr, boolean pluciowy){
		if(nrChr > 0){
			this.nrChromosomu = nrChr;
		}
		if(dlChr >= 0){
			this.dlChromosomu = dlChr;
		}
		this.pluciowy = pluciowy;
	}
	
	public static void main(String[] args) {
		
		
	}

}
