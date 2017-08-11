package cwiczenie_67;

public class Hurtownia {

	public static void main(String[] args) {
		
		Tyre t1 = new Tyre("Pirelli", "Diablo Rosso Corsa", "ZZKE12158", 17, 60, 155);
		System.out.println(t1.NR + " " + t1.producent + " " + t1.model + " " + t1.seria + " " + t1.rozmiar + " " + t1.wysokosc + " " + t1.wysokosc);
		
		Wheel w1 = new Wheel("BBS", "Pi¹tka", "BBS222r", 18);
		System.out.println(w1.NR + " " + w1.producent + " " + w1.model + " " + w1.seria + " " + w1.cale);
		
		ExhaustPart ep1 = new ExhaustPart("Akrapovic", "MotoGP", "AKRPPee", true);
		System.out.println(ep1.NR + " " + ep1.producent + " " + ep1.model + " " + ep1.seria + " " + ep1.standardEmisji);
		

	}

}
