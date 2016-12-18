package com.mohit.spring.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SpringLogger {
	/**
	 * LOGGER : instance of LOGGER.
	 */
	private final Log LOGGER;

	/**
	 * Constructor for the BSMLogger class.
	 * 
	 * @param clazz
	 *            the input class.
	 */
	@SuppressWarnings(SpringConstants.UNCHECKED)
	public SpringLogger(Class clazz) {
		if (clazz == null) {
			throw new IllegalArgumentException(SpringConstants.CLASS_NULL);
		}
		LOGGER = LogFactory.getLog(clazz);
	}

	/**
	 * Gets if trace is enabled.
	 * 
	 * @return true if trace is enabled else false.
	 */
	public boolean isTraceEnabled() {
		return LOGGER.isTraceEnabled();
	}

	/**
	 * Gets if debug is enabled.
	 * 
	 * @return true if debug is enabled else false.
	 */
	public boolean isDebugEnabled() {
		return LOGGER.isDebugEnabled();
	}

	/**
	 * Gets if Info is enabled.
	 * 
	 * @return true if info is enabled else false.
	 */

	public boolean isInfoEnabled() {
		return LOGGER.isInfoEnabled();
	}

	/**
	 * Gets if warn is enabled.
	 * 
	 * @return true if warn is enabled else false.
	 */

	public boolean isWarnEnabled() {
		return LOGGER.isWarnEnabled();
	}

	/**
	 * Gets if error is enabled.
	 * 
	 * @return true if error is enabled else false.
	 */

	public boolean isErrorEnabled() {
		return LOGGER.isErrorEnabled();
	}

	/**
	 * Gets if fatal is enabled.
	 * 
	 * @return true if fatal is enabled else false.
	 */

	public boolean isFatalEnabled() {
		return LOGGER.isFatalEnabled();
	}

	/**
	 * logs the debug message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 */
	public void logDebug(String methodName, Object object) {
		if (isDebugEnabled()) {
			LOGGER.debug(logFormatMethod(methodName, object));
		}
	}

	/**
	 * logs the debug message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 * @param throwable
	 *            the instance of Throwable.
	 */
	public void logDebug(String methodName, Object object, Throwable throwable) {
		if (isDebugEnabled()) {
			LOGGER.debug(logFormatMethod(methodName, object), throwable);
		}
	}

	/**
	 * logs the debug message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 */
	public void logInfo(String methodName, Object object) {
		if (isInfoEnabled()) {
			LOGGER.info(logFormatMethod(methodName, object));
		}
	}

	/**
	 * logs the debug message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 * @param throwable
	 *            the instance of Throwable.
	 */
	public void logInfo(String methodName, Object object, Throwable throwable) {
		if (isInfoEnabled()) {
			LOGGER.info(logFormatMethod(methodName, object), throwable);
		}
	}

	/**
	 * logs the trace message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 * @param throwable
	 *            the instance of Throwable.
	 */
	public void logTrace(String methodName, Object object, Throwable throwable) {
		if (isTraceEnabled()) {
			LOGGER.trace(logFormatMethod(methodName, object), throwable);
		}
	}

	/**
	 * logs the trace message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 */

	public void logTrace(String methodName, Object object) {
		if (isTraceEnabled()) {
			LOGGER.trace(logFormatMethod(methodName, object));
		}
	}

	/**
	 * logs the warn message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 * @param throwable
	 *            the instance of Throwable.
	 */
	public void logWarn(String methodName, Object object, Throwable throwable) {
		if (isWarnEnabled()) {
			LOGGER.warn(logFormatMethod(methodName, object), throwable);
		}
	}

	/**
	 * logs the warn message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 */

	public void logWarn(String methodName, Object object) {
		if (isWarnEnabled()) {
			LOGGER.warn(logFormatMethod(methodName, object));
		}
	}

	/**
	 * logs the error message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 */
	public void logError(String methodName, Object object) {
		if (isErrorEnabled()) {
			LOGGER.error(logFormatMethod(methodName, object));
		}
	}

	/**
	 * logs the error message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 * @param throwable
	 *            the instance of Throwable.
	 */
	public void logError(String methodName, Object object, Throwable throwable) {
		if (isErrorEnabled()) {
			LOGGER.error(logFormatMethodError(methodName, throwable));
		}
	}

	/**
	 * logs the fatal message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 */
	public void logFatal(String methodName, Object object) {
		if (isFatalEnabled()) {
			LOGGER.fatal(logFormatMethod(methodName, object));
		}
	}

	/**
	 * logs the fatal message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 * @param throwable
	 *            the instance of Throwable.
	 */
	public void logFatal(String methodName, Object object, Throwable throwable) {
		if (isFatalEnabled()) {
			LOGGER.fatal(logFormatMethod(methodName, object), throwable);
		}
	}

	/**
	 * logs the exception message.
	 * 
	 * @param methodName
	 *            the method name.
	 * @param obj
	 *            the details to be logged.
	 */
	public void logException(String methodName, Throwable throwable) {
		LOGGER.error(logFormatMethodError(methodName, throwable));
	}

	/**
	 * Formats the content to be written to the log files
	 * 
	 * @param message
	 *            the method name.
	 * @param object
	 *            the details to be logged.
	 */

	private static String logFormatMethod(String message, Object object) {
		StringBuffer returnStringBuffer = new StringBuffer();
		returnStringBuffer.append(SpringConstants.LOG_FORMAT_1).append(message).append(SpringConstants.LOG_FORMAT_2);
		returnStringBuffer.append(SpringConstants.LOG_FORMAT_3).append(object).append(SpringConstants.LOG_FORMAT_2);
		return returnStringBuffer.toString();
	}

	/**
	 * Formats the content to be written to the log files along with error
	 * details
	 * 
	 * @param message
	 *            the method name.
	 * @param throwable
	 *            Exception that occurred.
	 */
	private static String logFormatMethodError(String message, Throwable throwable) {
		StringBuffer returnStringBuffer = new StringBuffer();
		StringWriter stringWriter = null;
		PrintWriter printWriter = null;
		try {
			stringWriter = new StringWriter();
			printWriter = new PrintWriter(stringWriter);
			if (throwable != null) {
				throwable.printStackTrace(printWriter);
			}
			returnStringBuffer.append(SpringConstants.LOG_FORMAT_1).append(message)
					.append(SpringConstants.LOG_FORMAT_2);
			returnStringBuffer.append(SpringConstants.LOG_FORMAT_3).append(stringWriter.toString())
					.append(SpringConstants.LOG_FORMAT_2);
		} finally {
			try {
				if (stringWriter != null) {
					stringWriter.close();
				}
				if (printWriter != null) {
					printWriter.close();
				}
			} catch (Exception exception) {
				// EAT the Exception
			}
		}
		return returnStringBuffer.toString();
	}
}
