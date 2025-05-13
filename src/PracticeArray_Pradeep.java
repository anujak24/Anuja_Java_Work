//[2,4,5,8,10]
//[6] 
//op = [0,1] --index whose two nums addition in 6

import java.util.Arrays;

public class PracticeArray_Pradeep {

	public static void main(String[] args) {
		int[] arr1 = {2,4,5,8,10,4};
		int arr2[] = {50};
		processData(arr1, arr2);
	}
	
	public static void processData(int[] arr1, int arr2[] ) {
		int num1 = 0 ;
		int num2 = 0 ; 
		int sum = arr2[0] ;
		int[] num = new int[2];
		boolean found = false;
		
		for (int  i = 0 ; i<arr1.length ; i++) {
			num1 = arr1[i];
			for(int j = i+1 ;j<arr1.length ; j++) {
				num2 = arr1[j];
				if(num1+num2==sum) {
//					num[0] = i;
//					num[1] = j;
					System.out.println(num1+"-->"+i+"\n"+num2+"-->"+j);
					found = true; 
					
//				}else {
//					System.out.println("No sum to match with any index, try next time ,"
//							+ " current given sum is "+sum);
//				}
			}
		}
		//System.out.println(Arrays.toString(num));
	}
		if(found == false) {
			System.out.println("No sum to match with any index, try next time ,"
							+ " current given sum is "+sum);
			}
		}

}
