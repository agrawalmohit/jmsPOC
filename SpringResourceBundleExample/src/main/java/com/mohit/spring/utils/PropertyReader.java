package com.mohit.spring.utils;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class PropertyReader {

	private static ResourceBundleMessageSource messageResourceBundle;
	private static Locale locale = new Locale("en");

	public static void loadResources() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		messageResourceBundle = (ResourceBundleMessageSource) context.getBean("messageSource");
	}
	
	public String getProperty(String key, String[] args) throws Exception {
	    if (key == null) {
	      throw new Exception("illegal argument");
	    }

		return (String) messageResourceBundle.getMessage(key, args, locale);
	  }

}
