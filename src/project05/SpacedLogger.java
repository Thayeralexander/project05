package project05;

public class SpacedLogger implements Logger {
// created spacelogger class 
   
    
	
	
	private String addSpaces(String message) {
        StringBuilder spacedMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            spacedMessage.append(c).append(" ");
        }
        return spacedMessage.toString().trim(); 
    }

   // 5. implemented methods 
    public void log(String message) {
        System.out.println(addSpaces(message));
    }

   
    public void error(String message) {
        System.out.println("Error: " + addSpaces(message));
    }
}

