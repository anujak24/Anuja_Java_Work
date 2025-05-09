package IMP;

import java.util.Arrays;

public class ReturnSecondMaxFromArray_60 {

	public static void main(String[] args) {
		int[] arr1 = {10,33 ,19,55,53,11};
		System.out.println("Array is "+Arrays.toString(arr1));
		secondMaxFromArr(arr1);

	}

	private static void secondMaxFromArr(int[] arr1) {
		int max =  0 ;
		int secondMax = 0;
		for(int i = 0 ; i<arr1.length ; i++){
			if(max< arr1[i]) {
				secondMax = max ;
				max = arr1[i] ;
			} else if (secondMax< arr1[i]){
				secondMax = arr1[i] ;
			}
		}
		System.out.println(max +" , "+secondMax);
	}

}
