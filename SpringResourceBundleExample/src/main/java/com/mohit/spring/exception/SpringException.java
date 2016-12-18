package com.mohit.spring.exception;

import com.mohit.spring.utils.SpringConstants;

public class SpringException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Exception Code
	 */
	private String exceptionCode;

	/**
	 * Exception message
	 */
	private String exceptionMessage;

	/**
	 * Message Parameters
	 */
	private String[] messageParameters;

	/**
	 * Name of the component where exception occured
	 */
	private String componentName;

	/**
	 * Cause of the exception
	 */
	private String detailMessage;

	/**
	 * Severity of exception
	 */

	private String severity;

	/**
	 * Constructor of the class
	 */
	protected SpringException() {
		this(null);
	}

	/**
	 * Default Constructor of this class
	 */
	public SpringException(String message) {
		super(message);
		this.componentName = SpringConstants.UNKNOWN;
	}

	/**
	 * Parameterized Constructor for this class.
	 * 
	 * @param String
	 *            exceptionCode
	 * @param String
	 *            componentName Name of the component where this exception
	 *            originated.
	 * @param Object[]
	 *            arrParameters Parameters to be passed to error message
	 */
	public SpringException(String exceptionCode, String componentName, String[] arrParameters,
			String exceptionSeverity) {
		this.exceptionCode = exceptionCode;
		this.componentName = componentName;
		this.messageParameters = arrParameters;
		this.severity = exceptionSeverity;
	}

	/**
	 * Parameterized Constructor for this class.
	 * 
	 * @param String
	 *            exceptionCode Error Code
	 * @param String
	 *            componentName component where this exception originated.
	 * @param Throwable
	 *            t Original Exception.
	 * @param Object[]
	 *            arrParameters Parameters to be passed to error message
	 */
	public SpringException(String exceptionCode, String componentName, Throwable t, String[] arrParameters,
			String exceptionSeverity) {
		this(exceptionCode, componentName, arrParameters, exceptionSeverity);
		initCause(t);
	}

	/**
	 * Parameterized constructor of this class
	 * 
	 * @param String
	 *            message Exception Message
	 * @param Throwable
	 *            t Original Exception.
	 */
	public SpringException(String message, Throwable t) {
		this(message);
		initCause(t);
	}

	/**
	 * @return the exceptionCode
	 */
	public String getExceptionCode() {
		return exceptionCode;
	}

	/**
	 * @param exceptionCode
	 *            the exceptionCode to set
	 */
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	/**
	 * @return the exceptionMessage
	 */
	public String getExceptionMessage() {
		return exceptionMessage;
	}

	/**
	 * @param exceptionMessage
	 *            the exceptionMessage to set
	 */
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	/**
	 * @return the componentName
	 */
	public String getComponentName() {
		return componentName;
	}

	/**
	 * @return the messageParameters
	 */
	public String[] getMessageParameters() {
		return messageParameters;
	}

	/**
	 * @param componentName
	 *            the componentName to set
	 */
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	/**
	 * @param messageParameters
	 *            the messageParameters to set
	 */
	public void setMessageParameters(String[] messageParameters) {
		this.messageParameters = messageParameters;
	}

	/**
	 * @return the detailMessage
	 */
	public String getDetailMessage() {
		return detailMessage;
	}

	/**
	 * @param detailMessage
	 *            the detailMessage to set
	 */
	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}

	/**
	 * @return the severity
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * @param severity
	 *            the severity to set
	 */
	public void setSeverity(String severity) {
		this.severity = severity;
	}
}
