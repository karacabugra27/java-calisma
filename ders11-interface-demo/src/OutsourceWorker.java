
public class OutsourceWorker implements IWorkable,IEatable{
	public OutsourceWorker() {
		System.out.println("Firma Çalışanı");
	}
	
	@Override
	public void work() {
		System.out.println("7 saat ");
	}

	@Override
	public void eat() {
		System.out.println("ücretsiz yemek");
	}

}
