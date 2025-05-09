package IMP;

public class FreqOfEachCharInString_32_use2For_imp {

	public static void main(String[] args) {
		FreqOfEachCharInString_32_use2For_imp obj = new FreqOfEachCharInString_32_use2For_imp();
		String input = "aakankshaw";
		obj.getFreqOfEachChar(input);
	}

	public void getFreqOfEachChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			int count = 0;//reset to 0 for each new char
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
