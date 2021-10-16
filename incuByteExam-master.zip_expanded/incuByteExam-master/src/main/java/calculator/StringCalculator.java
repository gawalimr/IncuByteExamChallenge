package calculator;

class StringCalculator {
	 public int add(String input) { 
		 String [] numbers=input.split(",");
		 if(input.isEmpty()) {
		 return 0;
		 }
		 if(input.length()==1) {
			 return convertToInt(input);
		 }else {
			 return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
		 }
		
	 }
	 
	 
	 
	 private int convertToInt(String input) {
		 return Integer.parseInt(input);
	 }
		 
}