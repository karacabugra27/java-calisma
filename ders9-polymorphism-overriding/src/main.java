
public class main {

	public static void main(String[] args) {
//		BaseLogger[] baseLogger = new BaseLogger[]
//				{new DatabaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};
//		
//		for(BaseLogger logger : baseLogger) {
//			logger.log("loglandı dostum");
//		}
		
		CustomerManager customerManager = new CustomerManager(new EmailLogger());
		customerManager.add();
		
	}

}
