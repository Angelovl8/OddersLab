package nttdata.javat3.business;

/**
 * Clase que representa a un Empleado.
 * 
 * @author angelovisentin
 *
 */
public class Employee extends Person {

	// Variables de Categoría y Proyecto del empleado.
	private String category;
	private String project;

	/**
	 * Constructor de la clase Employee.
	 * 
	 * @param dni      el DNI del empleado.
	 * @param name     el nombre del empleado.
	 * @param category la categoría del empleado.
	 * @param project  el proyecto al que pertenece el empleado.
	 */
	public Employee(String dni, String name, String category, String project) {
		super(dni, name);
		this.category = category;
		this.project = project;
	}

	/**
	 * Método para mostrar los detalles del Empleado.
	 */
	@Override
	public void showDetails() {
		System.out.println();
		System.out.println("--Empleado--");
		System.out.println("Nombre: " + name);
		System.out.println("Dni: " + dni);
		System.out.println("Categoría: " + category);
		System.out.println("Proyecto: " + project);
	}
}
