package cwiczenie_J71;

public class BZWBK extends KontoBankowe {

	@Override
	public void intrest(long nrKonta, float debit) {
		this.saldo = saldo + debit;
		System.out.println("Wprowadz nr kont: " + nrKonta + "\nSaldo: " + this.saldo);
	}

	@Override
	public void addDebit() {
		System.out.println("Nie ma kont debetowych");
	}
}
