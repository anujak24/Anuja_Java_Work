package StaticNonStatic;

public class StaticToStatic {
	static int num = 100;
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("B");
		 int a = 10;
		System.out.println(a);
		num = num +10;
		System.out.println(num); //110
		methodA () ;

	}
	
	public static void methodA () {
		methodB();
		System.out.println("B " +num);

	}
	
	public static void methodB() {

	}

}
