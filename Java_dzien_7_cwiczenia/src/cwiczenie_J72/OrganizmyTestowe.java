package cwiczenie_J72;

public class OrganizmyTestowe {

	public static void main(String[] args) {

		Bakteria b1 = new Bakteria();
		b1.przypiszDNA("NFJIWRN");
		b1.zmienSzkodliwosc("bardzo szkodliwa");
		b1.info();
		
		Zwierze z1 = new Zwierze();
		z1.przypiszDNA("FDEERRRRE");
		z1.zmienNogi(8);
		z1.info();
		
		Roslina r1 = new Roslina();
		r1.przypiszDNA("EEEEEE");
		r1.zmienLodyge(36);
		r1.info();

	}

}
