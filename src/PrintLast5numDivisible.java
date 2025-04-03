import java.util.Scanner;

public class PrintLast5numDivisible {

	public static void main(String[] args) {
		PrintLast5numDivisible printLast5numDivisible = new PrintLast5numDivisible();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please send start int");
		int input1 = sc.nextInt();
		System.out.println("Please send second int");
		int input2 = sc.nextInt();
		printLast5numDivisible.printLast5NumDivisibleBy5(input1, input2);
	}

	private void printLast5NumDivisibleBy5(int num1, int num2) {
		int count = 0;// intialise local variable
		for (int i = num2; num1 <= num2; num2--) {
			if (num2 % 5 == 0) {
				count++;
				System.out.println(num2);
				if (count == 5) {
					break;
				}

			}
		}

	}

}
