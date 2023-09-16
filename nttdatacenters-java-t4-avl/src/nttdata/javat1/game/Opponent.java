package nttdata.javat1.game;

import java.util.Random;

/**
 * Clase que representa al oponente en el juego de pinball, puede ser NTT o
 * ACCENTURE el oponente.
 * 
 * @author angelovisentin
 *
 */
public class Opponent {

	// Variable que almacena puntuación del oponente.
	private int score;

	/**
	 * Método que simula las jugadas del oponente y actualiza la puntuación a la
	 * tabla de clasificación.
	 */
	public void playGames() {
		Random random = new Random();

		// Mismo bucle for que observamos antes para la clase game.
		for (int i = 0; i < 3; i++) {
			int randomNumber = random.nextInt(10) + 1;
			score += randomNumber;
		}
	}

	/**
	 * Método que devuelve la puntuación actual del oponente.
	 * 
	 * @return la puntuación del oponente.
	 */
	public int getScore() {
		return score;
	}
}


