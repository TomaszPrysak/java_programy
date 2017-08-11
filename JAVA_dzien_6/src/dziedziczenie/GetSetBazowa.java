package dziedziczenie;

public class GetSetBazowa {
	
	public String imie;
	public String nazwisko;
	private int pesel;
	
	private void infoBaza(){
		System.out.println("Info z bazy");
	}
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public int getPesel() {
		return pesel;
	}
	public void setPesel(int pesel) {
		this.pesel = pesel;
	}
	
	public GetSetBazowa(){}
	
	public GetSetBazowa(String imie) {
		super();
		this.imie = imie;
	}

	
	public GetSetBazowa(int pesel) {
		super();
		this.pesel = pesel;
	}
	
	public GetSetBazowa(String imie, int pesel) {
		super();
		this.imie = imie;
		this.pesel = pesel;
	}

	
	
}
