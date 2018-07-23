package helloWorld;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercise 1
		System.out.println(HelloWorldString.helloWorld());
		//Exercise 2
		HelloWorldString welcome = new HelloWorldString("Hello World!");
		System.out.println(welcome.getOutputMessage());
		//Exercise 3
		System.out.println(welcome.changeOutoutMessage("Goodbye World!"));
		//Exercise 4
		System.out.println(NumberMethod.calculateNumbers(10, 20));
		//Exercise 5
		System.out.println(NumberMethod.calculateNumbers(10, 20,true));
		System.out.println(NumberMethod.calculateNumbers(10, 20,false));
		//Exercise 6 
		System.out.println(NumberMethod.calculateNumbers(0, 20,true));
		System.out.println(NumberMethod.calculateNumbers(15, 0,true));
		System.out.println(NumberMethod.calculateNumbers(0, 25));
		System.out.println(NumberMethod.calculateNumbers(5,0));
		//Exercise 7
		for(int i = 0; i<10; i++) {
			System.out.println(NumberMethod.calculateNumbers(15, i,true));
			System.out.println(NumberMethod.calculateNumbers(15, i,false));
		}
		//Exercise 8
		for(int i = 0;i<5;i++) {
			System.out.println(NumberMethod.calculateWithArray(i));
		}
		//Exercise 9
		for(int i=0;i<NumberMethod.getArraySize();i++) {
			System.out.println(NumberMethod.getArrayValue(i));
		}
		//Excercise 10
		int[] tempArray = new int[10];
		Random randomNumber = new Random();
		for(int i = 0;i<10;i++)
		{
			tempArray[i] = randomNumber.nextInt();
		}
		NumberMethod.setArray(tempArray);
		System.out.println(NumberMethod.printOutArray());
		for(int i = 0;i<10;i++){
			NumberMethod.increaseArrayValues();
			System.out.println(NumberMethod.printOutArray());
		}
		
		
	}


}
