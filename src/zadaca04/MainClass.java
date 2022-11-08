package zadaca04;

public class MainClass {
	public static void main(String[] args) {
		Avtomobil obj1 = new Avtomobil();
		
		obj1.marka = "Mercedes Benz";
		obj1.model = "C-class";
		obj1.kilometri = 200000;
		
		Avtomobil obj2 = new Avtomobil ("Volkswagen", "Golf", 120000);
		
		System.out.println(obj1.marka + " " + obj1.model + " " +obj1.kilometri);
		System.out.println(obj2.marka + " " + obj2.model + " " +obj2.kilometri);
	}
}


