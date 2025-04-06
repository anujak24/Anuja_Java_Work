
public class PrintAllAsciiforAtoZ_28AndReverseToprintChar {
//this program will give range of all ascii for A to z and we will crossc heck is 65 to 100 range ascii will print what
//NOte: 
//Range of ascci is:
//	48 to 57 all nums from 0 to 9;
//	65 to 90 capital A to Z
//	97 to 122 small a to z;
	
		public static void main(String[] args) {
		PrintAllAsciiforAtoZ_28AndReverseToprintChar obj = new PrintAllAsciiforAtoZ_28AndReverseToprintChar();
		obj.printAllCHarOFValidascii();
		obj.printAsciiofGivenRangeofChar();
		obj.printCharofGivenAscii();
	}

	private void printAllCHarOFValidascii() {
		System.out.println(" ");
		System.out.println("Below code will print all valid ascii num and its corrosponding char");
		//from 0 to 32 all are non printable chars so it will not displayed in console
		//valid printable ascii range start form 33
		for (int i = 0; i <= 127; i++) {
			char ch = (char) i;
			System.out.println(i + " its char:- " + ch);
		}
	}

	private void printAsciiofGivenRangeofChar() {
		System.out.println(" ");
		System.out.println("Below code will print its ascii and corrosponding char value");
		for (int num = 65; num <= 100; num++) {
			char ch = (char) num;
			System.out.println(num + " its char:- " + ch);
		}
	}

	private void printCharofGivenAscii() {
		System.out.println(" ");
		System.out.println("Below code will print its char and corrosponding Ascii value");
		for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			int ascii = ch1;
			System.out.println(ch1 + " its Ascii:- " + ascii);
		}
	}

}
