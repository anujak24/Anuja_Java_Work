package FancyPrograms;

public class CheckIfPrimeOrNot_Imp {

	public static void main(String[] args) {
		int num = 12;
		int count = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				count++; //return false 
			} 
		}
		if (count >= 1) {
			System.out.println("Its not a prime");
		} else
			System.out.println("Its prime");
	}

}
