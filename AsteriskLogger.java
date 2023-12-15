package week05project;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
				
	}

	@Override
	public void error(String error) {
		System.err.println("******************" + "\n" + "***" + "Error: " + error + "***" + "\n" + "******************");
	}

}
