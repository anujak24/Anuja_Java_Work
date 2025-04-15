/*Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};*/

import java.util.Arrays;

public class ArrayPrintNamesgreterthan6Length {

	public static void main(String[] args) {
		ArrayPrintNamesgreterthan6Length obj = new ArrayPrintNamesgreterthan6Length();
		String names[] = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		int[] num = {10,30,-45,66,-10};
		obj.printNames(names);
		obj.printCountOfPositiveNum(num);
	}

	private void printNames(String[] names) {
		for(int i = 0 ; i<names.length ; i++) {
			if(names[i].length()>=6) {
				System.out.println("Names more than 6 length from given array " +Arrays.toString(names)+ "  is "+ "\n"+names[i]);
			}
		}
		
	}
	
	private void printCountOfPositiveNum(int[] num) {
		int count =0 ;
		for(int i = 0 ; i<num.length; i++) {
			if(num[i]>0) {
				count++;
			}
		}
		System.out.println("Positive nums from given array "+Arrays.toString(num)+" is "+count);
	}

}
