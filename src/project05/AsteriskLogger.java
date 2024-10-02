package project05;

public class AsteriskLogger implements Logger {
// 3. created asterisklogger class
    
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    //4. implement the methods
    public void error(String message) {
        String errorMessage = "Error: " + message;
        String asteriskLine = "*".repeat(errorMessage.length() + 6); 

        System.out.println(asteriskLine);
        System.out.println("***" + errorMessage + "***");
        System.out.println(asteriskLine);
    }
}
