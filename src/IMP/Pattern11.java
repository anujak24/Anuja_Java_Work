//     1
//    22
//   333
//  4444
// 55555
//666666
package IMP;

public class Pattern11 {

	public static void main(String[] args) {
		for(int i = 1 ; i<=6 ; i++) {
			for(int k = 6 ; k> i ; k--) {
				System.out.print(" ");
			}
			for(int  j = 1 ; j<=i ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
