package specyfikatory;

public class GetSet {
	
	private int a;
	private String t;
	private boolean c;
	
	// Getter i Setter - metody te s�u�� do tego aby odwo�ywac si� do nich i modyfikowac dzi�ki nim pola kt�re s� ustawione jako private.
	// nie mamy mo�liwo�ci w naszej klasie main na ustawienie warto�ci 
	
	public boolean isC() {
		return c;
	}
	public void setC(boolean c) {
		this.c = c;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	
	public GetSet(){}
	public GetSet(int a, String t, boolean c) {
		super();
		this.a = a;
		this.t = t;
		this.c = c;
	}
	
	
	
}
