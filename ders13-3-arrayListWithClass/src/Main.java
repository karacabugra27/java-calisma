import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(1,"Buğra","Karaca"));
		customers.add(new Customer(2,"Ankara","Malatya"));
		Customer bir = new Customer(1,"Bursa","Adana");
		customers.add(bir);
		customers.remove(bir);
		for(Customer customer : customers) {
			System.out.println(customer.firstName);
		}
		
		
		
		
		}

}
