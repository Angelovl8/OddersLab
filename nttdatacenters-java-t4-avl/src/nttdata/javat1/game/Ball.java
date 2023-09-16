package nttdata.javat1.game;

/**
 * Clase que representa la bola en el juego del pinball.
 * 
 * @author angelovisentin
 *
 */
public class Ball {

	// Variable que almacena el número total de rebotes.
	private int totalBounces;

	/**
	 * Método que hace que la bola rebote y acto seguido actualiza el número total
	 * de rebotes.
	 * 
	 * @param randomNumber el número aleatorio que representa el rebote.
	 * @return número total de rebotes después de realizar el actual.
	 */
	public int bounce(int randomNumber) {
		totalBounces += randomNumber;
		return totalBounces;
	}
}
