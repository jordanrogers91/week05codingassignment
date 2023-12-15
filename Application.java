package week05project;

public class Application { // this is our entry point class so added the main method

	public static void main(String[] args) { 
		Logger logger = new AsteriskLogger(); //first we are going to create an instance of our logger. You put the interface on the left side and the actual class name on the right side.
		logger.log("This is logged properly!"); //its calling on the log method we created in Logger interface and put to use in our AstriskedLogger class. 
		logger.error("STOP!"); // calling our error method we created in our Logger interface and put to use in our AsteriskLogger class
		
		Logger logger2 = new SpacedLogger(); // created another instance of our logger but using our SpacedLogger class
		logger2.log("WELL DONE");
		logger2.error("DO NOT PROCCEED");
	}

}
