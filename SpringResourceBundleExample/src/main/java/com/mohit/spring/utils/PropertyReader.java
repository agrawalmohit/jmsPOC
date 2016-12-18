package com.mohit.spring.utils;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

@Component
public class PropertyReader implements ApplicationContextAware {

	private static ApplicationContext context;
	private static ResourceBundleMessageSource messageResourceBundle;
	private static Locale locale = new Locale("en");

	public static void loadResources() {

		messageResourceBundle = (ResourceBundleMessageSource) context.getBean("messageSource");
	}

	public static String getProperty(String key, String[] args) throws Exception {
		if (null == messageResourceBundle) {
			loadResources();
		}
		if (key == null) {
			throw new Exception("illegal argument");
		}
		return (String) messageResourceBundle.getMessage(key, args, locale);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		context = arg0;
	}

}
