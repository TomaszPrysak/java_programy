package cwiczenie_J68;

public class Punkt {

	public static void main(String[] args) {
		
		Punkt2D p1 = new Punkt2D();
		
		p1.print2D();
		
		p1.move(2, 3);
		
		p1.print2D();
		
		p1.move(3, 1);
		
		p1.print2D();
		
		Punkt3D p2 = new Punkt3D();
		
		p2.print3D();
		
		p2.move(5, 1);
		
		p2.print3D();
		
		p2.move3D(1, 1, 10);
		
		p2.print3D();

	}

}