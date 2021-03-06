package cwiczenie_J68;

public class Punkt3D extends Punkt2D {
	
	int z;
	
	public Punkt3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public Punkt3D() {
	}
	
	public void move3D(int a, int b, int c){
		super.move(a, b); // wywołanie metody klasy nadrzędnej
		z = z + c; // oraz dorzucenie dodatkowego zapisu
	}
	
	public void print3D(){
		System.out.println("Aktualne położenie (x,y,z): " + this.x + " " + this.y + " " + this.z);
	}
	
}
