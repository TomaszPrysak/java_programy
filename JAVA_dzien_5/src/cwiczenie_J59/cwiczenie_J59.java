package cwiczenie_J59;

public class cwiczenie_J59 {
		
	double a;
	char v;
	
	public cwiczenie_J59(double a){
		super();
		this.a = a;
	}
	
	public cwiczenie_J59(char v){
		super();
		this.v = v;
	}
	
	public cwiczenie_J59(double a, char v){
		super();
		this.a = a;
		this.v = v;
	}
	
	public cwiczenie_J59(char v, double a){
		super();
		this.a = a;
		this.v = v;
	}
	
	public static void main(String[] args) {
		
		cwiczenie_J59 jeden = new cwiczenie_J59(2);
		
		cwiczenie_J59 dwa = new cwiczenie_J59('m');

		cwiczenie_J59 trzy = new cwiczenie_J59(2, 'a');
		
		cwiczenie_J59 cztery = new cwiczenie_J59('l', 3.8);
	}

}
