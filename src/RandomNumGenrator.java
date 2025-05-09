import java.util.Random;

public class RandomNumGenrator {
	static int num;
	static char ch;
	static String name;

	public static void main(String[] args) {
		
		
		Random random = new Random();
		num = random.nextInt(10);
		System.out.println("Random num is " + num);

		ch = 'A';

		ch = (char) (ch + num);
		System.out.println("Random char is " + ch);

		name = ch+" abc1";
		System.out.println("Random String is " + name);

	}

}
