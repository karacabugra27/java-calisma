
public class main {

	public static void main(String[] args) {
		
		guncelle();
		ekle();
		sil();
		
		int sayi = topla(19, 9);
		System.out.println(sayi);
	
		String mesaj =sehirVer();
		System.out.println(mesaj);
		
	}

	public static void guncelle() {
		System.out.println("güncellendi");
	}

	public static void ekle() {
		System.out.println("eklendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}
	
	public static int topla(int a,int b) {
		return a+b;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
}
