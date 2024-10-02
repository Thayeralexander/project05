package project05;

public class App {

	//6. created app class and put main methods 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test AsteriskLogger
        System.out.println("AsteriskLogger log method:");
        asteriskLogger.log("Hello");

        System.out.println("\nAsteriskLogger error method:");
        asteriskLogger.error("Hello");

        // Test SpacedLogger
        System.out.println("\nSpacedLogger log method:");
        spacedLogger.log("Hello");

        System.out.println("\nSpacedLogger error method:");
        spacedLogger.error("Hello");
	}

}
