
public class PrintTable1To5 {
	public static void main(String[] args) {
		PrintTable1To5 printTable1To5 = new PrintTable1To5();
		int startRange = 2;
		int lastTable = 6;
		printTable1To5.printTable(startRange, lastTable);
	}
	public void printTable(int num1 , int num2) {
		for(int i = num1; i<=num2; i++) {
			for(int j = 1 ;j<=10 ; j++) {
				System.out.print(i*j +" ");
			}
			System.out.println("\n-----------------------");
		}
	}
}
