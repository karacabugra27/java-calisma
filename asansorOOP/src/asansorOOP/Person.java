package asansorOOP;

public class Person {

	private int kilo;
	private int bulunduguKat;
	private int gidecegiKat;
	
	public Person(int kilo, int bulunduguKat, int gidecegiKat) {
		this.kilo = kilo;
		this.bulunduguKat = bulunduguKat;
		this.gidecegiKat = gidecegiKat;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public int getBulunduguKat() {
		return bulunduguKat;
	}

	public void setBulunduguKat(int bulunduguKat) {
		this.bulunduguKat = bulunduguKat;
	}

	public int getGidecegiKat() {
		return gidecegiKat;
	}

	public void setGidecegiKat(int gidecegiKat) {
		this.gidecegiKat = gidecegiKat;
	}
	
	
	
}
