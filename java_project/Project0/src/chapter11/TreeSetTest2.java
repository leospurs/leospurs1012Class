package chapter11;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		 
		TreeSet<Person> set = new TreeSet<>();
		
		set.add(new Person("SON", 28));
		set.add(new Person("LEE", 21));
		set.add(new Person("HWANG",26));
		set.add(new Person("KIM",26));
		
		Iterator<Person> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
