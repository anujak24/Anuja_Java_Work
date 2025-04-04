
public class CountNumbersFromString_22 {

	public static void main(String[] args) {
	String inputStr = "aa1kan33ks4h5a" ;
	CountNumbersFromString_22 countNumbersFromString_22 = new CountNumbersFromString_22();
	System.out.println("Input String is " +inputStr);
	countNumbersFromString_22.countNumsFromGivenString(inputStr);
	}
	
	private void countNumsFromGivenString(String inputStr) {
		int count = 0 ;
		for(int i = 0 ; i<inputStr.length() ; i++) {
			if(Character.isDigit(inputStr.charAt(i))) {
				count++;
			}
		}
		System.out.println("Total number of digit in a given string is "+count);
	}

}
