public class SumOfOddAndEvenDigitsFromStirng31 {
	public static void main(String[] args) {
		SumOfOddAndEvenDigitsFromStirng31 sumOfOddAndEvenDigitsFromStirng = new SumOfOddAndEvenDigitsFromStirng31();
		String input = "te1ch2no3cre7dits";
		String input1 = "4563";
		sumOfOddAndEvenDigitsFromStirng.evenDigitsAndOddDigitSum(input);
		sumOfOddAndEvenDigitsFromStirng.evenDigitsAndOddDigitSum(input1);
	}
	
	private void evenDigitsAndOddDigitSum(String input) {
		int evenSum = 0;
		int oddSum = 0;
		int diff = 0;
		int num = 0 ;
		for(int i = 0 ; i<input.length() ; i++) {
			if(Character.isDigit(input.charAt(i))) {
				num = Character.getNumericValue(input.charAt(i));
				if(num%2==0){
					evenSum = num + evenSum;
				}else{
					oddSum = num + oddSum;
				}
			}
		}
		System.out.println(evenSum +" its a even sum");
		System.out.println(oddSum +" its a odd sum");

		diff= oddSum - evenSum;
		System.out.println("Diff of Odd digits and even digits is "+ diff) ;
	}
}

