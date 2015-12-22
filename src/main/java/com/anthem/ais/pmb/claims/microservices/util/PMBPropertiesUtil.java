/**
 * @Apr 29, 2014
 */
package com.anthem.ais.pmb.claims.microservices.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * @author Deloitte
 * 
 */
public class PMBPropertiesUtil extends PropertyPlaceholderConfigurer {

	private static Map<String, String> propertiesMap;
	// Default as in PropertyPlaceholderConfigurer
	private int springSystemPropertiesMode = SYSTEM_PROPERTIES_MODE_FALLBACK;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.config.PropertyPlaceholderConfigurer
	 * #setSystemPropertiesMode(int)
	 */
	@Override
	public void setSystemPropertiesMode(int systemPropertiesMode) {
		super.setSystemPropertiesMode(systemPropertiesMode);
		springSystemPropertiesMode = systemPropertiesMode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.config.PropertyPlaceholderConfigurer
	 * #processProperties
	 * (org.springframework.beans.factory.config.ConfigurableListableBeanFactory
	 * , java.util.Properties)
	 */
	@Override
	protected void processProperties(
			ConfigurableListableBeanFactory beanFactory, Properties props)
			throws BeansException {
		super.processProperties(beanFactory, props);

		propertiesMap = new HashMap<String, String>();
		for (Object key : props.keySet()) {
			String keyStr = (String) key;
			String valueStr = resolvePlaceholder(keyStr, props,
					springSystemPropertiesMode);
			propertiesMap.put(keyStr, valueStr);
		}
	}

	/**
	 * Retrieve the property value for a given key.
	 * 
	 * @param key
	 *            of the property to be retrieved
	 * @return the property value
	 */
	public static String getProperty(String key) {
		String returnValue = null;
		if(propertiesMap.get(key)!=null){
			returnValue=propertiesMap.get(key).toString();
		}
		return returnValue;
	}

}
