package FancyPrograms;

public class CheckIfPalindromNumOrString_102 {

	public static void main(String[] args) {
		int num = 1221;
		String name = "namana";
		palindromeUsingStringBuffer(name);

		String newStr = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			newStr += name.charAt(i);
		}
		if (newStr.equals(name)) {

			System.out.println("Yes its palindrome: \n" + newStr + "-->" + name);
		} else
			System.out.println("Its not palindrome");

		System.out.println("----------------------------------------");
		int temp = num;
		int lastDigit = 0;
		int newNum = 0;

		while (num > 0) {
			lastDigit = num % 10;
			newNum = newNum * 10 + lastDigit;
			num = num / 10;
		}
		if (newNum == temp) {
			System.out.println(" Its palindrome \n" + newNum + "---->" + temp);
		} else {
			System.out.println("Its not palindrome");
		}

	}

	private static void palindromeUsingStringBuffer(String inputStr) {
		System.out.println(
				"-------------------Palindrome for String " + "using String Buffer is executed ------------------");

		StringBuffer strBuff = new StringBuffer(inputStr);// object of stringBuffer
		StringBuffer reverseStr = strBuff.reverse();

		if (inputStr.equals(reverseStr.toString())) {
			System.out.println(inputStr + " and " + reverseStr + " is Palindrome string");
		} else {
			System.out.println(inputStr + " and " + reverseStr + " is not a Palindrome string");

		}
		System.out.println();

	}

}
