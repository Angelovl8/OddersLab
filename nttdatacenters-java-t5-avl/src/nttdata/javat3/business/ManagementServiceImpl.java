package nttdata.javat3.business;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementación de la interfaz ManagementService que gestiona todo lo
 * relacionado con Persona.
 * 
 * @author angelovisentin
 *
 */
public class ManagementServiceImpl implements ManagementService {
	private Map<String, Person> persons;


	/**
	 * Constructor de la clase ManagementServiceImpl. Inicializa el mapa de
	 * personas.
	 */
	public ManagementServiceImpl() {
		persons = new HashMap<>();
	}

	/**
	 * Mismo método que en ManagementService hemos comentado, pero se le añade para
	 * que según la letra que ponga, añada un Estudiante o un Trabajador.
	 */
	@Override
	public void addPerson(String type, String name, String dni, String school, String modality, String category,
			String project) {
		Person person;

		if (type.equals("E")) {
			person = new Employee(dni, name, category, project);
		} else if (type.equals("S")) {
			person = new Student(dni, name, school, modality);
		} else {
			System.out.println("Tipo de persona inválido " + type);
			return;
		}

		persons.put(dni, person);
	}


	/**
	 * Muestra por pantalla todos los detalles de las personas que se han creado.
	 */
	@Override
	public void showAllPersons() {
		System.out.println();
		System.out.println("Todas las personas existentes");
		System.out.println();
		for (Person person : persons.values()) {
			person.showDetails();
			System.out.println();
		}
	}
}