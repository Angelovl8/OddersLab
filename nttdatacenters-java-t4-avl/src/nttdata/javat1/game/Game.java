package nttdata.javat1.game;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que representa el juego del pinball.
 * 
 * @author angelovisentin
 *
 */
public class Game {

	// Variables para las tiradas y la puntuación final.
	private static final int SPINS = 3;
	private int score;

	/**
	 * Inicia y ejecuta el juego del pinball.
	 */
	public void launchAndStart() {
		Ball ball = new Ball();
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		// bucle for para generar un número aleatorio entre el 1 y el 10.
		for (int i = 0; i < SPINS; i++) {
			int randomNumber = random.nextInt(10) + 1;
			int totalBounces = ball.bounce(randomNumber);
			score += totalBounces;
			System.out.println("Partida Número " + (i + 1) + " Rebotes: " + totalBounces);

			// if para tener que presionar enter cada vez que se acaba una tirada.
			if (i < SPINS - 1) {
				System.out.println("Presiona Enter para realizar otra tirada...");
				scanner.nextLine();

			}
		}

		System.out.println("--------------------------------------------------");
		System.out.println("Puntuación total: " + score);
		System.out.println("--------------------------------------------------");

	}

	/**
	 * Obtiene la puntuación del juego.
	 * 
	 * @return la puntuación.
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Establece la puntuación del juego.
	 *
	 * @param score la puntuación a establecer.
	 */
	public void setScore(int score) {
		this.score = score;
	}

}

