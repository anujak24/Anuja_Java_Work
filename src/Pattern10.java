//1A 
//2B 3C 
//4D 5E 6F 
//7G 8H 9I 10J 
public class Pattern10 {

	public static void main(String[] args) {
		char ch = 'A';
		int count = 1 ;
		for(int i = 1 ;  i<=4 ; i++) {
			for(int j = 1 ; j<=i ; j++) {
				System.out.print(""+count+ch +" ");
				ch++;
				count++;
			}
			System.out.println();
		}
	}

}
