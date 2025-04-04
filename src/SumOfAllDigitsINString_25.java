
public class SumOfAllDigitsINString_25 {

	public static void main(String[] args) {
		String inputStr1 = "te1ch2no3cre7dits";
		String inputStr2 = "techno ";
		String inputStr3 = "4563 ";

		SumOfAllDigitsINString_25 sumOfAllDigitsINString_25 = new SumOfAllDigitsINString_25();
		sumOfAllDigitsINString_25.sumOfAllDigit(inputStr1);
		sumOfAllDigitsINString_25.sumOfAllDigit(inputStr2);
		sumOfAllDigitsINString_25.sumOfAllDigit(inputStr3);

	}

	private void sumOfAllDigit(String inputStr) {
		int countDigit = 0;
		int sumOfAllDigits = 0;
		int digit = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (Character.isDigit(inputStr.charAt(i))) {
				digit = Character.getNumericValue(inputStr.charAt(i));
				// getNumericValue to get the int value of a dig and not the asscii
				sumOfAllDigits = sumOfAllDigits + digit;

			}
		}
		System.out.println("Sum of all digits is :-> " + sumOfAllDigits);
	}

}
