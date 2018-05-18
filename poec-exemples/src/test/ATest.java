package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATest {

	@Test
	public void shoulGenerateHexValueForColor(
			String colorName,
			String expectedHexValue) {
		
		A a = new A();
		String actualResult = a.getHexColor(colorName);
		assertEquals("should be #000000",expectedHexValue, actualResult);
		
	}
	@Test
	public void shouldGenerate000000WhenBlackColor() {
		
		String name = "black";
		
		A a = new A();
		String actualResult = a.getHexColor(name);
		
		String expectedResult = "#000000";
	
		
		assertEquals("should be #000000",expectedResult, actualResult) ;
	}
	@Test
	public void shouldGenerateFFFFFFWhenWhiteColor() {
		
		String name = "white";
		
		A a = new A();
		String actuelResult = a.getHexColor(name);
		
		String expectedResult = "#FFFFFF";
	
		
		assertEquals("should be #FFFFFF",expectedResult, actuelResult) ;
	}
	
	@Test
	public void shouldGenerateFFFFFFWhenRedColor() {
		
		String name = "red";
		
		A a = new A();
		String actuelResult = a.getHexColor(name);
		
		String expectedResult = "#FF0000";
	
		
		assertEquals("should be #FF0000",expectedResult, actuelResult) ;
	}
	@Test(expected= RuntimeException.class)
	public void shouldThrowRuntimeExceptionIfUnsupportedColor() {
		String name = "afdgmfpk";
		
		A a = new A();
		
		String actualResult = a.getHexColor(name);
		
	}
	@Test(expected = NullPointerException.class)
	public void shouldThrowNullPointerExceptionIfColorNameIsNull() {
		String name = null;
		
		A a = new A();
		
		String actualResult = a.getHexColor(name);
	}
	
	

}
