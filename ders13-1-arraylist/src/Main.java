import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList sayilar = new ArrayList();

		sayilar.add(1);
		sayilar.add(2);
		sayilar.add("Malatya");

		System.out.println(sayilar);

		sayilar.set(0, 2);
		sayilar.set(1, 1);
		sayilar.set(2, "Ankara");
		
		for(Object i : sayilar) {
			System.out.println(i);
		}
		
		sayilar.remove(0);
		
		System.out.println(sayilar);


		sayilar.clear();
		
		System.out.println(sayilar);

	}

}
