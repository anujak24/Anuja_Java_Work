public class PrintReverseString_19 {

	public static void main(String[] args) {
		PrintReverseString_19 reverseString_19 = new PrintReverseString_19();
		String inputStr = "te ch3no";
		System.out.println("input string is " + inputStr);
		reverseString_19.reverseString(inputStr);
		
	}
	
	private static void reverseString(String inputStrinputStr) {
		int strLength = inputStrinputStr.length();
		System.out.println("Output string which printed reversed is as below");
		System.out.println();
		for(int i = strLength-1 ; i>=0 ; i--) {
			System.out.print(inputStrinputStr.charAt(i));
		}
	}

}
