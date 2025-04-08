package IMP;

public class FreqOfEachCharInString_32_imp {
	public static void main(String[] args) {
		String input = "aakanksha";
		getFreqOfEachChar(input);
	}
	
	public static void getFreqOfEachChar(String input) {
		for(int i = 0 ; i <input.length();i++) {
			char ch = input.charAt(i);
			int indexOfEachChar = input.indexOf(ch);
			if(i==indexOfEachChar) {
				countCharFreq(input, ch);
			}
		}
	}
	
	public static void countCharFreq(String input, char ch) {
		int freqCount = 0 ;
		for(int i = 0 ; i <input.length();i++) {
			char ch1 = input.charAt(i);
			if(ch1==ch) {
				freqCount++;
			}
		}
		System.out.println(ch+"-->"+freqCount);
	}
}
