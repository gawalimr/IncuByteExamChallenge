package calculator;

class StringCalculator {
	
	private final String delimeter=",|\n";
	
	 public int add(String input) { 
		 String [] numbers=input.split(delimeter);
		 if(input.isEmpty()) {
		 return 0;
		 }
		 if(input.length()==1) {
			 return convertToInt(input);
		 }else {
			 return getSum(numbers);
		 }
		
	 }
	 
	 private int getSum(String [] numbers) {
		 int sum=0;
		 for (int i = 0; i < numbers.length; i++) {
			 sum+=Integer.parseInt(numbers[i]);
		 }
		 return sum;
	 }
	 
	 private int convertToInt(String input) {
		 return Integer.parseInt(input);
	 }
		 
}