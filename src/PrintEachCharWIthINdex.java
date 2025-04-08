

public class PrintEachCharWIthINdex {

	public static void main(String[] args) {
		PrintEachCharWIthINdex  printEachCharWIthINdex = new PrintEachCharWIthINdex();
		String input = "india";
		printEachCharWIthINdex.printCharAndItsIndex(input);
	}
	
	public void printCharAndItsIndex(String input) {
		for (int i = 0 ; i <input.length();i++) {
			char ch = input.charAt(i);
			System.out.println(ch+"-->"+i);
		}
	}

}
