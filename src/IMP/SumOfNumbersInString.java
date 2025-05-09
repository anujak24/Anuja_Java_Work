package IMP;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		String input = "tel123chnoc1072red9its19";
		getSumOfNumbers(input); // Output should be 123 + 1072 + 9 + 19 = 1223
	}

	public static void getSumOfNumbers(String str) {
		char[] arr = str.toCharArray();
		String temp = "";
		int sum = 0;

		for (char ch : arr) {
			if (Character.isDigit(ch)) {
				temp += ch; // Build the number string
			} else {
				// If non-digit and temp is not empty, parse and add to sum
				if (temp.length() > 0) {
					int num = Integer.parseInt(temp);
					sum += num;
					temp = ""; // Reset temp for next number
				}
			}
		}

		// After loop ends, check if there's a number left in temp
		if (temp.length() > 0) {
			int num = Integer.parseInt(temp);
			sum += num;
		}

		// Print the final sum
		System.out.println("Total sum = " + sum);
	}
}
