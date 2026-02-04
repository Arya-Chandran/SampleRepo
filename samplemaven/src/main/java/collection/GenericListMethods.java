package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		List <String> a= new ArrayList<String>();
		a.add("green");
		a.add("blue");
		a.add("red");
		a.add("green");
		a.add("black");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.set(1,"white"));
		System.out.println(a);
		System.out.println((a.indexOf("red")));
		System.out.println(a.lastIndexOf("green"));
		a.remove("green");
		System.out.println(a);
		System.out.println(a.contains("blue"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}
}
