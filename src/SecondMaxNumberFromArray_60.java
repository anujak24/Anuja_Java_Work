import java.util.Arrays;

public class SecondMaxNumberFromArray_60 {

	public static void main(String[] args) {
		int[] arr1 = {33,33,19,55,53,11};
		System.out.println("Input is : "+Arrays.toString(arr1));
		int max = arr1[0];
		int secondMax = arr1[1];
		for(int i = 0 ; i<arr1.length ; i++) {
			if(max < arr1[i]) {
				secondMax = max;
				max = arr1[i];
			}else if(secondMax < arr1[i]) {
				secondMax = arr1[i];
			}
		}

	}

}
