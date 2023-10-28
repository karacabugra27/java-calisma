
public class Worker implements IWorkable,IEatable,IPayable{
	public Worker() {
		System.out.println("Şirket Çalışanı");
	}
	
	@Override
	public void work() {
		System.out.println("5 saat");
	}

	@Override
	public void eat() {
		System.out.println("ücretsiz yemek");
	}

	@Override
	public void salary() {
		System.out.println("10.000 tl");
	}

}
