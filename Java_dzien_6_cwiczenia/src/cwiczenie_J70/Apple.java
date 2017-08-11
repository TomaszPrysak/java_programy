package cwiczenie_J70;

public class Apple extends Fruit {

	String odmiana, seria;

	public Apple(String odmiana) {
		super();
		this.odmiana = odmiana;
		this.seria = "Jab³ko";
	}
	
	public void printInfo(){
		super.printInfo();
		System.out.println("Typ: " + this.seria);
		System.out.println("Odmiana: " + this.odmiana);
	}
	
}
