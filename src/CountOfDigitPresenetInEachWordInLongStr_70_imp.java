import java.util.Arrays;

public class CountOfDigitPresenetInEachWordInLongStr_70_imp {

	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		processData(str);
	}
	
	public static void processData(String str) {
		String[] names = str.split(" ");
		System.out.println(Arrays.toString(names));
		for(int i = 0 ; i<names.length ; i++) {
			String word = names[i];
			int count = 0 ;
			for(int j = 0 ; j < word.length() ; j++) {
				char ch = word.charAt(j);
				if(Character.isDigit(ch)) {
					count++;
				}
			}
			System.out.println(word+"--->"+count);
		}
	}

}
