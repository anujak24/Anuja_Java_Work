package IMP;

public class FindDupAndUniqFromString {

	public static void main(String[] args) {
		String name = "AabcAAkAk";
		getDuplicate(name.toLowerCase());
		getUnique(name.toLowerCase());
	}
	
	public static void getDuplicate(String name) {
		System.out.println("Below are the uniq chars");
		for(int  index = 0 ; index<name.length(); index++) {
			char ch = name.charAt(index);
			int lastIndex = name.lastIndexOf(ch);
			int indexOf = name.indexOf(ch);
			if(lastIndex == indexOf) {
				System.out.println(ch);
			}
		}
	}
	
	public static void getUnique(String name) {
		System.out.println("Below are the dups chars");
		String temp = "";
		
		for(int  index = 0 ; index<name.length(); index++) {
			char ch = name.charAt(index);
			int lastIndex = name.lastIndexOf(ch);
			int indexOf = name.indexOf(ch);
			if(lastIndex != indexOf) {
				if(!temp.contains(name.valueOf(ch))) {
					System.out.println(ch);
					temp = temp + ch ;
					
				}
			}
		}

	}
	
	

}
