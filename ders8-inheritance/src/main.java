
public class main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.firstName = "Buğra";
		customer.lastName = "Karaca";
		customer.id = 44;
		customer.age = 21;

		Employee employee = new Employee();

		System.out.println(customer.firstName);
	}

}
