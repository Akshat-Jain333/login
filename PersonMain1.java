package java8;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonMain1 {
	public static void main(String[] args) {
		/*
		 * TreeSet<String> set1= new TreeSet<>(); set1.add("Chennai");
		 * set1.add("Delhi"); set1.add("Ahmedabad"); System.out.println(set1);
		 */

		int id1[] = { 1009, 1002, 1004, 1001 };
		String name[] = { "Akshat", "Ashu", "Raj", "Simran" };
		float salary[] = { 2000, 1500, 1200, 1000 };

		TreeSet<Person> treeset = new TreeSet<>();
		
		new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
			};
		
	
		Person person[] = new Person[4];
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person(id1[i], name[i], salary[i]);
			//System.out.println(treeset.size());

			treeset.add(person[i]);
			//System.out.println(i);
		}

		for (Person person1 : treeset) {
			System.out.println(person1);
		}
	}

}
