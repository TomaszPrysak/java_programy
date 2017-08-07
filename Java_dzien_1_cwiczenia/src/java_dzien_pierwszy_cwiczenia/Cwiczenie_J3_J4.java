package java_dzien_pierwszy_cwiczenia;

public class Cwiczenie_J3_J4 {

	public static void main(String[] args) {
		/*
		Program zwraca w oknie wynikowym ci¹g znaków zawarty w poleceniach:
			-System.out.print S
			-System.out.println
		Polecenie print - wyœwietla ci¹gi znaków i pozostaje w tej samej lini. Nastêpne polecenie print wyœwietli ci¹g znaków zaraz za poprzedzaj¹cym wynikiem
		Polecenie println - wyœwietla ci¹g znaków i przenosi siê do nowej lini. Nastêpe polecenie print(ln) bêdzie wykonywane w nowej lini
		*/
		System.out.println("###Program1###");
		
		System.out.print("Pitos³aw\nMiros³aw\nZbigniew");
		System.out.println("Pitos³aw");
		System.out.print("Miros³aw\n");
		System.out.print("Zbigniew");
		System.out.print("Zbigniew" + "Diana\n");
		
		System.out.println("###Program2###");
		
		System.out.print("SQL\nPython\nFront-end\nJava\n");
		System.out.println("SQL");
		System.out.println("Python");
		System.out.println("Front-end");
		System.out.println("Java");
		
		System.out.println("#############");

	}

}
