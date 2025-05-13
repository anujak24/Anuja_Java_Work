//int[] arr = {5,0,22,44,0,0,55,0,12,19};
//output : {5,22,44,55,12,19,0,0,0,0}

import java.util.Arrays;

public class ShiftAllZeroAtTheEndUsing2Arr_Imp_72 {

	public static void main(String[] args) {
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		int[] output =  new int[arr.length];
		int indexForNewArr = 0 ;
		
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]!=0) {
				output[indexForNewArr] = arr[i];
				indexForNewArr++;
			}
		}
		
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]==0) {
				output[indexForNewArr] = arr[i];
				indexForNewArr++;
			}
		}
		System.out.println(Arrays.toString(output));
		}

}
