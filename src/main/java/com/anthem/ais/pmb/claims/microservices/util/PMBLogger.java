package com.anthem.ais.pmb.claims.microservices.util;

import org.owasp.esapi.Logger;
import org.owasp.esapi.reference.Log4JLogFactory;

/**
 * @com.wellpoint.cii.common.log
 * 
 *                               Logger class to be used across application
 * 
 * @filename CiiLogger.java
 * @date Apr 23, 2014
 * @author Deloitte
 * 
 */
public class PMBLogger {

	private Logger logger = null;

	private PMBLogger(Class clazz) {
		this.logger = Log4JLogFactory.getInstance().getLogger(clazz);
	}

	public boolean isInfoEnabled() {
		return this.logger.isInfoEnabled();
	}

	public boolean isDebugEnabled() {
		return this.logger.isDebugEnabled();
	}

	public void debug(String message) {
		this.logger.debug(Logger.EVENT_SUCCESS,(message));
	}

	public void debug(String message, Throwable exception) {
		this.logger.debug(Logger.EVENT_FAILURE,message, exception);
	}

	public void info(String message) {
		this.logger.info(Logger.EVENT_SUCCESS,(message));
	}

	public void info(String message, Throwable exception) {
		this.logger.info(Logger.EVENT_SUCCESS,message, exception);
	}

	public void error(String message) {
		this.logger.error(Logger.EVENT_FAILURE,message);
	}

	public void error(String message, Throwable exception) {
		this.logger.error(Logger.EVENT_FAILURE,message, exception);
	}

	public static final PMBLogger getCiiLogger(Class clazz) {
		PMBLogger ciiLogger = new PMBLogger(clazz);
		return ciiLogger;
	}

	
}
