package helloWorld;

public class HelloWorldString {
	
	private String outputVariable;
	
	public HelloWorldString()
	{
		//this is comment nothing happens
	}
	public HelloWorldString(String output) {
		this.outputVariable = output;
	}
	
	
	public static String helloWorld()
	{
		return "Hello World!";
	}
	
	public String getOutputMessage() {
		return this.outputVariable;
	}
	
	public String changeOutoutMessage(String newMessage) {
		this.outputVariable = newMessage;
		return this.outputVariable;
	}
}
