package IMP;
import java.util.Arrays;

public class CreateArrOfEachPositionMaxValueBetween2Arr_56_imp {
	public static void main(String[] args) {

		int[] arr1 = { 10, 55, 22, 77, 88 };
		int[] arr2 = { 5, 102, 28, 77, 18 };
		System.out.println("Input arr1 is " + Arrays.toString(arr1));
		System.out.println("Input arr2 is " + Arrays.toString(arr2));
		createNewArrOfMaxFromEachIndex(arr1, arr2);

	}

	public static void createNewArrOfMaxFromEachIndex(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			int[] output = new int[arr1.length];
			for (int i = 0, j = 0, k = 0; i < arr1.length; i++, j++, k++) {
				if (arr1[i] < arr2[j]) {
					output[k] = arr2[j];
				} else if (arr1[i] > arr2[j]) {
					output[k] = arr1[i];
				} else {
					output[k] = arr2[i];
				}
			}
			System.out.println("output arr which is max from each index is " + Arrays.toString(output));

		} else {
			System.out.println("Please enter a equal length array to perform required operations");
		}

	}

}
