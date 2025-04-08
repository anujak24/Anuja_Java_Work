
public class FreqOfEachCharInString_32_use2For_imp {

	public static void main(String[] args) {
		FreqOfEachCharInString_32_use2For_imp obj = new FreqOfEachCharInString_32_use2For_imp();
		String input = "aakanksha";
		obj.getFreqOfEachChar(input);
	}

	public void getFreqOfEachChar(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char currentCh = input.charAt(i);
			int indexOfChar = input.indexOf(currentCh);
			if (indexOfChar == i) {
				for (int j = 0; j < input.length(); j++) {
					char tobeMatchedChar = input.charAt(j);
					if (currentCh == tobeMatchedChar) {
						count++;
					}
				}
				System.out.println(currentCh + "-->" + count);

			}

		}

	}
}
