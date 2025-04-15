/*return the array in reverse order , not single element return entire array. 

input : {10,34,22,16,19,99}*/

import java.util.Arrays;

public class ArrayReturnAReverseArrayOfInput_IMP {

	public static void main(String[] args) {
		ArrayReturnAReverseArrayOfInput_IMP obj = new ArrayReturnAReverseArrayOfInput_IMP();
		int[] input = { 10, 34, 22, 16, 19, 99 };
		System.out.println("Input arr  is " + Arrays.toString(input));
		if (input.length <= 1) {
			System.out.println("Please enter a valid arr");

		} else {
			int[] reverseInputArr = obj.reverseAEntireArray(input);
			System.out.println("Array in reverse order is " + Arrays.toString(reverseInputArr));
		}

	}

	private int[] reverseAEntireArray(int[] input) {
		int[] output = new int[input.length];
		System.out.println("Will print in reverse order");
		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {

			output[j] = input[i];
			System.out.print(input[i]+" , ");
		}
		System.out.println();
		return output;

	}

}
