package helloWorld;

public class NumberMethod {
	private static int[] numbers = new int[] {0,1,2,3,4,5,6,7,8,9,10};


	public static int calculateNumbers(int number1,int number2) {
		if(number1==0||number2==0) {
			return numberIsZero(number1,number2); 
		}
		return number1+number2;
	}

	public static int calculateNumbers(int number1, int number2, boolean choice) {
		if(number1==0||number2==0) {
			return numberIsZero(number1,number2);
		}
		if(choice) {
			return number1+number2;
		}
		else {
			return number1*number2;
		}

	}

	private static int numberIsZero(int number1,int number2) {
		if(number1 == 0) {
			return number2;
		}
		else {
			return number1;
		}

	}

	public static int calculateWithArray(int number) {
		if(number<numbers.length) {
			return calculateNumbers(numbers[number],numbers[numbers.length-number-1],false);
		}
		else {
			return 0;
		}

	}

	public static int getArraySize() {
		return numbers.length;
	}

	public static int getArrayValue(int index) {
		if(index < numbers.length&&index>=0) {
			return numbers[index];
		}
		else {
			return 0;
		}
	}
	
	public static void setArray(int[] newArray) {
		numbers = newArray;
	}
	
	public static void increaseArrayValues() {
		for(int i = 0;i<numbers.length;i++) {
			numbers[i]*=10;
		}
	}
	
	public static String printOutArray() {
		StringBuilder returnString = new StringBuilder();
		for(int i = 0;i<numbers.length;i++) {
			returnString.append(numbers[i]+" | ");
		}
		return returnString.toString();
	}
	
	public static int[] getArray() {
		return numbers;
	}
}
