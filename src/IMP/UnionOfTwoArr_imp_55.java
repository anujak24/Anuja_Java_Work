/*return union of given two array.

input : 
{10,19,18}
{99,8}*/
package IMP;

import java.util.Arrays;

public class UnionOfTwoArr_imp_55 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 19, 18 };
		int[] arr2 = { 99, 8 };
		int[] output = unionOfTwoArr(arr1, arr2);
		System.out
				.println(" Input arr1 is " + Arrays.toString(arr1) + " \n And input arr2 is " + Arrays.toString(arr2));
		System.out.println(" output arr which is a union  " + Arrays.toString(output));

	}

	private static int[] unionOfTwoArr(int[] arr1, int[] arr2) {
		int[] unionArr = new int[arr1.length + arr2.length];
		int index = 0;
		for (int i = 0; i < arr1.length; i++, index++) {
			unionArr[index] = arr1[i];

		}

		for (int k = 0; k < arr2.length; k++, index++) {
			unionArr[index] = arr2[k];

		}
		return unionArr;
	}

}
