package specyfikatory;

public class specyfikatory_testowe {

	public static void main(String[] args) {
		
		GetSet gs1 = new GetSet();
		GetSet gs2 = new GetSet(4, "napis", true);

		System.out.println(gs1.getA()); 
		gs1.setA(15); // w ten spos�b zmieniamy warto�� zmiennej za pomoc� Setters, nie mo�emy tak  gs1.t = "test"; // nie jest widoczne pole t klasy GetSet poniewa� wprowadzilismy Gettery i Settery a nasze pola s� privatem czyli s� widoczne tylko w swojej klasie  
		System.out.println(gs1.getA());
		
		System.out.println(gs2.getA());
		System.out.println(gs2.getT());
		gs2.setT("siemanderko");
		System.out.println(gs2.getT());
		
		System.out.println(gs2.isC());
		gs2.setC(false);
		System.out.println(gs2.isC());
		
	}

}
