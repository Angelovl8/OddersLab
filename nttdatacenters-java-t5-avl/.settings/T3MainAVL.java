package nttdata.javat3;

import java.util.Scanner;

import nttdata.javat3.business.ManagementService;
import nttdata.javat3.business.ManagementServiceImpl;

/**
 * Clase principal 
 * Permite agregar y mostrar personas en el sistema.
 * @author angelovisentin
 *
 */
public class T3MainAVL {
	private static ManagementService managementService = new ManagementServiceImpl();
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Muestra un menú de opciones y procesa la opción elegida por el usuario.
	 * @param args 
	 */
	public static void main(String[] args) {

		// Variable para elegir que quieres hacer en el menú.
		int choice;
		do {
			System.out.println("-------Menú de Opciones-------");
			System.out.println();
			System.out.println("1. Agregar Persona.");
			System.out.println("2. Mostrar todas las Personas.");
			System.out.println("3. Salir del Programa.");
			System.out.println();
			System.out.println("Inserte opción: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addPerson();
				break;

			case 2:
				showAllPersons();
				break;

			case 3:
				System.out.println();
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción inválida. Pruebe de nuevo.");
			}
			System.out.println();

		} while (choice != 3);
	}


	/**
	 * Método para agregar una persona al sistema.
	 * Permite al usuario ingresar detalles de la persona como nombre, dni, etc.
	 */
	private static void addPerson() {
		System.out.println();
		System.out.println("Tipo de persona para agregar (E para Empleado, S para Estudiante): ");
		String type = scanner.nextLine();
		System.out.println();
		System.out.println("Nombre: ");
		String name = scanner.nextLine();
		System.out.println();
		System.out.println("Dni (No se puede repetir, si no, no se generará la persona en la aplicación): ");
		String dni = scanner.nextLine();

		if (type.equals("E")) {
			System.out.println();
			System.out.println("Categoría: ");
			String category = scanner.nextLine();
			System.out.println();
			System.out.println("Proyecto: ");
			String project = scanner.nextLine();
			System.out.println();
			System.out.println("Perfecto, has añadido un Employee con éxito.");
			managementService.addPerson(type, name, dni, "", "", category, project);
		} else if (type.equals("S")) {
			System.out.println();
			System.out.println("Centro Educativo: ");
			String school = scanner.nextLine();
			System.out.println();
			System.out.println("Modalidad: ");
			String modality = scanner.nextLine();

			while (!modality.equals("DAW") && !modality.equals("DAM")) {
				System.out.println();
				System.out.println("Modalidad inválida. Las opciones válidas son DAW y DAM. Vuelve a intentarlo.");
				System.out.println("Modalidad: ");
				System.out.println();
				modality = scanner.nextLine().toUpperCase();
			}

			System.out.println();
			System.out.println("Perfecto, has añadido un Student con éxito.");

			managementService.addPerson(type, name, dni, school, modality, "", "");

		} else {
			System.out.println();
			System.out.println("Opción invalida, tienes que poner (E = Employee o S = Student). Vuelve a intentarlo.");
		}
	}

	/**
	 * Método para mostrar todas las personas en el sistema.
	 * 
	 */
	private static void showAllPersons() {
		managementService.showAllPersons();

	}
}