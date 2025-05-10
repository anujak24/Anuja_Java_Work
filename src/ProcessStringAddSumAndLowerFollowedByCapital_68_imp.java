import java.util.Arrays;
//Rearange the given String, uppercase followed by sum of all the digits followed by lowercase.
//out = TNOC11echredits
public class ProcessStringAddSumAndLowerFollowedByCapital_68_imp {
	public static void main(String[] args) {
		String input = "Te1ch6NOCre4dits";
		System.out.println("Input is: " + input);
		processData(input);
	}

	public static void processData(String input) {
		int sum = 0;
		String upper = "";
		String lower = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				upper += ch;
			}
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum += num ;
			}
			if(Character.isLowerCase(ch)) {
				lower += ch;
			}
		}
		String output = upper+sum+lower;
		System.out.println(output);
	}
}
