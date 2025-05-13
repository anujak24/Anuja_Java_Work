import java.util.Arrays;

public class RotateAllNumbersToRightByOnePosition_imp_74 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		 int temp = arr[arr.length - 1]; // store last element

		    int prev = arr[0]; // store the first element to shift
		    for (int i = 0; i < arr.length; i++) {
		        int current = arr[i];
		        arr[i] = temp;
		        temp = current;
		    }

		    System.out.println("Rotated input array to right is:\n" + Arrays.toString(arr) + "\n");

	}

}
