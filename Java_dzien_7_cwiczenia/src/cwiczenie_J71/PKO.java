package cwiczenie_J71;

public class PKO extends KontoBankowe {

	@Override
	public void addDebit(){
		System.out.println("Nie ma kont debetowych");
	}

	@Override
	public void intrest(long nrKonta, float debit) {
		System.out.println("Wprowadz nr kont: " + nrKonta + "\nSaldo: " + saldo);
	}

}
