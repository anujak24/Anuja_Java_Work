/*Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};*/
public class ArrayMiddleChar {

	public static void main(String[] args) {
		ArrayMiddleChar arrayMiddleChar = new ArrayMiddleChar();
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		arrayMiddleChar.printMiddleCharFromArrayNames(names);
	}
	
	public void printMiddleCharFromArrayNames(String[] names) {
		for(int i = 0 ; i<names.length ; i++) {
			if(names[i].length()%2==0) {
				System.out.println("Middle char form the name is "+names[i]+" is "+names[i].charAt(names[i].length()/2-1)+" ");
			} else {
				System.out.println("Middle char form the name is "+names[i]+" is "+names[i].charAt(names[i].length()/2)+" ");

			}
		}
	}

}
