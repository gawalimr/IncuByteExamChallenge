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
			 return getSum(numbers[0],numbers[1]);
		 }
		
	 }
	 
	 private int getSum(String n1,String n2) {
		 return Integer.parseInt(n1)+Integer.parseInt(n2);
	 }
	 
	 private int convertToInt(String input) {
		 return Integer.parseInt(input);
	 }
		 
}