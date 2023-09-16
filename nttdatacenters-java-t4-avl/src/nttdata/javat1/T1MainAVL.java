package nttdata.javat1;

import java.util.Scanner;
import nttdata.javat1.game.Game;
import nttdata.javat1.game.Opponent;

/**
 * Clase principal que ejecuta el juego del pinball tecnológico.
 * 
 * @author angelovisentin
 *
 */
public class T1MainAVL {

	/**
	 * Método principal que inicia el juego.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Opponent opponent = new Opponent();

		// Variables para arrancar el programa y para los puntos de NTT y de ACCENTURE.
		boolean running = true;
		int nttScore = 0;
		int accentureScore = 0;

		// Bucle while para que el programa se pueda volver a ejecutar.
		while (running) {

			System.out.println();
			System.out.println("-------PINBALL TECNOLÓGICO-------");
			System.out.println();
			System.out.println("Ingresa el nombre del participante:");
			String nombre = scanner.nextLine();

			System.out.println();
			System.out.println("Por favor, selecciona tu equipo: ");
			System.out.println("1. Equipo NTT DATA");
			System.out.println("2. Equipo ACCENTURE");
			int equipo = scanner.nextInt();

			// Switch para elegir equipo NTT o equipo ACCENTURE.
			switch (equipo) {

			case 1:
				// Opción Equipo NTT.
				System.out.println();
				System.out.println(
						"Bienvenido al equipo NTT DATA. Tu misión es ganar a ACCENTURE y lograr liderar el futuro de la consultoría tecnológica.");
				System.out
						.println("Nuestro equipo posee 1 NTT Coin, que equivale a 3 tiradas en la máquina de pinball.");
				System.out.println(
						"Si conseguimos obtener una puntuación mayor que ACCENTURE, nos llevaremos todos sus clientes.");
				System.out.println("¡Que comience el juego!");
				System.out.println("--------------------------------------------------");
				System.out.println();
				System.out.println("REGLAS DEL PINBALL");
				System.out.println("-Los puntos son en base a los rebotes. 1 rebote = 1 punto.");
				System.out.println("-Quien tenga más puntos, gana.");
				System.out.println("--------------------------------------------------");
				System.out.println("Pulsa 1 para canjear un NTT Coin y comenzar a jugar: ");
				int reader = scanner.nextInt();
				System.out.println();
				// if para que si no pulsas la tecla 1 finalice el programa.
				if (reader == 1) {
					Game game1 = new Game();
					game1.launchAndStart();

					nttScore = game1.getScore();
					opponent.playGames();
					accentureScore = opponent.getScore();
				} else {
					System.out.println();
					System.out.println("Error detectado. No has pulsado la tecla 1.");
					System.out.println("Vuelve a correr el programa.");
					running = false;
					break;
				}

				System.out.println();
				System.out.println("-------Menú de Opciones-------");
				System.out.println("1.Volver a jugar");
				System.out.println("2.Ver tabla clasificatoria y volver a jugar");
				System.out.println("3.Finalizar partida");
				int option = scanner.nextInt();
				scanner.nextLine();

				if (option == 2) {
					System.out.println();
					System.out.println("Tabla Clasificatoria");
					System.out.println("Equipo NTT DATA: " + nttScore + " puntos.");
					System.out.println("Equipo ACCENTURE: " + accentureScore + " puntos.");
					System.out.println();

					if (nttScore > accentureScore) {
						System.out.println(
								"Equipo NTT DATA ha ganado, les hemos robado todos sus clientes y el futuro de la consultoría tecnológica es nuestro :) . Muchísimas gracias a nuestro jugador estrella "
										+ nombre);
					} else if (accentureScore > nttScore) {
						System.out.println(
								"Equipo NTT DATA ha perdido, nos han robado todos los clientes y nuestra empresa ha entrado en banca rota :( . Sentimos que no haya ido bien "
										+ nombre);
					} else {
						System.out.println(
								"Hemos empatado, la rivalidad entre compañias continua :D . Gracias por competir como un guerrero "
										+ nombre);
					}

				}

				if (option == 3) {
					System.out.println();
					System.out.println("Partida finalizada...");
					running = false;
				}
				break;

			case 2:
				// Opción Equipo ACCENTURE.
				System.out.println();
				System.out.println(
						"Bienvenido al equipo ACCENTURE. Tu misión es ganar a NTT DATA y lograr liderar el futuro de la consultoría tecnológica.");
				System.out.println(
						"Nuestro equipo posee 1 ACCENTURE Coin, que equivale a 3 tiradas en la máquina de pinball.");
				System.out.println(
						"Si conseguimos obtener una puntuación mayor que NTT DATA, nos llevaremos todos sus clientes.");
				System.out.println("¡Que comience el juego!");
				System.out.println("--------------------------------------------------");
				System.out.println();
				System.out.println("REGLAS DEL PINBALL");
				System.out.println("-Los puntos son en base a los rebotes. 1 rebote = 1 punto.");
				System.out.println("-Quien tenga más puntos, gana.");
				System.out.println("--------------------------------------------------");
				System.out.println("Pulsa 1 para canjear un ACCENTURE Coin y comenzar a jugar: ");
				int reader2 = scanner.nextInt();
				// if para que si no pulsas la tecla 1 finalice el programa.
				if (reader2 == 1) {
					System.out.println();
					Game game2 = new Game();
					game2.launchAndStart();

					accentureScore = game2.getScore();
					opponent.playGames();
					nttScore = opponent.getScore();
				} else {
					System.out.println();
					System.out.println("Error detectado. No has pulsado la tecla 1.");
					System.out.println("Vuelve a correr el programa.");
					running = false;
					break;

				}

				System.out.println();
				System.out.println("-------Menú de Opciones-------");
				System.out.println("1.Volver a jugar");
				System.out.println("2.Ver tabla clasificatoria y volver a jugar");
				System.out.println("3.Finalizar partida");
				int option1 = scanner.nextInt();
				scanner.nextLine();

				if (option1 == 2) {
					System.out.println();
					System.out.println("Tabla Clasificatoria");
					System.out.println("Equipo ACCENTURE: " + accentureScore + " puntos.");
					System.out.println("Equipo NTT DATA: " + nttScore + " puntos.");
					System.out.println();

					if (accentureScore > nttScore) {
						System.out.println(
								"Equipo ACCENTURE ha ganado, les hemos robado todos sus clientes y el futuro de la consultoría tecnológica es nuestro :) . Muchísimas gracias a nuestro jugador estrella "
										+ nombre);
					} else if (nttScore > accentureScore) {
						System.out.println(
								"Equipo ACCENTURE ha perdido, nos han robado todos los clientes y nuestra empresa ha entrado en banca rota :( . Sentimos que no haya ido bien "
										+ nombre);
					} else {
						System.out.println(
								"Hemos empatado, la rivalidad entre compañias continua :D . Gracias por competir como un guerrero "
										+ nombre);
					}
				}

				if (option1 == 3) {
					System.out.println();
					System.out.println("Partida finalizada...");
					running = false;
				}
				break;

			// Opción si no marcas ni 1 ni 2 para NTT o ACCENTURE
			default:
				System.out.println(
						"Si no eliges un equipo válido, no podrás acceder a las normas secretas de cada uno. Te animas a jugar");
			}
		}
		scanner.close();
	}
}

