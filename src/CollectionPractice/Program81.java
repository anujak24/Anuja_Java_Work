package CollectionPractice;

import java.util.*;

//Return the unique list of numbers from given Array. [IMP]
public class Program81 {

	public static void main(String[] args) {
		Integer[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));

		List<Integer> list2 = new ArrayList<Integer>();

		for (int num : list1) {
			if (!list2.contains(num)) {
				list2.add(num);
			}
		}
		System.out.println(list1);
		System.out.println(list2);
		list1.removeAll(list2);
		System.out.println(list1);

	}

}
