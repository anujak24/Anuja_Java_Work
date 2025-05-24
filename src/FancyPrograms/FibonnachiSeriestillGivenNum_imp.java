package FancyPrograms;
import java.util.Scanner;
public class FibonnachiSeriestillGivenNum_imp {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms:");
		int num = sc.nextInt();
		System.out.println("User requested till the given digit fiboonachi");
		printFibonachiSeries(num);
	}
	
	public static void printFibonachiSeries(int num) {
		//0 1 1 2 3 5 8 
		int firstOne = 0 ;
		int secodOne = 1 ;
		System.out.print(firstOne +" "+secodOne);
		int nextNum =  0 ;
		
		for(int i = 2 ; i<=num ; i++) {
			nextNum = firstOne + secodOne ;
			
			System.out.print(" "+nextNum +" ");
			firstOne = secodOne;
			secodOne = nextNum;  
		}
	}
	

}
