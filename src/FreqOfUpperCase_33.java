
public class FreqOfUpperCase_33 {

	public static void main(String[] args) {
		FreqOfUpperCase_33 freqOfUpperCase = new FreqOfUpperCase_33();
		String input = "AABcBBBAdeddd";
		freqOfUpperCase.findFreqOFUpperCase(input);
	}

	public void findFreqOFUpperCase(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				int indexOf = input.indexOf(ch);
				if (indexOf == i) {
					countFreq(input, ch);
				}
			}
		}
	}

	public void countFreq(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (ch == input.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch + "---->" + count);
	}
}
