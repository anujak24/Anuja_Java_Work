package IMP;
import java.util.Arrays;

public class ShiftAllZeroToLeftUsingOnlyOneArr_imp {

	public static void main(String[] args) {
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		int nonZeroIndexj = 0;
		for(int i =  0 ; i<arr.length ; i++) {
			if(arr[i]!=0) {
				arr[nonZeroIndexj] = arr[i];
				nonZeroIndexj++;
			}
		}
		
		while (nonZeroIndexj < arr.length) {
			arr[nonZeroIndexj] = 0 ;
			nonZeroIndexj ++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
