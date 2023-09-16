package nttdata.javat3.business;

/**
 * Interfaz que define el Servicio de Gestón de Personas.
 * 
 * @author angelovisentin
 *
 */
public interface ManagementService {

	/**
	 * Método para agregar una persona al sistema.
	 * 
	 * @param type     el tipo de persona que agregar ("Employee = E" o "Student =
	 *                 S").
	 * @param name     el nombre de la persona.
	 * @param dni      el DNI de la persona.
	 * @param school   el centro educativo de la persona.
	 * @param modality la modalidad (DAM/DAW) que cursa (solo para estudiantes).
	 * @param category la categoría a la que pertenece (solo para empleados).
	 * @param project  el proyecto al que pertenece (solo para empleados).
	 */
	void addPerson(String type, String name, String dni, String school, String modality, String category,
			String project);


	/**
	 * Método para mostrar todas las personas del sistema.
	 */
	void showAllPersons();
}
