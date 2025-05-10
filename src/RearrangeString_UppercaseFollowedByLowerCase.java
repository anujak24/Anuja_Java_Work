//rearrange string and sum of all digits present
public class RearrangeString_UppercaseFollowedByLowerCase {

	public static void main(String[] args) {
		String input = "Te1ch6NOCre3dits" ;
		System.out.println("Input is: "+input);
		reArrangeString(input);
	}
	
	public static void 	reArrangeString(String input) {
		String  digitStr = "";
		String upperStr = "" ; 
		String lowerStr = "" ; 
		int sum = 0 ;

		for(int i = 0 ; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)) {
				
				upperStr+=  ch ;
			}//addition of all digits
			else if(Character.isDigit(ch)) {
				sum+=  Character.getNumericValue(ch) ;
			}
			else if(Character.isLowerCase(ch)) {
				lowerStr = lowerStr + ch ;
			}
		}
		System.out.println("Output is : "+upperStr+sum+lowerStr);
	}

}
