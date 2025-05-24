package CollectionPractice;
import java.util.*;
public class GetAllPrimeNumFromList {

	public static void main(String[] args) {
		int num1 = 10 ;
		int num2 = 30 ;
		ArrayList<Integer>list1 = new ArrayList<>();
		for( int i = num1 ; i<=num2 ; i++) {
			list1.add(i);
		}
		findPrime(list1);
	}
	
	public static void findPrime(ArrayList<Integer>list1) {
		boolean flag =  false ;
		ArrayList<Integer>list2 =  new ArrayList<>();
		for( int i = 0 ; i<list1.size() ; i++) {
			flag = isPrime(list1.get(i));
			if(flag) {
				list2.add(list1.get(i));
			}
		}
		System.out.println(list2);
		
		
	}
	
	public static boolean isPrime(int num) {
		for(int i = 2 ; i<=Math.sqrt(num) ; i++) {
			if(num % i == 0) {
				return false; 
			}
		}
		return true;
	}
	
	

}
