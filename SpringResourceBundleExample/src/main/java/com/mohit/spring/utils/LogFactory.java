package com.mohit.spring.utils;

public class LogFactory {

	/**
	 * Gets the application LOGGER.
	 * 
	 * @param clazz
	 *            Logging to be done for the Class
	 * @return SpringLogger
	 */
	@SuppressWarnings(SpringConstants.UNCHECKED)
	public static SpringLogger getLogger(Class clazz) {
		return new SpringLogger(clazz);
	}

}
