//return maximum and minimum number from given array.
///int[] num = {44,44,22,-25,47,29,-100};

import java.util.Arrays;

public class ArrayReturnMaxAndMin {

	public static void main(String[] args) {
		ArrayReturnMaxAndMin arrayReturnMaxAndMin = new ArrayReturnMaxAndMin();
		int[] input = { 44, 45, 0 };
		int[] result = arrayReturnMaxAndMin.returnMaxAndMinFromArray(input);
		System.out.println("Given array is " + Arrays.toString(input));

		if(input.length <=2) {
			System.out.println("Please enter a valid array greater than 2 length");
		} else {
			System.out.println("Max num from given Arrays is " + result[0]);
			System.out.println("Min num from given Arrays is " + result[1]);
		}
	
	}

	private int[] returnMaxAndMinFromArray(int[] input) {
		int[] output = new int[2];

		if (input.length <= 2) {
			System.out.println("Please enter a valid array");
		} else {
			int maxNum = input[0];
			int minNum = input[0];
			for (int i = 1; i < input.length; i++) {
				if (maxNum < input[i]) {
					maxNum = input[i];
				}
				if (minNum > input[i]) {
					minNum = input[i];
				}
			}

			output[0] = maxNum;
			output[1] = minNum;
			return output;

		}
		return input;

	}

}
