package cwiczenie_J65;

import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Magazyn {

	Scanner input = new Scanner(new FilterInputStream(System.in){
		@Override
		public void close(){};
	});
	
	String nazwa;
	int ilosc;
	double cena;
	public ArrayList<Magazyn> listaProduktow = new ArrayList<>();
	
	public Magazyn(){}
	public Magazyn(String produkt, int ilosc, double cena) {
		super();
		this.nazwa = produkt;
		this.ilosc = ilosc;
		this.cena = cena;
		listaProduktow.add(this);
	}
	
	public void dodajProdukt(Magazyn m1){
		System.out.println("Podaj nazwê produktu:");
		this.nazwa = input.nextLine();
		System.out.println("Podaj cenê produktu:");
		this.cena = input.nextDouble();
		System.out.println("Podaj iloœæ produktu:");
		this.ilosc = input.nextInt();
		input.nextInt();
		listaProduktow.add(this);
	}
	
	public String wypiszProdukt(){
		return "Produkt: " + this.nazwa + " , cena(jedn.): " + this.cena + " , iloœæ: " + this.ilosc;
	}
	
	public void wypiszWszystkieprodukty(){
		for(Magazyn v: listaProduktow){
			System.out.println(v.wypiszProdukt() + "\n");
		}
	}
}
