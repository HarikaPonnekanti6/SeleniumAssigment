//Reference: https://codereview.stackexchange.com/questions/153314/log4j-singleton  
package WebDriverUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
//Logs class for instantiating the logger
public class Logs {
	public enum LogLevel {INFO, WARNING, ERROR, FATAL};
	private static Logs log;
	private static Logger logger;
	
	public Logs(Logger logger) 
	{
		setInstance(logger);
	}
	//method to set the instance of the logger to log
	private void setInstance(Logger log)
	{
		logger = log;
	}
	
	//method to create instance of log class
	public static Logs getInstance()
	{
		if (log == null)
		{
			log = new Logs(Logger.getLogger(Logs.class));
		}
		DOMConfigurator.configure("log4j.xml");
		return log;
	}
//method to add log to the log file depending on the loglevel enum value passed from the classes
    public void addlog(String message,Logs.LogLevel loglevel)
    {     
    	switch(loglevel){
		case INFO:
			logger.info(message);
			break;
		case WARNING:
			logger.warn(message);
			break;
		case ERROR:
			logger.error(message);
			break;
		default:
			logger.info(message);
			
	}
    } 
}

