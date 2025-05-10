//Print frequency of each word from given String.

import java.util.Arrays;

public class PrintFreqOFEachWordFromLongStr_69_imp {

	public static void main(String[] args) {
		String str = "Hi Hello  Hi Hi Techno Credits Techno anuja";
		findFreqOFEachWord(str);

	}

	private static void findFreqOFEachWord(String str) {
		String[] arr = str.split(" ");//create a array
		System.out.println(Arrays.toString(arr));
		for(int i = 0 ; i <arr.length; i ++ ) {//iterate entire array and extract
			//ech in name
			int freq =0; //freq should start from 0 for each new word
			String name = arr[i];
			if(!name.equals("")) {//if name already processed then update to ""so do not 
				//process it again and skip 
				for(int  j= 0 ; j < arr.length ; j++) {
					if(arr[j].equals(name)) {
						freq++;
						arr[j] = "";//name is iterated and freq is updated so update that 
						//word to ""again so that avoid dups
					}
				}
				System.out.println(name+"-->"+freq);
			}
		}

		
	}
}
