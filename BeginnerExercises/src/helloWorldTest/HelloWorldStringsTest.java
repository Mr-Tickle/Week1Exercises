package helloWorldTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import helloWorld.HelloWorldString;

public class HelloWorldStringsTest {

	@Test
	public void helloWorldTest() {
		assertEquals("Hello World!",HelloWorldString.helloWorld(),"Did not say Hello World");
	}
	
	@Test
	public void helloWorldTest2() {
		HelloWorldString testHelloWorld = new HelloWorldString();
		assertEquals("Hello World!",testHelloWorld.helloWorld(),"Did not say Hello World");
	}
	
	@Test
	public void helloWorldTestVariableStorage() {
		HelloWorldString testHelloWorld = new HelloWorldString("Hi Dale");
		assertEquals("Hi Dale",testHelloWorld.getOutputMessage(),"Was not a warm welcome for Dale");
	}
	
	@Test
	public void changeMessageTest() {
		HelloWorldString testHelloWorld = new HelloWorldString("Hi Dale");
		assertEquals("Bye Dale",testHelloWorld.changeOutoutMessage("Bye Dale"),"Dale didn't go away");
	}
}
