package calculator;

class StringCalculator {

	
	 public int add(String input) { 
		 if(input.isEmpty()) {
		 return 0;
		 }
		 return convertToInt(input);
	 }
	 private int convertToInt(String input) {
		 return Integer.parseInt(input);
	 }
		 
}