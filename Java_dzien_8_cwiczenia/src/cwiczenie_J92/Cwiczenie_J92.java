package cwiczenie_J92;

public class Cwiczenie_J92 {
	
	void canThrowExc() throws Exception{
		if (new java.util.Random().nextInt(5) == 0)
			throw new Exception();
	}
	
	public static void main(String[] args) {
		
		Cwiczenie_J92 z = new Cwiczenie_J92();
		
		int i = 1;
		
		try{
			z.canThrowExc();
			i++;
			z.canThrowExc();
			i++;
			z.canThrowExc();
			i++;
			z.canThrowExc();
			i++;
			z.canThrowExc();
			i++;
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Wyj�tek zosta� wywo�any po: " + i + " losowaniu");
		}
		
		if(i == 6){
			System.out.println("Wyj�tek nie wyst�pi�");
		}
		
	}
	
}
