package FancyPrograms;

import java.util.Arrays;
//one more way is with map
public class CheckIfAnagramUseAsciiAndArraySort_105 {

	public static void main(String[] args) {
		String name ="Listen" ;
		String name2 = "Silent";
		String  invalidName = "Techno";
		String invalidName2 = "chnott";
		
		//checkWithAsciiIfAnagram(name ,name2 );
		//checkWithAsciiIfAnagram(invalidName , invalidName2);
		checkWithArraySort(name ,name2);
		checkWithArraySort (invalidName ,invalidName2);
	}
	
	public static void checkWithAsciiIfAnagram(String name , String name2) {
		name = name.toLowerCase().trim();
		name2 = name2.toLowerCase().trim();
		int asciiSum =  0 ;
		int asciiSum2 =  0 ;
		
		for(int i = 0 ,j = 0 ; i< name.length() ; i++,j++) {
			char ch1 = name.charAt(i);
			char ch2 = name2.charAt(j);
			asciiSum += ch1 ;
			asciiSum2 += ch2 ;
		}
		
		if(asciiSum==asciiSum2) {
			System.out.println("its anagram");
		}else System.out.println("not a anagram");
		
	}
	public static void checkWithArraySort(String name , String name2) {
		 name  = name.toLowerCase();
		 name2 = name2.toLowerCase();
		char arr1[] = name.toCharArray();
		//System.out.println(Arrays.toString(arr1));
		 Arrays.sort(arr1);
		 char arr2[] = name2.toCharArray();
			//System.out.println(Arrays.toString(arr1));
			 Arrays.sort(arr2);
			 
			 if(Arrays.equals(arr1, arr2)) {
				 System.out.println("its palindrome");
			 } else System.out.println("Its not");
		 
	}

}
