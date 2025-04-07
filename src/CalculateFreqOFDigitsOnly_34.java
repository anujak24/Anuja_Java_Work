
public class CalculateFreqOFDigitsOnly_34 {

	public static void main(String[] args) {
		CalculateFreqOFDigitsOnly_34 calculateFreqOFDigitsOnly = new CalculateFreqOFDigitsOnly_34();
		String input = "AAB2cBB2BAd2ed3dd";
		calculateFreqOFDigitsOnly.calculateDigFreq(input);
	}
	
	public void calculateDigFreq(String input) {
		for(int i = 0 ; i <input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				int indexOf = input.indexOf(ch);
				if(i == indexOf) {
					countFreq(input , ch);
				}
				
			}
		}
	}
	
	public void countFreq(String input , char ch1) {
		int count = 0 ;
		for(int i = 0 ; i <input.length(); i++) {
			char ch = input.charAt(i);
			if(ch==ch1) {
				count++;
				}
			}
		System.out.println(ch1+"-->"+count);
	}

}
