package com.mohit.spring.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

import com.mohit.spring.exception.SpringException;

public class CommonUtils {

	public static SpringLogger LOGGER = LogFactory.getLogger(CommonUtils.class);
	
	public static SpringException setExceptionMessage(SpringException exception) {
		final String METHOD_NAME = "setExceptionMessage";
		LOGGER.logInfo(METHOD_NAME, "Enter");
		try {
			final String exceptionCode = exception.getExceptionCode();
			if (exceptionCode != null) {
				String message = PropertyReader.getProperty(exceptionCode, exception.getMessageParameters());

				exception.setExceptionMessage(message);

				final StringWriter sw = new StringWriter(2000);
				final PrintWriter pw = new PrintWriter(sw);
				exception.printStackTrace(pw);
				exception.setDetailMessage(sw.getBuffer().toString());
			}
		} catch (final Exception e) {
			LOGGER.logError("setExceptionMessage", e);
		}
		LOGGER.logInfo(METHOD_NAME, "Exit");
		return exception;
	}

}
