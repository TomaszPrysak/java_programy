package cwiczenie_J66;

public class Student {
	
	private String imie, nazwisko;
	private int nr_indeksu;
	public static int id; // opr�cz metod s� r�wnie� pola statyczne kt�re te� dzia�aj� w obr�bie jednej klasy, ale maj� t� w�a�ciwo��, �e mo�na za ich pomoc� 
	
	public Student(String imie, String nazwisko, int nr_indeksu) {
		super();
		id++;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nr_indeksu = nr_indeksu;
		System.out.println("Jest ju�: " + id + " student�w");
	}
	
	

}
