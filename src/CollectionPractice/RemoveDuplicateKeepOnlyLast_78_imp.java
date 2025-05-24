package CollectionPractice;
//Remove all duplicate occurances of given name from arrayList except first occurance. 
import java.util.*;
public class RemoveDuplicateKeepOnlyLast_78_imp {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(100);
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
		al.add("Aashvi");
		
		System.out.println(al);
		
		for(int  i = 0; i < al.size(); i++) {
			while(al.lastIndexOf(al.get(i))!=al.indexOf(al.get(i))) {
				al.remove(al.lastIndexOf(al.get(i)));
			}	
		}
		System.out.println("---------------------------------");

		System.out.println(al);
		
	}
}
