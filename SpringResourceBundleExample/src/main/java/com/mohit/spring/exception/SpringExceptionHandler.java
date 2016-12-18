package com.mohit.spring.exception;

import java.io.Serializable;

import com.mohit.spring.utils.CommonUtils;
import com.mohit.spring.utils.LogFactory;
import com.mohit.spring.utils.SpringConstants;
import com.mohit.spring.utils.SpringLogger;

public class SpringExceptionHandler implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Instance of BSMLogger
	 */
	private static final SpringLogger LOGGER = LogFactory.getLogger(SpringExceptionHandler.class);

	/**
	 * Handles the exception that is passed as an argument to this method.
	 * 
	 * @param throwable
	 *            - instance of the exception which is to be handled
	 * @throws SpringException
	 */
	public void handleException(Throwable throwable) {
		final String METHOD_NAME = "handleException";
		LOGGER.logInfo(METHOD_NAME, "Enter");
		SpringException excep = null;
		try {
			throw throwable;
		} catch (SpringException SpringException) {
			excep = SpringException;
			CommonUtils.setExceptionMessage(excep);
			if (SpringException.getSeverity().equalsIgnoreCase(SpringConstants.SEVERITY_ERROR)) {
				LOGGER.logError(METHOD_NAME, SpringException.getExceptionMessage());
				logException(excep);
			} else if (SpringException.getSeverity().equalsIgnoreCase(SpringConstants.SEVERITY_WARN)) {
				LOGGER.logWarn(METHOD_NAME, SpringException.getExceptionMessage());
			} else if (SpringException.getSeverity().equalsIgnoreCase(SpringConstants.SEVERITY_INFO)) {
				LOGGER.logInfo(METHOD_NAME, SpringException.getExceptionMessage());
			} else {
				logException(excep);
			}
		} catch (Throwable bre) {

			excep = new SpringException(SpringConstants.GENERIC, METHOD_NAME, bre, null,
					SpringConstants.SEVERITY_ERROR);
			CommonUtils.setExceptionMessage(excep);
			logException(excep);
		}
		LOGGER.logInfo(METHOD_NAME, "Exit");
	}

	/**
	 * Logs BSM Exception
	 * 
	 * @param SpringException
	 */
	private void logException(SpringException be) {
		LOGGER.logError("logException", be.getDetailMessage());
	}

}
