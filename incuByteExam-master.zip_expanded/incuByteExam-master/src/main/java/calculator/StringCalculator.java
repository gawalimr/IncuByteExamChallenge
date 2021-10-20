package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

	private final String delimeter = ",|\n";
	private static int cnt = 1;

	public static int getCnt() {
		return cnt;
	}

	public int add(String input) {
		
		String[] numbers = input.split(delimeter); // split String to String [] using delimiter 

		GetCalledCount();     //add function called count

		if (input.isEmpty()) {
			return 0;
		} // if Empty String is given 
		
		if (input.length() == 1) {
			return convertToInt(input); //if String has Only one Element
		} else {
			
			try {
				return getSum(numbers);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return 0;
	}// add function ends here

	private int GetCalledCount() {
		return cnt++;
	}

	private int getSum(String[] numbers) throws Exception {
		// findNegativeInputs(numbers);
		return calculateValues(numbers);
	}//get sum ends here 

	private int calculateValues(String[] numbers) throws Exception {
		int sum = 0;
		for (String num : numbers) {
			if (convertToInt(num) > 1000) {   //greater than 1000 skip
				continue;
			}
			List<Integer> negativeNumbers = new ArrayList<>();  // List of negative Numbers
			
			for (String num1 : numbers) {
				if (convertToInt(num1) < 0) {
					negativeNumbers.add(convertToInt(num1));
				}
			}//for add values in ArrayList
			
			if (negativeNumbers.size() > 0) {
				throw new Exception("Negatives not allowed: " + negativeNumbers.toString());
			}
			sum += convertToInt(num);
		} //for
		
		return sum;
	}// calculateValues ends here

	private int convertToInt(String input) {
		return Integer.parseInt(input);
	}// convertToInt

}// stringCalculator Ends here