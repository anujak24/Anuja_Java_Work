package FancyPrograms;

import java.awt.geom.Arc2D.Double;

//An Armstrong number is one where the sum of each digit raised to the
//power of the number of digits equals the original number.
public class CheckArmstrongNum_104_imp {

	public static void main(String[] args) {
		int num =  9474 ;//153
		int lastDigit = 0;
		int remainingNum = 0;
		int temp =  num;
		double armstrongNum = 0;
		String empty = " " ;
		empty =  empty + num ;
		int len = empty.length() ;
		
		while(remainingNum > 0) {
			lastDigit = num %10 ;
			armstrongNum = armstrongNum  + Math.pow(lastDigit, len);
			remainingNum = num / 10 ;
		}
		
		if(armstrongNum == temp ) {
			System.out.println("Its armstrong");
		}
	}

}
