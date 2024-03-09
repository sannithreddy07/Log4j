package log4j.utility;

import org.apache.log4j.Logger;

public class Log4jdemo {
	public static Logger log=Logger.getLogger(Log4jdemo.class.getName());
	
	public static void info(String message) {
		log.info(message);
//		log.error(message);
//		log.debug(message);
//		log.trace(message);
//		log.warn(message);
//		log.fatal(message);
	}



}
	



