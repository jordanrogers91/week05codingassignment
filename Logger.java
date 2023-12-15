package week05project;

public interface Logger { // created an interface that holds methods that will be utilized in both my classes I'm creating. 
	public void log(String log); // my interface methods will not be returning anything because they will be applied and put to work in my classes. They will take in two strings (log and error) as parameters. 
	public void error(String error);
	

}
