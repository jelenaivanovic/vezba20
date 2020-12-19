package autobuska_stanica;
//Privatni atribut destinacija (npr. “Novi Sad”).
//Napraviti javnu klasu Polazak u paketu autobuska_stanica koja ima:
//		Privatni atribut vreme koji predstavlja datum i vreme polaska autobusa 
//		(koristiti klasu GregorianCalendar).
//
//		Privatni atribut brojSlobodnihMesta koji predstavlja broj 
//		slobodnih mesta za taj polazak.
//
//		Odgovarajuće javne get i set metode za ove atribute. 

//		Nedozvoljene vrednosti za atribut destinacija su null i prazan String.
//Vreme mora biti različito od null 
//i mora da se odnosi na neki vremenski trenutak posle sadašnjeg,
//a broj slobodnih mesta mora da bude nula ili više.
//U slučaju unosa ovih nedozvoljenih vrednosti potrebno je ispisati reč "GRESKA" na ekranu.
//
//		Redefinisanu metodu toString klase Object koja vraća String u kome se 
//		nalaze svi podaci o polasku uz odgovarajući tekst u formatu
//		“DESTINACIJA:#### VREME:#### BROJ MESTA:####”.

import java.util.GregorianCalendar;

public class Polazak {

	private String destinacija;
	private GregorianCalendar vreme;
	private int brojSlobodnihMesta;
	
	public String getDestinacija() {
		return destinacija;
	}
	
	public void setDestinacija(String destinacija) {
		if(destinacija == null && destinacija == "") {
			System.out.println("Greska");
		
		}else {
			this.destinacija = destinacija;
		}
	}
		
	public GregorianCalendar getVreme() {
		return vreme;
	}
	public void setVreme(int godina, int mesec, int dan) {
		GregorianCalendar kal = new GregorianCalendar(godina, mesec, dan);
		GregorianCalendar now = new GregorianCalendar();
		if(kal == null || kal.before(now)) {
			System.out.println("Greska");
		}else {
			this.vreme = kal;
		}
		
	}
	public int getBrojSlobodnihMesta() {
		return brojSlobodnihMesta;
	}
	public void setBrojSlobodnihMesta(int brojSlobodnihMesta) {
		if(brojSlobodnihMesta >= 0 ) {
			this.brojSlobodnihMesta = brojSlobodnihMesta;
			
		}else {
			System.out.println("Greska");
		}
		
	}

	@Override
	public String toString() {
		return "“DESTINACIJA: "+ this.destinacija + " VREME: "+this.vreme.getTime()+ " BROJ MESTA: "+ this.brojSlobodnihMesta;
	}
	
	

	

}
