package zadaca03;

public class Glavna {
	public static void main (String[] args) {
		Covek c = new Covek ();
		c.ime = "Goran";
		c.prezime = "Aleksievski";
		c.embg = "1312994430010";
		
		System.out.println("Imeto na covekot e " + c.ime );
		System.out.println("Prezimeto na covek e " + c.prezime );
		System.out.println("Covekot ima maticen broj:" + c.embg);
	}

}
