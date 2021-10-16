package calculator;

import org.junit.jupiter.api.Test;

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
	
	
}
