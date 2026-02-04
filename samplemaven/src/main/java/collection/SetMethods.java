package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set <String> a = new HashSet <String> ();
		a.add("apple");
		a.add("banana");
		a.add("orange");
	
		Set <String> b = new HashSet <String> ();
		b.add("grapes");
		b.add("watermelon");

		a.addAll(b);
		System.out.println(a);
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		System.out.println(b.isEmpty());
		System.out.println(b.remove("grapes"));
		System.out.println(b);
		System.out.println(a.removeAll(b));
		System.out.println(a);
		System.out.println(a.size());
	    a.clear();
		System.out.println(a);
		
	}

}
