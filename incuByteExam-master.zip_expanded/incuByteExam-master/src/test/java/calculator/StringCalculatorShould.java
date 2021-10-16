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
    
}
