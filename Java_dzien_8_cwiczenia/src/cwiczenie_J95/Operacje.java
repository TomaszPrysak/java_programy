package cwiczenie_J95;

public class Operacje {
	
	private double x;
	private double y;
	
	public Operacje() {
		super();
	}

	public Operacje(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double dodawanie(double x, double y){
		return (x + y);
	}
	
	public double odejmowanie(double x, double y){
		return (x - y);
	}

	public double mnozenie(double x, double y){
		return (x * y);
	}
	
	public double dzielenie(double x, double y){
		return (x/y);
	}
	
}
