
public class main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(2023);
		product.setName("Laptop");
		product.setDescription("Asus");
		product.setPrice(5000);
		product.setStock(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
	}

}
