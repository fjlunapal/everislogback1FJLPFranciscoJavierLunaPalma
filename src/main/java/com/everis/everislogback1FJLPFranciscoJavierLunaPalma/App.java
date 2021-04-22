package com.everis.everislogback1FJLPFranciscoJavierLunaPalma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ejercicio Logback
 * 
 * @author flunapal
 *
 */

public class App {
	/** LOGGER */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * 
	 * Principal Method
	 * 
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		LOGGER.info("Method start");
		for (int i = 0; i <= 777; i++) {
			LOGGER.debug("Iteration number: {}",i);
		}
		LOGGER.info("Method end");

	}
}
