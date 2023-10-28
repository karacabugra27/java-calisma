
public class ProductValidator {

		static {
			System.out.println("Static Constructor çalıştı.");
		}
		public static Boolean isValid(Product product) {
			if(product.price>0 && !product.name.isEmpty()) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public static void sey() {
			
		} 
		
}
