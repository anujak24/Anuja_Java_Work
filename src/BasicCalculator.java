
public class BasicCalculator {
	int a = 10;
	int b = 20;
	int sum;
	int diff;
	int multi;
	int div;
	int mod;

	public void add() {
		sum = a + b;
		System.out.println("Sum is " + sum + "\n");
	}

	public void diff() {
		diff = a - b;
		System.out.println("Differnce  is " + diff + "\n");

	}

	public void multi() {
		multi = a * b;
		System.out.println("Multiplication  is " + multi + "\n");

	}

	public void div() {
		div = b / a;
		System.out.println("Division  is " + div + "\n");

	}

	public void findMod() {
		mod = b % a;
		System.out.println("Mod  is " + mod + "\n");

	}

	public static void main(String[] args) {
		BasicCalculator basicCalculator = new BasicCalculator();
		basicCalculator.add();
		basicCalculator.diff();
		basicCalculator.multi();
		basicCalculator.div();
		basicCalculator.findMod();

	}

}
