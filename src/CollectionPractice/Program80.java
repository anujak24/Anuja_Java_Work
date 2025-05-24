package CollectionPractice;
//Find out all the duplicate elements from 
//given arrayList and print them with their index.

import java.util.ArrayList;

public class Program80 {

	public static void main(String[] args) {
		ArrayList<Integer> listOfNums = new ArrayList<Integer>();
		listOfNums.add(10);
		listOfNums.add(99);
		listOfNums.add(10);
		listOfNums.add(10);
		listOfNums.add(77);
		listOfNums.add(55);
		listOfNums.add(46);
		listOfNums.add(99);
		listOfNums.add(99);
		System.out.println("listOfNums : " + listOfNums);
		findDuplicate(listOfNums);
	}
	
	public static void findDuplicate(ArrayList<Integer> listOfNums) {
		for(int i = 0 ; i<listOfNums.size(); i++) {
			if(listOfNums.indexOf(listOfNums.get(i)) != 
					listOfNums.lastIndexOf(listOfNums.get(i)) && i==listOfNums.indexOf(listOfNums.get(i))) {
				System.out.println("duplicate is: "+ listOfNums.get(i)+" --> at index" +
						getIndexList(listOfNums , listOfNums.get(i)));
				System.out.println("----------------------");
					
					
			}
		}
	}
	
	public static ArrayList<Integer> getIndexList(ArrayList<Integer> listOfNums , int num){
		ArrayList<Integer> indexList = new ArrayList<Integer>();

		for(int i = 0 ; i<listOfNums.size(); i++) {
			if(num==listOfNums.get(i)) {
				indexList.add(i);
			}
		}
		return indexList;
	}

}
