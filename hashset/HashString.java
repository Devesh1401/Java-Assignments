package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashString {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Alastair");
		set.add("Ian");
		set.add("Ben");
		set.add("Liam");
		System.out.println(set);
		System.out.println(set.size());
		
		set.add("Ben");
		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println(set.contains("liam"));
		System.out.println(set.contains("Liam"));
		
		set.remove("Ian");
		System.out.println(set);
		System.out.println(set.size());
		
		
	}

}
