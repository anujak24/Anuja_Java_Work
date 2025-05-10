//Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits

import java.util.Arrays;

public class ProcessArrayFirstLetterInCapsAndNodigits_65_imp {

	public static void main(String[] args) {
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		System.out.println("Input is: " + Arrays.toString(input));
		processData(input);
	}

	public static void processData(String[] input) {
		String output[] = new String[input.length];
		for (int i = input.length-1 , j = 0; i >= 0 ; i-- , j++) {
			String word = input[i];
			output[j] = removeDigits(word);
		}
		System.out.println("Output arr is" +Arrays.toString(output));

	}

	public static String removeDigits(String word) {
		String updatedWord = "";
		for (int i = word.length()-1; i >=0 ; i--) {
			char ch = word.charAt(i);
			if (!Character.isDigit(ch)) {
				updatedWord = updatedWord + ch;
			}
		}
		return modifyCompleteString(updatedWord);
	}

	public static String modifyCompleteString(String updatedWord) {
		updatedWord = updatedWord.substring(0, 1).toUpperCase() + updatedWord.substring(1, updatedWord.length() - 1)
				+ updatedWord.substring(updatedWord.length() - 1).toLowerCase();
		return updatedWord;
	}

}
