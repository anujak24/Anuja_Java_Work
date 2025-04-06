
public class GetAsciiOfAlphabete26 {

	public static void main(String[] args) {
		GetAsciiOfAlphabete26 GetAsciiOfAlphabete = new GetAsciiOfAlphabete26();
		char inputCh = 'A';
		char inputCh1 = 'x';
		char inputCh2 = ' ';
		char inputCh3 = '.';
		GetAsciiOfAlphabete.getAscii(inputCh);
		GetAsciiOfAlphabete.getAscii(inputCh1);
		GetAsciiOfAlphabete.getAscii(inputCh2);
		GetAsciiOfAlphabete.getAscii(inputCh3);

	}

	private void getAscii(char ch) {
		int acsii = ch;
		System.out.println("Ascii of given char " + ch + " is: " + acsii);
		System.out.println("---------------------");
	}
}
