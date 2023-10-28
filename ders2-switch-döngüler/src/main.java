
public class main {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("mükemmel geçtiniz");
			break;
		case 'B':
			System.out.println("iyi geçtiniz");
			break;
		case 'C':
			System.out.println("geçtiniz");
			break;
		case 'F':
			System.out.println("kaldınız");
			break;
		default:
			System.out.println("geçerli not giriniz");
		}
		//for döngüsü
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		//while döngüsü
		while (i < 10) {
			System.out.println(i);
			i+=2;
		}
		//do-while döngüsü
		int j = 1;
		do {
			System.out.println(j);
			j+=3;
		} while (j<10);
		
		

	}

}
