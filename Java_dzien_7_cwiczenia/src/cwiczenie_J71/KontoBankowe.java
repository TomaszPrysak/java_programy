package cwiczenie_J71;

public abstract class KontoBankowe {
	
	public long nrKonta;
	public float saldo;
	
	public void addSaldo(float kwota){
		this.saldo = saldo + kwota;
	}
	
	public void subbSaldo(float kwota){
		this.saldo = saldo - kwota;
	}
	
	public abstract void intrest(long nrKonta, float debit);
	
	public abstract void addDebit();
	
	
}
