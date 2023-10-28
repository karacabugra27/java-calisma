
public class main {

	public static void main(String[] args) {
		
		Worker worker = new Worker();
		worker.eat();
		worker.work();
		worker.salary();
		
		System.out.println("---------------------------");
		
		OutsourceWorker oWorker = new OutsourceWorker();
		oWorker.eat();
		oWorker.work();
	}

}
