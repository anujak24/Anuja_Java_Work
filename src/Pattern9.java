//*#*#*
//*#*
//*#*#*
//*#*
public class Pattern9 {

	public static void main(String[] args) {
		for(int i = 1 ; i<=4 ; i++) {
			if(i%2!=0) {
				for(int  j = 1 ; j<=5 ; j++) {
					if (j%2==0) {
						System.out.print("#");
					} else {
						System.out.print("*");

					}	
				}
				System.out.println();
			} else {
				for(int  j = 1 ; j<=3 ; j++) {
					if (j%2==0) {
						System.out.print("#");
					} else {
						System.out.print("*");

					}
			}
				System.out.println();
		}
	}

}
}
