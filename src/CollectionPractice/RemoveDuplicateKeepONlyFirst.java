package CollectionPractice;

//Remove all duplicate occurances of given name from arrayList except first occurance. 
//Remove all duplicate occurances of given name from arrayList except first occurance. 

import java.util.*;

public class RemoveDuplicateKeepONlyFirst {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(15);
		al.add("Anuja");
		al.add("Fazrana");
		al.add("Nitesh");
		al.add("Fazrana");
		al.add("Krishna");
		al.add("Nitesh");
		al.add("Fazrana");
		al.add("PremLata");
		al.add("Nitesh");
		al.add("Nitesh");
		al.add("Nitesh");
		al.add("Anuja");

		System.out.println(al);
		//System.out.println(al.indexOf("Anuja"));
		//System.out.println(al.lastIndexOf("Anuja"));


		for (int i = 0; i < al.size(); i++) {
			String currentName = al.get(i);
			// run till no duplciate and only one remian
			while (al.indexOf(currentName) != al.lastIndexOf(currentName)) {

				// if found duplicate then only proceed
				al.remove(al.indexOf(currentName)); // keep removing

			}

		}

		System.out.println(al);

	}

}