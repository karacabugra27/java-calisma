import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> sehirler = new ArrayList<String>();

		sehirler.add("Malatya");
		sehirler.add("Ankara");
		sehirler.add("Elazığ");

		Collections.sort(sehirler);
		
		for(String sehir : sehirler) {
			System.out.println(sehir);
		}

	}

}
