package com.nttdata.mvn;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * Clase Principal
 * 
 * @author Angelo Visentin
 *
 */
public class App {

	/**
	 * Método Principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Crear objeto número.
		DescriptiveStatistics numero = new DescriptiveStatistics();

		// Impresión de Nombre Ejercicio.
		System.out.println("Ejercicio #1");

		// Números.
		numero.addValue(3);
		numero.addValue(5);
		numero.addValue(13);
		numero.addValue(15);
		numero.addValue(200);

		// Calcular Media.
		double media = numero.getMean();

		// Impresión Media.
		System.out.println("El total de tu media es: " + media);

		// Mensaje EXTRA.
		if (media >= 47.2) {
			System.out.println("Tu Media es muy Alta");
		}

	}
}
