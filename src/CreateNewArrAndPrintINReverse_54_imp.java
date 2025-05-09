import java.util.Arrays;

public class CreateNewArrAndPrintINReverse_54_imp {
	public static void main(String[] args) {
		int[] input = {10,34,22,16,19,99};
		System.out.println(" Input arr is "+Arrays.toString(input));
		int[] ouput =new CreateNewArrAndPrintINReverse_54_imp().createNewArrInReverseOrder(input); 
		System.out.println(" Output arr which is reverse on input is:  "+Arrays.toString(ouput));	}
	
	private int[] createNewArrInReverseOrder(int[] input) {
		int[] outputArrInreverse = new int[input.length];
		for(int i = input.length -1  , j=0 ; i>= 0 ; i-- , j++) {
			outputArrInreverse[j] = input[i];
			
		}
		return outputArrInreverse;
	}
}
