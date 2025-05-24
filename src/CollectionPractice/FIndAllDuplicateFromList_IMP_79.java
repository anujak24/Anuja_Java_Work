package CollectionPractice;
//Find out all the duplicate elements from given arrayList.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FIndAllDuplicateFromList_IMP_79 {
	public static void main(String[] args) {
		
		Integer[] inputArr = {10, 99, 10, 10, 77, 55, 46, 99};
		List<Integer> list1 = Arrays.asList(inputArr);
		System.out.println(list1);
		
		
		for(int i = 0 ; i<list1.size(); i++) {

			int firstIndex = list1.indexOf(list1.get(i));
			int lastIndex = list1.lastIndexOf(list1.get(i));
			
			if(firstIndex != lastIndex && firstIndex==i) {
				System.out.println(list1.get(i)+" ---> "+firstIndex+"--->"+lastIndex+"---------"+i);
			}
		}	
	}
}
