
public abstract class GameCalculator {
	public abstract void Hesapla();// bu classı implement eden classlar abstract classı içermek ve override etmek zorunda.

	public final void GameOver() { // bu class override edilemez.
		System.out.println("oyun bitti");
	}
}
