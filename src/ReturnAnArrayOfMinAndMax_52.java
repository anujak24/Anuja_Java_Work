/*--return array , pass aray  		int[] num = {44,45,22,-25,47,29,46};
return maximum and minimum number from given array.
int getMaxMinNum(int[] arr){
	
} */

import java.util.Arrays;

public class ReturnAnArrayOfMinAndMax_52 {
	public static void main(String[] args) {
		ReturnAnArrayOfMinAndMax_52 returnAnArrayOfMinAndMax = new ReturnAnArrayOfMinAndMax_52();
		int[] arr = {-299,45,22,-25,47,29,46};
		int[] output = returnAnArrayOfMinAndMax.returnArrayOfMinAndMax(arr);
		System.out.println(" Input array is "+Arrays.toString(arr) +"\n And array of max at position 0  and min at position 1 is "+Arrays.toString(output));
	}
	
	private int[] returnArrayOfMinAndMax(int[] arr) {
		int[] outputArr = new int [2];
		
		int max =arr[0];
		int min =arr[1];
		
		for(int i = 0 ; i<arr.length ; i++ ) {
			if(max < arr[i]) {
				 max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		outputArr[0] = max;;
		outputArr[1] = min;

		return outputArr;
	}
}
