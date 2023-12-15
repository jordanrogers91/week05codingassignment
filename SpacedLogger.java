package week05project;

public class SpacedLogger implements Logger { // I implemented my Logger interface and put in the methods that were created there and added functionality to them to perform the desired tasks. 

	@Override
	public void log(String log) {
		StringBuilder sb = new StringBuilder(); //// I implemented a string builder to be able to loop through my string and add characters without having to commit a new string to memory every time.
		for (int i = 0; i < log.length(); i ++) { // I looped through the sb string and added a space in between each character. 
			if (i > 0) {
				sb.append(" ");
			}
		sb.append(log.charAt(i));
		}
		System.out.println(sb.toString()); // and printed the string builder to the console in form of a string.
	}

	@Override
	public void error(String error) { //did the same as above to the error string parameter. 
		StringBuilder sb = new StringBuilder(); 
		for (int i = 0; i < error.length(); i ++) {
			if (i > 0) {
				sb.append(" ");
			}
		sb.append(error.charAt(i));
		}
		System.err.println("ERROR: " + sb.toString());	// used system.err for an error message to be notified and appear red in the console	
	}

}
