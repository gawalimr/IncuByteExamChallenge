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
			 try {
				return getSum(numbers);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		 }
		 return 0;
		
	 }
	 
	 private int getSum(String [] numbers) throws Exception {
		 findNegativeInputs(numbers);
		 return calculateValues(numbers);
	 }
	 
	 private int calculateValues(String[] numbers) {
		 int sum=0;
		 for (String num:numbers) {
			 if(convertToInt(num)>1000) {
				 continue;
			 }
			 sum+=convertToInt(num);
		 }
		 return sum;
	}

	private void findNegativeInputs(String[] numbers) throws Exception {
		 for (String num:numbers) {
			 if(convertToInt(num)<0) {
				 throw new Exception("negatives not allowed");
			 }
		 }
	}

	private int convertToInt(String input) {
		 return Integer.parseInt(input);
	 }
		 
}