import java.util.Arrays;

public class FindMaxLengthStringFromArrayOfString_57 {

	public static void main(String[] args) {
		String[] arr ={"Tech", "Tech", "Technocredits",
				"aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		System.out.println("Input arr is-->  \n"+Arrays.toString(arr));
		findMaxLengthStringFromArrayOfMultipleString(arr);
	}
	
	private static void findMaxLengthStringFromArrayOfMultipleString(String[] arr) {
		int maxLength = 0 ;
		String maxString = " ";
		for(int i = 0 ; i<arr.length ; i++) {
			String eachOneFromArr = arr[i];
			int lengthOfEachStr = eachOneFromArr.length();
			if( maxLength < lengthOfEachStr ) {
				maxLength = lengthOfEachStr;
				maxString = arr[i];
			}
		}
		System.out.println("Max length is "+maxLength+" and its string is-- "+maxString);
		
	}

}
