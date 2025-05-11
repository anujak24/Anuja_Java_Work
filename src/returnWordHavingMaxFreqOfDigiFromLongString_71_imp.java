//return the word having highest digits in the given String .

import java.util.Arrays;

public class returnWordHavingMaxFreqOfDigiFromLongString_71_imp {

	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		processData(str);
	}
	
	public static void processData(String str) {
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		String maxWord = "";
		int max = 0;
		
		for(int i = 0 ; i<arr.length ; i++) {
			String word = arr[i];
				int countOfDigitsInEach = 0;

			for(int j = 0 ; j <word.length(); j++) {
				
				char ch = word.charAt(j);
				if(Character.isDigit(ch)) {
					countOfDigitsInEach++;
				}
				if (max < countOfDigitsInEach) {
					max = countOfDigitsInEach;
					maxWord = word;
				}
				
			}
		}
		System.out.println(max+"--->"+maxWord);

	}

}
