/*
return the maximum number / min number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,22,-25,-47,-29,-46}
output : -22*/

import java.util.Arrays;

public class FindMinandMaxFromArray_49 {
	public static void main(String[] args) {
		FindMinandMaxFromArray_49 findMinandMaxFromArray_49  =  new FindMinandMaxFromArray_49();
		int[] arr1 = {44,45,22,25,47,29,46};
		int[]  arr2 = {-44,-45,22,-25,-47,-29,-46};
		findMinandMaxFromArray_49.findMinAndMaxFromArr(arr1);
		findMinandMaxFromArray_49.findMinAndMaxFromArr(arr2);
	
	}
	
	private void findMinAndMaxFromArr(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for(int i = 1 ; i<arr.length ; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}	
		}
		System.out.println(" Input arr is "+Arrays.toString(arr)+" and min is "+ min +" and max is "+ max);
	}
}
