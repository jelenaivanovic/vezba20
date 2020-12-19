package autobuska_stanica;

public class Test {

	public static void main(String[] args) {
		Polazak p = new Polazak();
		p.setBrojSlobodnihMesta(6);
		p.setVreme(2019,2,3);
		p.setDestinacija("Beograd");
        System.out.println(p.toString());
	}

}
