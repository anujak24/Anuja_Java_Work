package StaticNonStatic;

public class NonStatiToNonStatic {

	public static void main(String[] args) {
		System.out.println("I am in main");
		NonStatiToNonStatic nonStatiToNonStatic = new NonStatiToNonStatic();
		nonStatiToNonStatic.nonStaticA();
		
	}
	
	public void nonStaticA() {
		System.out.println("I am in nonStatic A");
		nonStaticB();
		methodC();

	}
	
	public void nonStaticB() {
		System.out.println("I am in nonStatic B");
	}
	
	public static void methodC() {
		System.out.println("non static C");
	}

}
