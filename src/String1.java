
public class String1 {

	public static void main(String[] args) {
		String name = "An234nuja" ;
		int lengthOfGivenString = name.length(); //str.lenghth()
		System.out.println("INput string is "+ name + " And its length is "+lengthOfGivenString );
		
		for(int i = 0 ; i<lengthOfGivenString ; i++) {
			//str.charAt(index);
			char ch = name.charAt(i);
			int index = name.indexOf(ch) ;
			System.out.println(ch);
		}

	}

}
