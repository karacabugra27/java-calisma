
public class Main {

	public static void main(String[] args) {

		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.id = 1283;
		product.name = "Klavye";
		product.price = 500;
		productManager.add(product);
	}

}
