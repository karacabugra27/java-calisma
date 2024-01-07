package asansorOOP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Asansor asansor = new Asansor();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------");
			System.out.println("1. Kişi Ekle");
			System.out.println("2. İlerle");
			System.out.println("3. Bilgi Göster");
			System.out.println("4. Çıkış");
			System.out.println("-----------------");

			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				System.out.print("Kişinin kilosunu girin: ");
				int kilo = scanner.nextInt();
				System.out.print("Kişinin bulunduğu katı girin: ");
				int bulunduguKat = scanner.nextInt();
				System.out.print("Kişinin gideceği katı girin: ");
				int gidilecekKat = scanner.nextInt();
				asansor.kisiBin(new Person(kilo, bulunduguKat, gidilecekKat));
				break;

			case 2:
				asansor.ilerle();
				asansor.asansorBilgi();
				break;

			case 3:
				asansor.asansorBilgi();
				break;

			case 4:
				System.out.println("...");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Geçersiz");
			}
		}
	}
}
