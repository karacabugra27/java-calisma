package asansorOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asansor implements IAsansor {

	private int maxAgirlik;
	private int guncelAgirlik;
	private int guncelKat;
	private boolean kapiAcikMi;
	private ArrayList<Person> kisiler;
	List<Integer> gidilecekKatlar;
	List<Person> inenler;

	public Asansor() {
		this.maxAgirlik = 500;
		this.guncelAgirlik = 0;
		this.guncelKat = 0;
		this.kapiAcikMi = false;
		this.kisiler = new ArrayList<>();
		this.gidilecekKatlar = new ArrayList<>();
		this.inenler = new ArrayList<>();
	}

	
	
	
	@Override
	public void kapiDurum() {

		if (guncelAgirlik > maxAgirlik) {
			System.out.println("dıt dıt dıt!..");
			kapiAcikMi = true;
		} else {
			kapiAcikMi = false;
			System.out.println("Kapı açılıyor!..");
			System.out.println("Kapı kapanıyor!..");
		}
	}

	@Override
	public void goUp(int gidilecekKat) {
	    if (kapiAcikMi == false) {
	        kapiDurum();
	        System.out.println("Yukarı çıkılıyor");
	        while (guncelKat < gidilecekKat) {
	            guncelKat++;
	            System.out.println("Kat: " + guncelKat);
	        }
	        kapiDurum();
	    }
	}

	@Override
	public void goDown(int gidilecekKat) {

		if (kapiAcikMi == false) {
			kapiDurum();
			System.out.println("Aşağı iniliyor");
			while (guncelKat > gidilecekKat) {
				guncelKat--;
				System.out.println("Kat: " + guncelKat);
			}
		}
	}

	@Override
	public void asansorBilgi() {
		kapiDurum();
		if (!kisiler.isEmpty())
			System.out.println("Asansörün Bulunduğu Kat : " + guncelKat);
		System.out.println("kilo " + guncelAgirlik);
	}

	@Override
	public void kisiBin(Person person) {
	    if (guncelAgirlik + person.getKilo() <= maxAgirlik) {
	        kisiler.add(person);
	        guncelAgirlik += person.getKilo();

	    } else {
	        System.out.println("Ağırlık limiti aşıldığı için asansöre alınamadı.");
	    }
	}


	@Override
	public void kisiIn() {
		for (Person person : kisiler) {
			if (person.getGidecegiKat() == guncelKat) {
				inenler.add(person);
			}
		}
		kisiler.removeAll(inenler);
		updateAgirlik();
		inenler.clear();
	}

	private void updateAgirlik() {
		int cikisAgirlik = inenler.stream().mapToInt(Person::getKilo).sum();
		guncelAgirlik -= cikisAgirlik;
		inenler.clear();
	}

	@Override
	public void ilerle() {
		if (!kisiler.isEmpty()) {
			for (Person person : kisiler) {
				gidilecekKatlar.add(person.getBulunduguKat());
				gidilecekKatlar.add(person.getGidecegiKat());
			}

			sirala(gidilecekKatlar);

			for (int gidilecekKat : gidilecekKatlar) {
				if (gidilecekKat > guncelKat) {
					goUp(gidilecekKat);
				} else if (gidilecekKat < guncelKat) {
					goDown(gidilecekKat);
				}
				kisiIn();
			}
		} else {
			System.out.println("Asansörde kimse yok.");
		}
		gidilecekKatlar.clear();
	}

	@Override
	public void sirala(List<Integer> siralanacak) {
		Collections.sort(siralanacak);
	}

}