
public class main {

	public static void main(String[] args) {
		
		GameCalculator[] gameCalculator = new GameCalculator[]{new KidsGameCalculator(),new ManGameCalculator(),new WomanGameCalculator()};
		
		for(GameCalculator game : gameCalculator) {
			game.Hesapla();
			game.GameOver();
		}
		
		
	}
	

}
