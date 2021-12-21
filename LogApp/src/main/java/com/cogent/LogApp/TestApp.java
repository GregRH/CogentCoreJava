package com.cogent.LogApp;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 * Hello world!
 *
 */
public class TestApp 
{
	private static Logger Log = Logger.getLogger(TestApp.class);
    public static void main( String[] args )
    {
        //Layout layout = new SimpleLayout();
    	//Layout layout = new HTMLLayout();
    	Layout layout = new PatternLayout("%p %d %C %M %m %n");
    	
    	Appender ap = new ConsoleAppender(layout);
    	
    	Log.addAppender(ap);
    	
    	Log.info("from info");
    	Log.debug("from debug");
    	Log.fatal("from fatal");
    	Log.error("from error");
    	Log.warn("from warn");
    }
}
