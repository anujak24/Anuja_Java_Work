package StaticNonStatic;

public class NonStaticToStatic {

	public static void main(String[] args) {
		System.out.println("Main");
		staticB();
	}
	
	public static void staticB() {
		System.out.println("I am in static B");
		NonStaticToStatic nonStaticToStatic = new NonStaticToStatic();
		nonStaticToStatic.nonStaticA();
	}
	
	public  void nonStaticA() {
		System.out.println("I am in nonstatic");
	}
	

	
	

}
