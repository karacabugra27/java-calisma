import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, String> sozluk = new HashMap<String,String>();
		sozluk.put("Masa", "Table");
		sozluk.put("Elma", "Apple");
		sozluk.put("Yazılım", "Software");
		System.out.println(sozluk.get("Masa"));
		sozluk.remove("Masa");
		for(String item : sozluk.keySet()) {
			System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
		}
		
		
	}

}
