package com.anthem.ais.pmb.claims.microservices.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *                               Logger class to be used across application
 * 
 * @author Deloitte
 * 
 */
public class PMBLogger {

	private Logger logger = null;

	private PMBLogger(Class clazz) {
		this.logger = LoggerFactory.getLogger(clazz);
	}

	public boolean isInfoEnabled() {
		return this.logger.isInfoEnabled();
	}

	public boolean isDebugEnabled() {
		return this.logger.isDebugEnabled();
	}

	public void debug(String message) {
		this.logger.debug((message));
	}

	public void debug(String message, Throwable exception) {
		this.logger.debug(message, exception);
	}

	public void info(String message) {
		this.logger.info((message));
	}

	public void info(String message, Throwable exception) {
		this.logger.info(message, exception);
	}

	public void error(String message) {
		this.logger.error(message);
	}

	public void error(String message, Throwable exception) {
		this.logger.error(message, exception);
	}

	public static final PMBLogger getCiiLogger(Class clazz) {
		PMBLogger ciiLogger = new PMBLogger(clazz);
		return ciiLogger;
	}

	
}
