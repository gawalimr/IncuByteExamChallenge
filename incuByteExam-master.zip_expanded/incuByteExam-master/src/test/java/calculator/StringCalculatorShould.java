package calculator;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	StringCalculator stringCalculator = new StringCalculator();

	@Test
	void empty_string_should_return_0() {
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void singleValue_should_return_1() {
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	void twoNumbers_should_return_sum() {
		assertEquals(3, stringCalculator.add("1,2"));
	}

	@Test
	void twoNumbers_DelimetedNewLine_should_return_sum() {
		assertEquals(3, stringCalculator.add("1\n2"));
	}

	@Test
	void ThreeNumbers_DelimetedNewLine_should_return_sum() {
		assertEquals(6, stringCalculator.add("1\n2,3"));
	}

	@Test
	void negative_Number_Should_throw() {
		stringCalculator.add("-1");
	}

	@Test
	void ignore_NumbersGT1000_should_return_sum() {
		assertEquals(2, stringCalculator.add("2,1001"));
	}

	@Test
	public void Negative_NumbersAreUsed_ExceptionIsThrown() {
		stringCalculator.add("3,-6,15,-18,46,33");
	}
	
	@Test
	public void whenAnyNumberOfNumbers_IsUsed_ThenReturnValuesAreTheirSums() {
		assertEquals(3 + 6 + 15 + 18 + 46 + 33, stringCalculator.add("3,6,15,18,46,33"));
	}

	@Test
	public void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
		assertEquals(3 + 6 + 15, stringCalculator.add("//;n3;6;15"));
	}

	@Test
	public void delimitersCanBeOfAnyLength() {
		assertEquals(6, stringCalculator.add("//[***]\\n1***2***3"));
	}
	
	@Test
	public void allowMultipleDelimiters() {
		assertEquals(6, stringCalculator.add("//[*][%]\\n1*2%3"));
	}
	
	@Test
	public void multipleDelimitersWithLengthLongerThanOneChar() {
		assertEquals(6, stringCalculator.add("//[**][%%]\\n1**2%%3"));
	}
	
	@Test
	public void countInvocationOfadd() {
		System.out.println("add() invoked"+ StringCalculator.getCnt() + " times");
	}

}
