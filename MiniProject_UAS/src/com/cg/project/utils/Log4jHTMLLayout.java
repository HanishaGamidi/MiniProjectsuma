package com.cg.project.utils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jHTMLLayout {

	
	public Logger getlogger(){
		Logger logger = Logger.getLogger(Log4jHTMLLayout.class);
		
		PropertyConfigurator.configure("log4j.properties");
		
		return logger;
	}
	
	
	
}
