import java.util.Arrays;

public class ReverseStringInArrayInSamePlace_61 {

	public static void main(String[] args) {
		String[] input =  {"tech", "aashvi", "credits"};
		System.out.println(" Input is: "+Arrays.toString(input));
		String [] output = getArrayWithReversedString(input);
		System.out.println(" Output is: "+Arrays.toString(output));

	}
	
	public static String[] getArrayWithReversedString(String input[]) {
		//used same array
		for(int i = 0 ; i<input.length ; i++) {
			
			input[i] = reverseAString(input[i]);
		}
		return input ; 
	}
	
	public static String reverseAString(String name) {
		String word = "";
		for(int i = name.length()-1  ; i>= 0 ; i--) {
			char ch = name.charAt(i);
			word = word + ch ;
		}
		return word ;
	}

}
