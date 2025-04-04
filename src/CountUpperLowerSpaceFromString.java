
public class CountUpperLowerSpaceFromString {

	public static void main(String[] args) {
		String inputStr = "Te4c_hno Credi3ts";
		System.out.println("Input String is : " + inputStr);
		CountUpperLowerSpaceFromString countUpperLowerSpaceFromString = new CountUpperLowerSpaceFromString();
		countUpperLowerSpaceFromString.countDiffCasesFromString(inputStr);
	}

	private void countDiffCasesFromString(String inputStr) {
		int countLowerCase = 0;
		int countUpperCase = 0;
		int spaceCount = 0;
		int countSpeicalChar = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (Character.isLetter(inputStr.charAt(i))) {
				if (Character.isLowerCase(inputStr.charAt(i))) {
					countLowerCase++;
				} else if (Character.isUpperCase(inputStr.charAt(i))) {
					countUpperCase++;
				}

			} else if (Character.isDigit(inputStr.charAt(i))) {
				countUpperCase++;

			} else if (inputStr.charAt(i) == ' ') {
				spaceCount++;

			} else {
				countSpeicalChar++;

			}

		}
		System.out.println();
		System.out.println("LowerCase:- " + countLowerCase);
		System.out.println("UpperCase:- " + countUpperCase);
		System.out.println("Spaces are:- " + spaceCount);
		System.out.println("Speical Char are :- " + countSpeicalChar);

	}

}
