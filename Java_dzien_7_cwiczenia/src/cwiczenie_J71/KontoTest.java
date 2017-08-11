package cwiczenie_J71;

public class KontoTest {

	public static void main(String[] args) {

		BZWBK kb2 = new BZWBK();
		
		System.out.println(kb2.saldo);
		kb2.addDebit();
		kb2.intrest(154878415, 225000);
		System.out.println(kb2.saldo);
		kb2.addSaldo(-25000);
		System.out.println(kb2.saldo);
		
		PKO kb1 = new PKO();
		
		System.out.println(kb1.saldo);
		kb1.addSaldo(3.25f);
		System.out.println(kb1.saldo);
		kb1.subbSaldo(1f);
		System.out.println(kb1.saldo);
		
	}

}
