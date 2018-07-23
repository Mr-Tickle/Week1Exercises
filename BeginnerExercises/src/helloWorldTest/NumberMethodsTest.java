package helloWorldTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import helloWorld.Main;
import helloWorld.NumberMethod;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumberMethodsTest {

	@Test
	public void numberTest() {
		assertEquals(15,NumberMethod.calculateNumbers(5, 10),"Numbers did not add together correctly");
	}
	
	@Test
	public void numberTest2() {
		NumberMethod testNumbers = new NumberMethod();
		assertEquals(15,testNumbers.calculateNumbers(8, 7),"Numbers did not add correctly");
	}
	
	@Test
	public void numberTestAdd() {
		assertEquals(15,NumberMethod.calculateNumbers(5, 10, true),"Numbers did not add correctly");
	}
	
	@Test
	public void numberTestMultiply() {
		assertEquals(50,NumberMethod.calculateNumbers(5, 10, false),"Numbers did not add correctly");
	}
	
	@Test
	public void numberTestNumberIsZero() {
		assertEquals(5,NumberMethod.calculateNumbers(0, 5, true),"Number that was not 0 not returned");
	}
	
	@Test
	public void numberTestNumberIsZero2() {
		assertEquals(9,NumberMethod.calculateNumbers(9, 0, true),"Number that was not 0 not returned");
	}
	
	@Test
	public void numberTestNumberisZero3() {
		assertEquals(5,NumberMethod.calculateNumbers(5, 0),"Numbers did not add together correctly");
	}
	
	@Test
	public void numberTestNumberisZero4() {
		assertEquals(6,NumberMethod.calculateNumbers(0, 6),"Numbers did not add together correctly");
	}
	
	
	@Test
	public void arrayTestAndLoop() {
		assertEquals(9,NumberMethod.calculateWithArray(1),"The calculation was incorrect");
	}
	
	@Test
	public void arrayTestAndLoopErrorHandling() {
		assertEquals(0,NumberMethod.calculateWithArray(100),"The calculation was incorrect");
	}
	
	@Test
	public void getArraySizeTest1() {
		assertEquals(11,NumberMethod.getArraySize(),"The array is the correct size");
	}
	
	@Test
	public void getArrayValue1() {
		assertEquals(5,NumberMethod.getArrayValue(5),"The incorrect value came out");
	}
	
	@Test
	public void getArrayValue2() {
		assertEquals(0,NumberMethod.getArrayValue(1000),"The incorrect value came out");
	}
	
	@Test
	public void zChangeArrays() {
		int[] newArray = new int[] {1,2,3};
		NumberMethod.setArray(newArray);
		assertSame(newArray,NumberMethod.getArray());
	}
	
	@Test
	public void zDisplayArrays() {
		assertEquals("1 | 2 | 3 | ",NumberMethod.printOutArray(),"Arrays did not print out the same");
	}
	
	@Test
	public void zIncreaseArrays() {
		NumberMethod.increaseArrayValues();
		assertEquals(10,NumberMethod.getArrayValue(0),"Array did not increase correctly");
	}
	
	@Test
	public void zdTestingOfAllBranches() {
		
		assertEquals(0,NumberMethod.getArrayValue(-5),"Error handling not working");
	}
}
