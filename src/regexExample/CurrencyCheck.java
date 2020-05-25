package regexExample;


import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
//import java.util.logging.LogManager;
import java.util.logging.Logger;

public class CurrencyCheck {
	
	//levels : severe, warning, info, config, fine
	
	//must have to use the Logger 
	private static final Logger LOGGER = Logger.getLogger(CurrencyCheck.class.getName());
	
	//setting up the logger
	private static void setupLogger() {
		//LogManager.getLogManager().reset();
		LOGGER.setLevel(Level.ALL);
		
		//console handler
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.SEVERE);
		LOGGER.addHandler(ch);
		
		//file handler
		try {
			FileHandler file = new FileHandler("firstLogger.log");
			file.setLevel(Level.FINE);
			LOGGER.addHandler(file);
		}catch(java.io.IOException e) {
			LOGGER.log(Level.SEVERE, "File not working", e);
		}
	}
	public static void main(String[] args) {
		
		//calling the class setupLogger in main
		CurrencyCheck.setupLogger();
		
		//First file
		LOGGER.info("My first log");
		
		try {
			throw new java.io.IOException("Couldnt read file");
			
		}catch(java.io.IOException e) {
			LOGGER.log(Level.SEVERE, "FILE error", e);
			
		}
		float dollars;
		//LogManager.getLogManager().reset();
		
		
		Scanner in = new Scanner(System.in);
		//creating logger for the description:
		LOGGER.info("Please enter dollars : $ ");
		System.out.print("Please enter dollars : $ ");
		
		
		
		dollars = in.nextLong();
		float rupees = dollars *64;
		//logger info after converting the values
		LOGGER.info("The conversion into rupees");
		System.out.println("Rs "+rupees);
		
		
		
		

	}

}
