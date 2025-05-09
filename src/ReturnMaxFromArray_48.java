import java.util.Arrays;

public class ReturnMaxFromArray_48 {
	public static void main(String[] args) {
		ReturnMaxFromArray_48 returnMaxFromArray_48 = new ReturnMaxFromArray_48();
		int[] arr1 =  {44,45,22,25,47,29,46};
		int max = returnMaxFromArray_48.findMaxFromArray(arr1);
		System.out.println("Max from the array is: " +max +" and given array is "+Arrays.toString(arr1));
		
		
	}
	
	private int findMaxFromArray(int[] arr1) {
		int max =0 ;
		for(int i = 0 ; i< arr1.length ; i++) {
			if (max<arr1[i] ){
				max = arr1[i];	
			}
		}
		//System.out.println("Max from the array is: " +max +" and given array is "+Arrays.toString(arr1));
		
		return max;
	}
}
