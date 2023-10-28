
public class Main {

	public static void main(String[] args) {
		
		try {
			int[] sayilar = new int[] {1,2,3};
			System.out.println(sayilar[4]);
			
		} catch (StringIndexOutOfBoundsException exception) {
			System.out.println(exception);
			
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		} catch (Exception exception) { //exception ana exception olduğundan hepsini içerir. hepsi buradan extend olur.
			System.out.println("loglandı " + exception);
		}
		
		finally {
			System.out.println("Ben her türlü çalışırım.");
		}
		
		
		
	}

}
