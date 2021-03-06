package cwiczenie_J65_Michal;

import java.util.ArrayList;
import java.util.Scanner;

public class Magzyn {
	private String nazwa; 
	private int cena;
	private int ilosc;
	public int id = 1;
	public ArrayList<Magzyn> produkty = new ArrayList<Magzyn>();
	Scanner sc = new Scanner(System.in);
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getIlosc() {
		return ilosc;
	}
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	public void zmienStan(){
		sc.nextLine();
		System.out.println("Podaj id produktu: ");
		id = sc.nextInt();
		System.out.println("Zmien ilość: ");
		produkty.get(id-1).setIlosc(sc.nextInt());
	}
	
	public void dodajProdukt(Magzyn m1){
		sc.nextLine();
		System.out.println("Podaj nazwę: ");
		m1.setNazwa(sc.nextLine());
		System.out.println("Podaj cenę: ");
		m1.setCena(sc.nextInt());
		System.out.println("Podaj ilość: ");
		m1.setIlosc(sc.nextInt());
		produkty.add(m1);
	}
	public void usunProdukt(Magzyn m1){
		System.out.println("Podaj id produktu do usunięcia: ");
		id = sc.nextInt();
		produkty.remove(id-1);
		System.out.println("Produkt usunięto!");
	}
	public void stanyProdukty(){
		for(Magzyn m1 : produkty){
		System.out.println("Nazwa: " + id);
		System.out.println("Nazwa: " + m1.getNazwa());
		System.out.println("Cena: " + m1.getCena());
		System.out.println("Ilosc: " +m1.getIlosc());
		System.out.println("==============================");
		}
	}
}
