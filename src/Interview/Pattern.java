package Interview;
/*
1
2 3
3 4 5
4 5 6 7*/
public class Pattern {
	public static void main(String[] args) {
		int print1 ;
		for(int i = 1 ; i<=4 ; i++) {
			int newCount = 0 ;
			for(int j = 1 ; j<=i ; j++) {
				print1= i+newCount;
				System.out.print(print1 +" " );
				newCount++;
			}
			System.out.println();
		} 
	}
}

