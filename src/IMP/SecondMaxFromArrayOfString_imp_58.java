package IMP;
import java.util.Arrays;

public class SecondMaxFromArrayOfString_imp_58 {
	public static void main(String[] args) {
		String[] arr = { "Technocredits", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant",
				"Pune", "PuGlobantne" };
		System.out.println("Inout arr is : " + Arrays.toString(arr));
		getSecondLastMaxString(arr);
	}

	private static void getSecondLastMaxString(String arr[]) {
		String secondMax = arr[1];
		String max = arr[0];
		int secondMaxLength = arr[1].length();
		int maxLength = arr[0].length();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > maxLength) {// if greater than max
				secondMaxLength = maxLength;
				secondMax = max;
				maxLength = arr[i].length();
				max = arr[i];
				// else if smaller than max but greater than second max
			} else if (arr[i].length() < maxLength && arr[i].length() > secondMaxLength) {
				secondMaxLength = arr[i].length();
				secondMax = arr[i];
			}
		}
		System.out.println("Secondmax length is : " + secondMaxLength + " and string is: " + secondMax);
		System.out.println("maxLength length is : " + maxLength + " and string is " + max);
	}
}
