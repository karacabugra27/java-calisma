package asansorOOP;


public class Main {
	public static void main(String[] args) {
		Asansor asansor = new Asansor();

		asansor.kisiBin(new Person(80, 1, 3));
		asansor.kisiBin(new Person(80, 2, 5));
		asansor.kisiBin(new Person(80, 3, 5));


		asansor.ilerle();
	}
}