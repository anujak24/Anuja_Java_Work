import java.util.Scanner;

public class CountGivenCharFromString_20 {

	public static void main(String[] args) {
		
		CountGivenCharFromString_20 countEachCharInString_20 = new CountGivenCharFromString_20();
		String inputStr = "aakanskha";
		System.out.println("Input string is " +inputStr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the char which you want to count in a given string");
		char ch = sc.next().charAt(0);
		System.out.println("code will find the char '"+ch+ "'in a given string "+inputStr);
		countEachCharInString_20.countEachCharFromString(inputStr, ch);
		
	}

	private void countEachCharFromString(String inputStr , char ch) {
		int count = 0 ;
		for(int i = 0 ; i<inputStr.length() ; i++) {
			if(inputStr.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Given char " +ch+ " is present in string "+inputStr +" at " +count +" times");
	}

}
