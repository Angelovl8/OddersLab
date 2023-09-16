package com.nttdata;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import java.util.Random;



/**
 * Clase Principal
 * 
 * @author Angelo Visentin
 *
 */
public class App {
	
	/** Logger */
	private static final Logger LOG = ( Logger ) LoggerFactory.getLogger(App.class);
	
	/**
	 * Método Principal
	 * 
	 * @param args
	 */
    public static void main( String[] args ){
    	LOG.info("Inicio del Programa");
    	
    	//Creamos para conseguir números random.
    	
    	Random random= new Random();
    	
    	//Variables que nos dan entre el número 0 y 4999.
    	int num1= random.nextInt(5000);
    	int num2= random.nextInt(5000);
    	
    	
    	LOG.debug("Valor de número 1 = {} y Valor de número 2 = {}", num1, num2);
    	
    	//Sumamos los dos valores aleatorios. 
    	int result = num1 + num2;
    	LOG.info("Resultado de la Multiplicacion: {}", result );
    	
    	
    	//realizamos un bucle para poder conseguir más de 50Kb y así que se nos generen los zips.
        for (int num4= Integer.valueOf(0); num4<1000000000; num4++ ) {
        	LOG.debug("Resultado {}" , num4);
        	
        	
        }
    	
    	
        LOG.info("Final del Programa");
    	
    	
         
    }
}
