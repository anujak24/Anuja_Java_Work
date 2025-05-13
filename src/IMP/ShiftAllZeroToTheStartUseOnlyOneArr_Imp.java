package IMP;
import java.util.Arrays;

public class ShiftAllZeroToTheStartUseOnlyOneArr_Imp {

	public static void main(String[] args) {
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		int zeroCount = arr.length-1;
		
		for(int i = arr.length-1 ; i>=0 ; i--) {
			if(arr[i]!=0) {
				arr[zeroCount]=arr[i] ;
				zeroCount--;
			}
		}
		while(zeroCount>=0) {
			arr[zeroCount] = 0;
			zeroCount--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
