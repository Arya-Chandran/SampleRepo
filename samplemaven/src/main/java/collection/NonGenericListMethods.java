package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		List a= new ArrayList();
		a.add("green");
		a.add('a');
		a.add(345);
		a.add("green");
		a.add(4.5f);
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.set(1,"white"));
		System.out.println(a);
		System.out.println((a.indexOf(345)));
		System.out.println(a.lastIndexOf("green"));
		a.remove("green");
		System.out.println(a);
		System.out.println(a.contains("blue"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
