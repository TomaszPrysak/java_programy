package cwiczenie_J61_J62;

import java.util.ArrayList;
import java.util.Random;

public class Gatunek {
	
	String gatunek, rodzaj;
	int liczbaChromosomow;
	Chromosom[] tabChromosomow;
	
	Random gen = new Random();
	
	static ArrayList<Gatunek> listaGatunkow = new ArrayList<Gatunek>();
	
	Gatunek(String gatunek, String rodzaj, int liczbaChromosomow){
		super();
		this.gatunek = gatunek;
		this.rodzaj = rodzaj;
		this.liczbaChromosomow = liczbaChromosomow;
		this.tabChromosomow = new Chromosom[liczbaChromosomow];
		for(int i = 0; i <= tabChromosomow.length; i++){
			tabChromosomow[i] = new Chromosom((i+1), gen.nextInt(50));
		}
		listaGatunkow.add(this);
	}

	public void printGatunki(){
		for (Gatunek v: listaGatunkow){
			if(v.rodzaj.equals(this.rodzaj)){
			System.out.println(v.printWszystkiedane() + "\n\n");
			}
		}
	}
	
	public String printTabchromosomy(){
		String chromosomy = "";
		for(int i = 0; i < tabChromosomow.length; i++){
			chromosomy = chromosomy + "chromosom: " + (i+1) + "\td³ugoœæ: " + this.tabChromosomow[i].dlChromosomu + "\n";
		}
		
		return chromosomy;
	}
	
	public String printRodzajgatunek(){
		return "rodzaj: " + this.rodzaj + " ,gatunek: " + this.gatunek;
	}
	
	public String printLiczbachromosomow(){
		return "liczba chromosomow: " + this.liczbaChromosomow;
	}
	
	public String printWszystkiedane(){
		return this.printRodzajgatunek() + "\n" + this.printLiczbachromosomow();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Wprow");
		
		
//		Gatunek orzelBielik = new Gatunek("bielik", "orze³", 4);
//		Gatunek orzelPrzedni = new Gatunek("przedni", "orze³", 2);
//		Gatunek orzelTylni = new Gatunek("tylni", "orze³", 9);
//		Gatunek orzelBoczny = new Gatunek("boczny", "orze³", 1);
//		
//		System.out.println(orzelBoczny.printWszystkiedane());
//		
//		orzelTylni.printGatunki();
//		
//		Gatunek kotDachowiec = new Gatunek("dachowiec", "kot", 7);
//		Gatunek kotPerski = new Gatunek("perski", "kot", 6);
//		Gatunek kotRadziecki = new Gatunek("radziecki", "kot", 5);
//		
//		System.out.println(kotDachowiec.printWszystkiedane());
//		
//		kotDachowiec.printGatunki();
		
	}

}
