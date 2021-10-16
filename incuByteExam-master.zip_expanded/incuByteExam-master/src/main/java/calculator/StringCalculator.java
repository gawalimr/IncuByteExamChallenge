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
		 for (String num:numbers) {
			 sum+=Integer.parseInt(num);
		 }
		 return sum;
	 }
	 
	 private int convertToInt(String input) {
		 return Integer.parseInt(input);
	 }
		 
}