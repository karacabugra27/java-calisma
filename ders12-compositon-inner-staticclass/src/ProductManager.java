
public class ProductManager {

	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) { //class ismiyle çağırabildik çünkü static olarak belirttik.
			System.out.println("Eklendi.");
		}
		else {
			System.out.println("Geçersiz.HATA!");
		}
	}
		
	
}
