package nttdata.javat3.business;

/**
 * Clase abstracta que representa a una persona.
 * 
 * @author angelovisentin
 *
 */
public abstract class Person {

	// Variables de Dni y Nombre de la persona.
	protected String dni;
	protected String name;

	/**
	 * Constructor de la clase Person.
	 * 
	 * 
	 * @param dni  el DNI de la persona.
	 * @param name el nombre de la persona.
	 */
	public Person(String dni, String name) {
		this.dni = dni;
		this.name = name;
	}

	/**
	 * Método abstracto para mostrar detalles de la persona.
	 */
	public abstract void showDetails();

}
