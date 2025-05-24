package FancyPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondMaxFromArayAcceptInputFromUser_101_imp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input array size");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("We got the size now Enter the input int num one by one");
		
		for(int i = 0 ; i<size ; i++) {
			arr1[i]=sc.nextInt();
			System.out.println("Num is: "+arr1[i] );
		}
		sc.close();
		System.out.println("Input array is: "+Arrays.toString(arr1) +" Thanks");
		findSecondMax(arr1);
	}
	
	public static void findSecondMax(int arr1[]) {
		int max = arr1[0];
		int secondMax = arr1[1];
		
		if(max < secondMax) {
			secondMax = max; 
		}
		
		for(int i = 2 ; i<arr1.length ; i++) {
			if(max < arr1[i]) {
				secondMax = max ;
				max = secondMax;
			} 
			if(secondMax < arr1[i]) {
				secondMax = arr1[i];
		}
	}
		System.out.println(secondMax);
	}
}
