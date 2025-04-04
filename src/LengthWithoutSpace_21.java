
public class LengthWithoutSpace_21 {

	public static void main(String[] args) {
		LengthWithoutSpace_21 lengthWithoutSpace_21 = new LengthWithoutSpace_21();
		String inputStr = "prem lata gupta";
		System.out.println("Input stirng is: " + inputStr);
		lengthWithoutSpace_21.countLenthWithoutSpace(inputStr);
	}

	private void countLenthWithoutSpace(String inputStr) {
		System.out.println(
				"String using trim method is, \n which remove leading and traling spaces only " + inputStr.trim());
		int count = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) == ' ') {
				count++;
			}
		}

		int lengthWithoutSpace = inputStr.length() - count;
		System.out.println("Length of given string  without space is: ");
		System.out.println(" is " + lengthWithoutSpace);
		System.out.println("Total num of spaces are " + count);
	}

}