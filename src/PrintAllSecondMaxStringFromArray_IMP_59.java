/*print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", 
"aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne*/

public class PrintAllSecondMaxStringFromArray_IMP_59 {

	public static void main(String[] args) {
		PrintAllSecondMaxStringFromArray_IMP_59 printAllSecondMaxStringFromArray_IMP_59 = new PrintAllSecondMaxStringFromArray_IMP_59();
		printAllSecondMaxStringFromArray_IMP_59.findSecondMaxLen();
	}
	
	private void findSecondMaxLen() {
		String[] names =  {"Tech", "Tech", "Technocredits", 
				"aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		int secondMaxLn = 0 ;
		int maxLn = 0;
		for(int i = 0 ; i< names.length ; i++) {
			if(maxLn < names[i].length() ) {
				secondMaxLn = maxLn ;
				maxLn = names[i].length(); 
			} else if(secondMaxLn <  names[i].length() ) {
				secondMaxLn = names[i].length(); 
			}
		}
		findAllSecondMaxLengthString(names , secondMaxLn);
	}
	
	private void findAllSecondMaxLengthString(String[] names , int secondMaxLn) {
		for(int i = 0 ; i< names.length ; i++) {
			if(secondMaxLn == names[i].length() ) {
				System.out.println(names[i]+"---> string with length is "+secondMaxLn);
			}
		}	
		
	}
}	