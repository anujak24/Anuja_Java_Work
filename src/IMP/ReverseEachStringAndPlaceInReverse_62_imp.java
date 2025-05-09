package IMP;

import java.util.Arrays;

public class ReverseEachStringAndPlaceInReverse_62_imp {

	public static void main(String[] args) {
		String[] input =  {"tech", "aashvi", "credits"};
		System.out.println(" Input is: "+Arrays.toString(input));
		String [] output = getArrayWithReversedString(input);
		System.out.println(" Output is: "+Arrays.toString(output));

	}

	public static String[] getArrayWithReversedString(String input[]) {
		String [] output = new String[input.length];
		String temp = "";
		for(int i = input.length -1 ,  k = 0 ; i >= 0 ; i-- , k++) {
			String name = input[i];
			for(int j = name.length()-1 ;  j>= 0; j-- ) {
				temp = temp + name.charAt(j);
			}
			output[k] =  temp ;
			temp = "";
		}
		return output; 
	}
}
