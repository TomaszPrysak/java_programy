package cwiczenie_J66;

public class Student {
	
	private String imie, nazwisko;
	private int nr_indeksu;
	public static int id; // oprócz metod s¹ równie¿ pola statyczne które te¿ dzia³aj¹ w obrêbie jednej klasy, ale maj¹ t¹ w³aœciwoœæ, ¿e mo¿na za ich pomoc¹ 
	
	public Student(String imie, String nazwisko, int nr_indeksu) {
		super();
		id++;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nr_indeksu = nr_indeksu;
		System.out.println("Jest ju¿: " + id + " studentów");
	}
	
	

}
