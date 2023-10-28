
public class main {

	public static void main(String[] args) {
		
		String ogrenciler[] = { "Bugra", "Ali", "Veli" };

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-----------------------------------------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);

		}
		System.out.println("-----------------------------------------");
		String sehirler[][] = new String[2][3];

		sehirler[0][0] = "Malatya";
		sehirler[0][1] = "Elazığ";
		sehirler[0][2] = "Kayseri";
		sehirler[1][0] = "Bursa";
		sehirler[1][1] = "Ankara";
		sehirler[1][2] = "İzmir";

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("-----------------------------------------");
		}

	}

}
