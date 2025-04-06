
public class ReturnCharOfGivenAscii27 {

	public static void main(String[] args) {
		ReturnCharOfGivenAscii27 returnCharOfGivenAscii27 = new ReturnCharOfGivenAscii27();
		int ascii_1 = 65;
		int ascii_2 = 90;
		int ascii_3 = 55;
		int ascii_4 = 128;

		char ch1 = returnCharOfGivenAscii27.returnTheCharOfGivenAscii(ascii_1);
		char ch2 = returnCharOfGivenAscii27.returnTheCharOfGivenAscii(ascii_2);
		char ch3 = returnCharOfGivenAscii27.returnTheCharOfGivenAscii(ascii_3);
		char ch4 = returnCharOfGivenAscii27.returnTheCharOfGivenAscii(ascii_4);

		System.out.println("Char value of given Ascii " + ascii_1 + " is " + ch1 + " .");
		System.out.println("Char value of given Ascii " + ascii_2 + " is " + ch2 + " .");
		System.out.println("Char value of given Ascii " + ascii_3 + " is " + ch3 + " .");
		System.out.println("Char value of given Ascii " + ascii_4 + " is " + ch3 + " .");


	}

	private char returnTheCharOfGivenAscii(int ascii_1) {
		if(ascii_1<0 || ascii_1>127) {
			System.out.println("Please input valid ascii, " +ascii_1+ " is not a correct one");
		} else {
			char ch = (char) ascii_1;
			return ch;
		}
		return 0;
		
	}

}
