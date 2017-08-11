package cwiczenie_J68;

public class Punkt2D {

	int x, y;

	public Punkt2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punkt2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public void move(int a, int b){
		this.x = x + a;
		this.y = y + b;
	}
	
	public void print2D(){
		System.out.println("Aktualne po�o�enie (x,y,z): " + this.x + " " + this.y);
	}
	
}
