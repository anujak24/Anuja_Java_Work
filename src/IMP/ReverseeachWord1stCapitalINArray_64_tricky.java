package IMP;
import java.util.Arrays;

/*temp = names[i] ; 
names[i] = names[j] ;
names[j] = temp ;*/ 
public class ReverseeachWord1stCapitalINArray_64_tricky {

	public static void main(String[] args) {
		String names[] = {"Tech", "Aashvi", "Credits", "Ansh"};
		System.out.println("Input arr is: "+Arrays.toString(names));
		getReverseOfEachNameAnd1stLetterCaps(names);
	}
	
	public static void getReverseOfEachNameAnd1stLetterCaps (String[] names) {
		String temp = "";
		String[] output = new String[names.length];
		
		for(int i = names.length-1 ; i>= 0 ; i--) {
			output[i] = processData(names[i]);
		}
		
		System.out.println("Output arr is: "+Arrays.toString(output));

	}
	//one way to do so
	/*
	 * public static String processData(String singleEntity) { singleEntity =
	 * singleEntity.toLowerCase(); String outputSingleEntity = "" ;
	 * 
	 * outputSingleEntity = singleEntity.charAt(singleEntity.length()-1)
	 * +outputSingleEntity ; outputSingleEntity =
	 * outputSingleEntity.toUpperCase().trim();//we got 1st upper case for(int i =
	 * singleEntity.length()-2; i>=0 ; i--) { outputSingleEntity =
	 * outputSingleEntity + singleEntity.charAt(i); }
	 * 
	 * return outputSingleEntity; }
	 */
	
	//other way to do so is use substring
	public static String processData(String singleEntity) {
		String output = "" ;
		for(int i = singleEntity.length()-1 ; i>=0 ; i--) {
			output = output	+singleEntity.charAt(i);
		}
		return output.substring(0,1).toUpperCase()+output.substring(1);
		
	}
	

}

