package nttdata.javat3.business;

/**
 * Clase que representa a un Estudiante.
 * 
 * @author angelovisentin
 *
 */
public class Student extends Person {

	// Variables de Centro Educativo y de Modalidad del estudiante.
	private String school;
	private String modality;

	/**
	 * Constructor de la clase Student.
	 * 
	 * @param dni      el DNI del estudiante.
	 * @param name     el nombre deñ estudiante.
	 * @param school   el centro educativo del estudiante.
	 * @param modality la modalidad (DAW/DAM) que cursa el estudiante.
	 */
	public Student(String dni, String name, String school, String modality) {
		super(dni, name);
		this.school = school;
		this.modality = modality;
	}



	/**
	 * Método para mostrar los detalles del Estudiante.
	 */
	@Override
	public void showDetails() {
		System.out.println("--Estudiante--");
		System.out.println("Nombre: " + name);
		System.out.println("Dni: " + dni);
		System.out.println("Centro Educativo: " + school);
		System.out.println("Modalidad: " + modality);
	}
}